package org.cocktail.gfc;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableOAuth2Sso
@Order(-20)
public class GfcSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        //http.antMatcher("/**").authorizeRequests().anyRequest().authenticated();
        //ou
//        http.antMatcher("/**")
//                .authorizeRequests()
//                .antMatchers("/index.html", "/home.html", "/").permitAll()
//                .anyRequest().authenticated()
//                .and().csrf()
//                .csrfTokenRepository(csrfTokenRepository())
//                .and()
//                .addFilterAfter(csrfHeaderFilter(), CsrfFilter.class)
        //ou
        http
                .logout().and()
                .authorizeRequests()
                .antMatchers("/index.html", "/home.html", "/", "/login**").permitAll()
                .anyRequest().authenticated()
                .and()
                .csrf()
                .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
        ;
    }
}
