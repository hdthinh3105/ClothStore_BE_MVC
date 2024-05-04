package com.example.FoodStoreManagement.BM_START.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // Đặt URL pattern của API của bạn ở đây
                .allowedOrigins("http://localhost:4202").allowedOrigins("http://localhost:4201")
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Cho phép các phương thức HTTP
                .allowedHeaders("*"); // Cho phép tất cả các header
    }

}