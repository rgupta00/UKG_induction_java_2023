package com.demo.java8.session1.ex0;

import sun.rmi.log.LogInputStream;

import java.util.stream.LongStream;

//calculating prime no bw 1 to 1_000_000

class Prime{
	public static boolean isPrime(Long n){
		boolean isPrimeNumber=true;
		for(int i=2;i<n;i++){
			if(n%i==0)
				isPrimeNumber=false;
		}
		return isPrimeNumber;
	}
}

public class MotivationJava8 {
	
	public static void main(String[] args) {
		//Fork and join framework

		//Thread pool
		//System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");

		long start= System.currentTimeMillis();
		long count= LongStream
				.range(1, 1_000_00)
				.filter(Prime::isPrime)
				.parallel()
				.count();
		long end= System.currentTimeMillis();
		System.out.println(count);
		System.out.println("time taken: "+(end-start)+" ms");

//		long count=0;
//
//		for(long i=0;i<1_000_000; i++){
//			if(Prime.isPrime(i)){
//				count++;
//			}
//		}
		//System.out.println(count);

		System.out.println(Runtime.getRuntime().availableProcessors());
		
		/*
		 *
		or

		java -Djava.util.concurrent.ForkJoinPool.common.parallelism=8 MotivationJava8

		 */
	}

}
