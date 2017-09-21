package org.cocktail.gfc.depense.port.adapter.service;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.cocktail.gfc.depense.api.CreerSfCommand;
import org.cocktail.gfc.depense.metier.modele.sf.ServiceFaitCycleVieService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

@Named
@Singleton
public class PlSqlServiceFaitCycleVieService extends AbstractPlSqlAccess implements ServiceFaitCycleVieService {

    private static final String IF_P_ID_DEP_SF = "A_ID_DEP_SF";
    private static final String IF_P_NUM_SF = "A_NUM_SF";
    private static final String IF_P_ID_DEP_EJ = "A_ID_DEP_EJ";
    private static final String IF_P_EXE_ORDRE = "A_EXE_ORDRE";
    private static final String IF_P_REFERENCE = "A_REFERENCE";
    private static final String IF_P_COMMENTAIRE = "A_COMMENTAIRE";
    private static final String IF_P_DATE_SF = "A_DATE_SF";
    private static final String IF_P_PERS_ID_SF = "A_PERS_ID_SF";
    private static final String IF_P_PERS_ID_MODIF = "A_PERS_ID_MODIF";
    private static final String IF_P_TYAP_STRID = "A_TYAP_STRID";
    private static final String IF_P_CHAINE_LIGNES = "A_CHAINE_LIGNES";    
    
    private SimpleJdbcCall insSf;
    
    @Inject
    public PlSqlServiceFaitCycleVieService(JdbcTemplate template) {
        this.insSf = new SimpleJdbcCall(template)
                .withSchemaName(GFC_SCHEMA_NAME)
                .withCatalogName(SF_CATALOGUE)
                .withProcedureName("INS_SF");
    }
    
    public String insererSf(CreerSfCommand cmd) {
        SqlParameterSource in = new MapSqlParameterSource()
                .addValue(IF_P_ID_DEP_SF, null)
                .addValue(IF_P_ID_DEP_EJ, cmd.getEjId())
                .addValue(IF_P_EXE_ORDRE, cmd.getExeOrdre())
                .addValue(IF_P_REFERENCE, cmd.getReference())
                .addValue(IF_P_COMMENTAIRE, cmd.getCommentaire())
                .addValue(IF_P_DATE_SF, cmd.getDateSf())
                .addValue(IF_P_PERS_ID_SF, cmd.getPersId())
                .addValue(IF_P_TYAP_STRID, cmd.getNomApplication())
                .addValue(IF_P_CHAINE_LIGNES, cmd.getLignesSf());
        
        Map<String, Object> out = insSf.execute(in);
        String numeroSf = (String) out.get(IF_P_NUM_SF);
        
        return numeroSf;
    }
}
