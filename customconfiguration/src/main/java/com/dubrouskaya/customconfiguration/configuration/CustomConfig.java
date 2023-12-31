package com.dubrouskaya.customconfiguration.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class CustomConfig {
    @Bean
    @ConditionalOnMissingBean(DataSource.class)
    public DataSource getCustomDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:mem:test");
        dataSourceBuilder.username("custom");
        dataSourceBuilder.password("");
        return dataSourceBuilder.build();
    }
}
