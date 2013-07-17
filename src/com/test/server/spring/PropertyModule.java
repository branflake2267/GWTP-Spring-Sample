package com.test.server.spring;

import org.springframework.beans.factory.config.PropertyOverrideConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
public class PropertyModule {

    public PropertyModule() {
    }

    @Bean
    public PropertyOverrideConfigurer getPropertyOverrideConfigurer() {
        PropertyOverrideConfigurer propertyOverrider = new PropertyOverrideConfigurer();

        propertyOverrider.setLocation(new ClassPathResource("META-INF/override.properties"));
        propertyOverrider.setIgnoreResourceNotFound(false);
        propertyOverrider.setIgnoreInvalidKeys(false);
        propertyOverrider.setOrder(0);

        return propertyOverrider;
    }
}