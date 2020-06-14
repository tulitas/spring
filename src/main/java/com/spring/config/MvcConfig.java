package com.spring.config;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        System.out.println("login");
        registry.addViewController("/loginpage").setViewName("loginpage");
        registry.addViewController("/news").setViewName("news");
    }
}
