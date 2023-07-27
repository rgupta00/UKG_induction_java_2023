package com.empapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

//Empappv1Application how it works?
/*
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
 */
@SpringBootApplication
public class Empappv1Application implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private EntityManagerFactory emf;

	@Autowired
	private EntityManager em;

	public static void main(String[] args) {
		System.out.println("--------public static void main(String[] args) -------");
		ApplicationContext ctx= SpringApplication
				.run(Empappv1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("----i am running-----");
		if(dataSource!=null){
			System.out.println("ds is configureed");
		}
		if(jdbcTemplate!=null){
			System.out.println("jdbcTemplate is configureed");
		}
		if(emf!=null){
			System.out.println("EntityManagerFactory is configureed");
		}
		if(em!=null){
			System.out.println("EntityManager is configureed");
		}
	}
}
