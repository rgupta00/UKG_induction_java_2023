package com.demo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component(value = "foo")
class Foo{
	int i;
	public Foo(){
		System.out.println("foo ctr is called");
	}
	
	@PostConstruct
	public void before(){
		System.out.println("@PostConstruct wala method is called");
	}
	
	public void doWork(){
		System.out.println("doing work");
	}
	
	@PreDestroy
	public void after(){
		System.out.println("@PreDestroy wala method is called");
	}
	
}