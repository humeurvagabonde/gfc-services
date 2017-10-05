package org.cocktail.security.authorization;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(-20)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                 authorizeRequests()
                    .antMatchers("/login", "/oauth/authorize", "/oauth/confirm_access").permitAll().and()
                // default protection for all resources (including /oauth/authorize)
                .authorizeRequests()
                    .anyRequest()
                    .authenticated().and()
                .formLogin()
                .permitAll();

                // ... more configuration, e.g. for form login
            ;
    }
}
