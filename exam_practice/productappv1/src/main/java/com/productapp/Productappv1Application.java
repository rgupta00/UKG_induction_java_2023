package com.productapp;

import com.productapp.entity.Product;
import com.productapp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Productappv1Application implements CommandLineRunner {

	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(Productappv1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		productRepo.save(new Product("dell laptop",78000));
//		productRepo.save(new Product("laptop cover",700));
		System.out.println("---------------------");
	}
}
