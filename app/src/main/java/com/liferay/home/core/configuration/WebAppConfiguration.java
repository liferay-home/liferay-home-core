package com.liferay.home.core.configuration;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author Daniel Kocsis
 */
@Configuration
@EnableWebMvc
@ComponentScan
public class WebAppConfiguration extends WebMvcConfigurerAdapter {

	@Bean
	public ServletRegistrationBean h2servletRegistration(){
		ServletRegistrationBean registrationBean =
			new ServletRegistrationBean(new WebServlet());

		registrationBean.addUrlMappings("/console/*");

		return registrationBean;
	}

	@Override
	public void configureDefaultServletHandling(
		DefaultServletHandlerConfigurer configurer) {

		configurer.enable();
	}

}