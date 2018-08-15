package com.devopsbuddy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class I18nConfig {

	@Bean
	public ReloadableResourceBundleMessageSource messageSource () {
		ReloadableResourceBundleMessageSource resourceMessageSource = new ReloadableResourceBundleMessageSource();
		resourceMessageSource.setBasename("classpath:i18n/messages");
		//Check for msg every 30 min
		resourceMessageSource.setCacheSeconds(1800);
		return resourceMessageSource;
	}
}
