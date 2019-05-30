package com.example.EasyFinallyProgect.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("user/add").permitAll()
                .antMatchers("user/delete/{id}").permitAll()
                .antMatchers("user/deleteAll").permitAll()
                .antMatchers("user/update").permitAll()
                .antMatchers("user/getAll").permitAll()
                .antMatchers("user/add").permitAll()
                .antMatchers("user/add").permitAll()

                .antMatchers("category/add").permitAll()
                .antMatchers("category/delete/{id}").permitAll()
                .antMatchers("category/deleteAll").permitAll()
                .antMatchers("category/update").permitAll()
                .antMatchers("category/getAll").permitAll()
                .antMatchers("category/add").permitAll()
                .antMatchers("category/add").permitAll()

                .antMatchers("item/add").permitAll()
                .antMatchers("item/delete/{id}").permitAll()
                .antMatchers("item/deleteAll").permitAll()
                .antMatchers("item/update").permitAll()
                .antMatchers("item/getAll").permitAll()
                .antMatchers("item/add").permitAll()
                .antMatchers("item/add").permitAll()

                .antMatchers("comment/add").permitAll()
                .antMatchers("comment/delete/{id}").permitAll()
                .antMatchers("comment/deleteAll").permitAll()
                .antMatchers("comment/update").permitAll()
                .antMatchers("comment/getAll").permitAll()
                .antMatchers("comment/add").permitAll()
                .antMatchers("comment/add").permitAll()


                .antMatchers("application/add").permitAll()
                .antMatchers("application/delete/{id}").permitAll()
                .antMatchers("application/deleteAll").permitAll()
                .antMatchers("application/update").permitAll()
                .antMatchers("application/getAll").permitAll()
                .antMatchers("user/add").permitAll()
                .antMatchers("user/add").permitAll()

                .and()
                .httpBasic()
                .and()
                .csrf()
                .disable();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select login, password, " +
                        "is_active from user where login = ?")
                .authoritiesByUsernameQuery("select u.login," +
                        "ur.role as role " +
                        "from g_user u inner join g_user_roles ur on u.id = ur.user_id " +
                        "where u.login = ?");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}