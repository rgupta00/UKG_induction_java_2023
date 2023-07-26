package com.empapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.empapp"})
public class AppConfig {

    //@Bean is used for defining infra bean
    //DriverManagerDataSource is provided a basics connection pool
    //we can replace this code with better connection pool any day

    //the object ie return from the method call will be register in the container
    //connection factory is signeton DriverManagerDataSource
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
