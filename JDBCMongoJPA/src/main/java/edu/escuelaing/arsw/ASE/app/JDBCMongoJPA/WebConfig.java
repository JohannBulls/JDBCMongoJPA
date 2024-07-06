package edu.escuelaing.arsw.ASE.app.JDBCMongoJPA;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Configuration class for setting up Cross-Origin Resource Sharing (CORS) settings.
 */
@Configuration
public class WebConfig {

    /**
     * Configures CORS settings to allow requests from specified origins.
     * @return A WebMvcConfigurer with CORS mappings.
     */
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/users").allowedOrigins("http://localhost:3000");
            }
        };
    }
}
