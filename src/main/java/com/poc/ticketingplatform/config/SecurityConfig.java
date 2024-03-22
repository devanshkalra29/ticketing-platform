package com.poc.ticketingplatform.config;


import com.poc.ticketingplatform.service.CustomOAuth2UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final CustomOAuth2UserService customOAuth2UserService;

    public SecurityConfig(CustomOAuth2UserService customOAuth2UserService) {
        this.customOAuth2UserService = customOAuth2UserService;
    }

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth ->auth.anyRequest().authenticated()
                )
                .oauth2Login( oauth2 -> oauth2
                        .userInfoEndpoint(infoEndpoint -> infoEndpoint.userService(customOAuth2UserService)));



        return http.build();
    }

}
