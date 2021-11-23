/*
 * package com.example.demo.security;
 * 
 * import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.config.http.SessionCreationPolicy;
 * 
 * 
 * public class SecurityConfig extends WebSecurityConfigurerAdapter { private
 * static final String[] PUBLIC_URI = { "/some-public-apis" }; protected void
 * config(HttpSecurity http) throws Exception{ http .csrf().disable()
 * .httpBasic().disable() .formLogin().disable() .sessionManagement()
 * .sessionCreationPolicy(SessionCreationPolicy.STATELESS) .and()
 * .authorizeRequests() .antMatchers(PUBLIC_URI) .permitAll() .anyRequest()
 * .authenticated() .and() .exceptionHandling() .authenticationEntryPoint(new
 * RestAuthenticationEntryPoint());
 * 
 * 
 * }
 * 
 * }
 */