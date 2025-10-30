package com.backend01.backend01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig {
	
	  @Bean
	    public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurer() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/**")
	                        // ⚠️ Cambia por tu dominio real del frontend en Azure
	                        .allowedOrigins(
	                            "https://api-rest-helpdesk-fqaff3axb8e0deep.canadacentral-01.azurewebsites.net",
	                            "http://localhost:5173"
	                        )
	                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
	                        .allowedHeaders("*")
	                        .allowCredentials(false);
	            }
	        };
	    }
	}


