package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    private LoginSucessHandler loginSucessHandler;
//
//    @Autowired
//    private LoginAccessDeniedHandler loginAccessDeniedHandler;
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/")
//                .permitAll()
//                .anyRequest().authenticated()
//                .and()
//                .formLogin().successHandler(loginSucessHandler)
//                .loginPage("/index")
//                .permitAll()
//                .and()
//                .logout().invalidateHttpSession(true)
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                .logoutSuccessUrl("login?logout")
//                .permitAll()
//                .and()
//                .exceptionHandling().accessDeniedHandler(loginAccessDeniedHandler).and().csrf().disable();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.jdbcAuthentication();
//
//        auth.inMemoryAuthentication().withUser("user").password("{noop}password").roles("USER")
//                .and()
//                .withUser("admin").password("{noop}ninda").roles("ADMIN");
//    }
//}
