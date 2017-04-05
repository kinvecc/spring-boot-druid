package com.druid.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 创建人： Zhang
 * 修改时间：2017/4/5
 * 描述：
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    /*@Bean
    public FilterRegistrationBean MyFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new DruidStatFilter());
        registration.addUrlPatterns("*//*");
        //registration.addInitParameter("paramName", "paramValue");
        registration.setName("DruidStatFilter");
        registration.setOrder(1);
        return registration;
    }*/
}
