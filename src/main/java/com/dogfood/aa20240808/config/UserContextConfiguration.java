package com.dogfood.aa20240808.config;

import com.dogfood.aa20240808.iam.auth.AuthManager;
import com.dogfood.aa20240808.web.interceptor.UserContextFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

@Configuration
public class UserContextConfiguration {
    @Bean
    public FilterRegistrationBean userContextFilterReg(AuthManager authManager) {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new UserContextFilter(authManager));
        registration.addUrlPatterns("/*");
        registration.setName(UserContextFilter.class.getSimpleName());
        registration.setOrder(0);
        return registration;
    }
}