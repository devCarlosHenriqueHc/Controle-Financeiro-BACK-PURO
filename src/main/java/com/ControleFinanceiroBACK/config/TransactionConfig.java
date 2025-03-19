package com.ControleFinanceiroBACK.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class TransactionConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {  // Corrigido de addCorsMapping para addCorsMappings
        registry.addMapping("/**") // Permite chamadas para qualquer endpoint
                .allowedOrigins("*") // Permite chamadas de qualquer origem
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos permitidos
                .allowedHeaders("*"); // Permite todos os headers
    }
}
