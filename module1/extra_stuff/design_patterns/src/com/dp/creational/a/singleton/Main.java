package com.dp.creational.a.singleton;
import javafx.css.StyleableIntegerProperty;

import java.lang.reflect.Constructor;
import java.util.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) throws Exception{

		//Class.forName("com.dp.creational.a.singleton.Singleton");

//
		Singleton singleton=Singleton.getInstance();


		System.out.println(singleton.hashCode());

		Class clazz=Class.forName("com.dp.creational.a.singleton.Singleton");

		Constructor[]constructors=clazz.getDeclaredConstructors();
		constructors[0].setAccessible(true);

		Singleton singleton2=(Singleton)constructors[0].newInstance();
		System.out.println(singleton2.hashCode());



		//Runtime is a example of singleton
		//Log4j2 logging

//		System.out.println(Runtime.getRuntime().hashCode());
//		System.out.println(Runtime.getRuntime().hashCode());
		
	}
}
