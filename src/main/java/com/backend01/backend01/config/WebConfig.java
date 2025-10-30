//package com.backend01.backend01.config;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//@Configuration
//public class WebConfig {
//	
//	  @Bean
//	    public WebMvcConfigurer corsConfigurer() {
//	        return new WebMvcConfigurer() {
//	            @Override
//	            public void addCorsMappings(CorsRegistry registry) {
//	                registry.addMapping("/**")
//	                        // ⚠️ Cambia por tu dominio real del frontend en Azure
//	                        .allowedOrigins(
//	                            "https://app-web-frontend-dhb4f3h3drfzcndy.canadacentral-01.azurewebsites.net",
//	                            "http://localhost:5173",
//	                            "http://localhost:3001"
//	                        )
//	                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//	                        .allowedHeaders("*")
//	                        .allowCredentials(false);
//	            }
//	        };
//	    }
//	}


