package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    /*
    * Esta forma de implementarlo fue de la manera sencilla o más básica
    * asi que más adelante veremos como implementar un seguridad usando
    * JWT y OAUTH2
    * */

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
//                .csrf(AbstractHttpConfigurer::disable) // Vamos a ver lo que significa ya que al parecer
                // de una vulderabilidad de navegadores y algo más de hackers
                .authorizeHttpRequests( auth ->
                    auth.requestMatchers("/api/v1/free").permitAll()
                            .anyRequest().authenticated()
                )
//                .httpBasic(Customizer.withDefaults()) // Se agrega para mandar por header las credenciales
                .build();
    }
}
