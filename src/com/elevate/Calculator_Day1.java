package com.elevate;

import java.util.Scanner;

// Calculator_Day1: A simple calculator for basic arithmetic operations using user input.
public class Calculator_Day1 {
	
	// Static Scanner to take input from the user
	static Scanner sc = new Scanner(System.in);

	
//	===================================================
	
	
	// Method for performing addition operation on 'count' numbers
	public int addition(int count) {
		int sum = 0;
		for (int i = 1; i <= count; i++) {
			System.out.println("Enter the number: " + i);
			int num = sc.nextInt();
			sum += num; // Add the input number to the running total
		}
		return sum;
	}

	
	
//	===================================================	
	
	
	// Method for performing subtraction on 'count' numbers starting from 'num1'
	public int subtract(int count, int num1) {
		for (int i = 2; i <= count; i++) {
			System.out.print("Enter the number: " + i + " - ");
			int num = sc.nextInt();
			num1 = num1 - num; // Subtract each subsequent number from the first
		}
		return num1;
	}

	
	
//	===================================================	
	
	// Method for performing multiplication on 'count' numbers
	public int multiply(int count) {
		int multiply = 1;
		for (int i = 1; i <= count; i++) {
			System.out.println("Enter the number: " + i);
			int num = sc.nextInt();
			multiply *= num; // Multiply each number to the result
		}
		return multiply;
	}
	
	
	
//	===================================================

	// Method to perform division operation
	public int divide(int dividend, int divisor) {
		System.out.println("Enter the dividend");
		dividend = sc.nextInt(); // Get the dividend from user
		System.out.println("Enter the divisor");
		divisor = sc.nextInt(); // Get the divisor from user

		return dividend / divisor; // Return the quotient
	}
//	===================================================
	
	
	
	
	// Main method to drive the calculator application
	public static void main(String[] args) {
		Calculator_Day1 cal = new Calculator_Day1(); // Create Calculator object
		String forNextOperation;

		do {
			// Ask the user which operation they want to perform
			System.out.println("What do you want to do Add, Subtract, Multiply or Divide, (type: add,sub,mul,div for perform operation)");
			String answer = sc.next();

//			===================================================
			
			if (answer.equalsIgnoreCase("Add")) {
				// Addition operation
				System.out.println("How many numbers do you want to add");
				int count = sc.nextInt();
				int add = cal.addition(count);
				System.out.println("Sum is: " + add);
			} 
			
			
//			===================================================
			
			else if (answer.equalsIgnoreCase("sub")) {
				// Subtraction operation
				System.out.println("How many numbers do you want to subtract");
				int count = sc.nextInt();
				System.out.println("Note: whatever number you will type will be subtracted from the \"FIRST\" number");
				System.out.println("Enter the number: 1");
				int num1 = sc.nextInt();
				int subtract = cal.subtract(count, num1);
				System.out.println("Difference is: " + subtract);
			} 
			
			
//			===================================================
			
			else if (answer.equalsIgnoreCase("Mul")) {
				// Multiplication operation
				System.out.println("How many numbers do you want to multiply ");
				int count = sc.nextInt();
				System.out.println("\n");
				int multiply = cal.multiply(count);
				System.out.println("Product is: " + multiply);
			} 
			
			
//			===================================================
			
			else if (answer.equalsIgnoreCase("Div")) {
				// Division operation
				int quotient = cal.divide(1, 1); // Initial values are placeholders
				System.out.println("Quotient is: " + quotient);
			}
			
			
//			===================================================
			else {
				System.out.println("Invalid operation. Please choose add, sub, mul, or div.");
			}

			
			
			// Ask if user wants to perform another operation
			System.out.println("Do you want to do more operations? Type 'yes' or 'no'");
			forNextOperation = sc.next();

			
			
		} while (forNextOperation.equalsIgnoreCase("yes")); // Repeat if user says "yes"
		
		System.out.println("Thanks for using my services");
	}
}
