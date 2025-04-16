package com.psiconnect.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .securityMatcher("/**") // Configura todos os endpoints a serem gerenciados
                .csrf(csrf -> csrf.disable())  // Desativa a proteção CSRF
                .authorizeRequests()
                .anyRequest().permitAll();  // Permite todas as requisições sem autenticação

        return http.build();
    }
}
