package org.cocktail.gfc;

import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

@ConfigurationProperties("cktl.datasource")
public class CktlDatasourceProperties extends DataSourceProperties implements EnvironmentAware {

    public static final String DEFAULT_CIPHER_KEY = "DefaultCipherKey";
    public static final String DB_CONNECT_PASSWORD_GLOBAL_ENCRYPTED = "dbConnectPasswordGLOBAL.encrypted";
    public static final String ER_EXTENSIONS_ERX_BLOWFISH_CIPHER_KEY = "er.extensions.ERXBlowfishCipherKey";

    private Environment environment;
    
    private String poolName;
    private Integer maximumPoolSize = 10;
    private Boolean autoCommit = false;
    private Boolean registerMbeans = true;
    
    @Override
    public String determinePassword() {
        String password = super.determinePassword();
        return dencryptPasswordIfNeeded(password);
    }
    
    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
    
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public Integer getMaximumPoolSize() {
        return maximumPoolSize;
    }

    public void setMaximumPoolSize(Integer maximumPoolSize) {
        this.maximumPoolSize = maximumPoolSize;
    }
    
    public Boolean getAutoCommit() {
        return autoCommit;
    }

    public void setAutoCommit(Boolean autoCommit) {
        this.autoCommit = autoCommit;
    }

    public Boolean getRegisterMbeans() {
        return registerMbeans;
    }

    public void setRegisterMbeans(Boolean registerMbeans) {
        this.registerMbeans = registerMbeans;
    }

    private String dencryptPasswordIfNeeded(String password) {
        if (isEncryptedPassword()) {
            String cipherKey = System.getProperty(ER_EXTENSIONS_ERX_BLOWFISH_CIPHER_KEY);
            if (cipherKey == null) {
                cipherKey = environment.getProperty(ER_EXTENSIONS_ERX_BLOWFISH_CIPHER_KEY);
            }
            if (cipherKey == null) {
                cipherKey = DEFAULT_CIPHER_KEY;
            }
            return blowfishDecrypt(cipherKey, password);
        }
        return password;
    }
    
    private boolean isEncryptedPassword() {
        boolean isEncryptedPassword = false;
        // est-ce que ce pwd est chiffrée ?
        String isEP = System.getProperty(DB_CONNECT_PASSWORD_GLOBAL_ENCRYPTED);
        if (isEP == null) {
            isEP = environment.getProperty(DB_CONNECT_PASSWORD_GLOBAL_ENCRYPTED);
        }
        if (isEP != null && "true".equals(isEP)) {
            isEncryptedPassword = true;
        }
        return isEncryptedPassword;
    }

    private String blowfishDecrypt(String key, String val) {
        Key secretKey = getSecretKet(key);
        byte[] valHex = getAsHexa(val);
        Cipher cipher = getCipher();
        initCipher(secretKey, cipher);
        String decoded = getDecodedValue(valHex, cipher);
        return decoded;
    }
    
    private String getDecodedValue(byte[] valHex, Cipher cipher) {
        String decoded;
        try {
            decoded = new String(cipher.doFinal(valHex));
        } catch (IllegalBlockSizeException e) {
            throw new GfcException(e);
        } catch (BadPaddingException e) {
            throw new GfcException(e);
        }
        return decoded;
    }

    private void initCipher(Key secretKey, Cipher cipher) {
        try {
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
        } catch (InvalidKeyException e) {
            throw new GfcException(e);
        }
    }

    private Cipher getCipher() {
        Cipher cipher;
        try {
            cipher = Cipher.getInstance("Blowfish/ECB/NoPadding");
        } catch (NoSuchAlgorithmException e) {
            throw new GfcException(e);
        } catch (NoSuchPaddingException e) {
            throw new GfcException(e);
        }
        return cipher;
    }

    private byte[] getAsHexa(String val) {
        byte[] valHex;
        try {
            valHex = Hex.decodeHex(val.toCharArray());
        } catch (DecoderException e) {
            throw new GfcException(e);
        }
        return valHex;
    }

    private Key getSecretKet(String key) {
        Key secretKey = new SecretKeySpec(key.getBytes(), "Blowfish");
        return secretKey;
    }

}
