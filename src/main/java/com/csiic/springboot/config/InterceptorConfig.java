package com.csiic.springboot.config;

import com.csiic.springboot.interceptors.JWTInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class InterceptorConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JWTInterceptor())
                .addPathPatterns("/**")//所有路径都拦截
                .excludePathPatterns("/user/**");//除了这个路径
    }
}
