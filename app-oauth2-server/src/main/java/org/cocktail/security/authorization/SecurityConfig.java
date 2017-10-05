package org.cocktail.security.authorization;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
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
