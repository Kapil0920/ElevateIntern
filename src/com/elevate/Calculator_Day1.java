package com.elevate;

import java.util.Scanner;

public class Calculator_Day1 {
	static Scanner sc = new Scanner(System.in);
	public int addition(int count ) {
		
		int sum =0;
		for(int i =1;i<=count;i++) {
		System.out.println("Enter the number: "+i);
		int num = sc.nextInt();
		sum +=num;
		}
		
		return sum;
	}
	public int subtract(int count, int num1) {
		 for(int i = 2; i<=count; i++) {
			 
			 System.out.print("Enter the number: "+i+" -");
			 int num = sc.nextInt();
			 
			 num1 =num1-num;
			 
		 }
		 return num1;
		
	
	}

	public static void main(String[] args) {
		Calculator_Day1 cal = new Calculator_Day1();
		// TODO Auto-generated method stub
		System.out.println("Hello Day");
		
		
		
		
		
		do {
			System.out.println("What do you want to do Add, Subtract, Multiply or Divide");
			String answer = sc.next();
			
			
			
			if(answer.equalsIgnoreCase("Add")) {
				System.out.println("How many number do you want to add");
				int count = sc.nextInt();

				int add = cal.addition(count);
				System.out.println("Addition of number is: "+add);
				
			}
			
			else if(answer.equalsIgnoreCase("subtract")) {
				System.out.println("How many number do you want to subtract");
				int count = sc.nextInt();
				 System.out.println("Note: whatever number you will type that will automatically subtract from the \"FIRST\" number");

				System.out.println("Enter the number: 1");
				int num1=sc.nextInt();

				int subtract = cal.subtract(count,num1);
				System.out.println("Subtraction of number is: "+subtract);
				
			}
			
			else if(answer.equalsIgnoreCase("multiply")) {
				
			}
			
			
			
		}while(true);

	}

}
