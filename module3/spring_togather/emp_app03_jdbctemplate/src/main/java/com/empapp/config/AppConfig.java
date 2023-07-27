package com.empapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.empapp"})
public class AppConfig {

    @Bean
    public JdbcTemplate jdbcTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    //simple connection factory : better connection =>1
    @Bean
    public DriverManagerDataSource dataSource(){
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setUrl("jdbc:postgresql://localhost:5432/ukgdemo");
        ds.setUsername("postgres");
        ds.setPassword("root");
        ds.setDriverClassName("org.postgresql.Driver");
        return ds;
    }
}
