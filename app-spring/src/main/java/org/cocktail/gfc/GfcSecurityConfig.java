package org.cocktail.gfc;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableOAuth2Sso
public class GfcSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.antMatcher("/**")
                .authorizeRequests()
                .antMatchers("/index.html", "/home.html", "/").permitAll()
                .anyRequest().authenticated()
                .and().csrf()
//                .csrfTokenRepository(csrfTokenRepository())
//                .and()
//                .addFilterAfter(csrfHeaderFilter(), CsrfFilter.class)
        ;
    }
}
