package com.exceptionhandling;

import java.util.Scanner;

public class ExcepetionEx {
	public static void main(String[] args) {
		display();
		numEven();
		Hi obj1 = new Hi();
		obj1.start();

	}

	private static void display() {
		// TODO Auto-generated method stub
		try {
			int arr[] = { 2, 5, 6, 7 };
			System.out.println(arr[4]); // may throw exception
		}
		// handling the array exception
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code");

	}

	private static void numEven() {
		try {
		 Scanner input = new Scanner(System.in);
		    int num = input.nextInt();
			 if (num % 2 == 0) ;
		 
		        System.out.println("Entered number is even");}
		     catch(Exception e) {
		    	 System.out.println("Entered number is odd");
		     }
		  
	}

}

class Hi extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}