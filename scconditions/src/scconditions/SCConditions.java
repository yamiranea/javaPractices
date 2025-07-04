package scconditions;

import java.util.Scanner;

public class SCConditions {

	public static void main(String[] args) {
	//NUMBER EVEN OR ODD
		/* 
		int number;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Give me a number and I'll tell you if it's odd or even");
		
		number=sc.nextInt();
		
		if(number%2==0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
		*/
	
	// YOUNG OR NOT YOUNG AGE
		/*
		int age;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Tell me your age to see if you can benefit for a discount");
		
		age=sc.nextInt();
		
		if(age<=14 && age >=55) {
			System.out.println("You can enjoy young group discount");
		} else {
			System.out.println("You can enjoy senior group discount");
		}
		*/
	
	// DEFINING GRADES 
		int m1,m2,m3,totalGrades;
		float avg;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("What was your 3 last scores and I'll give you your total, average and grade");
				
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		
		totalGrades=m1+m2+m3;
		avg=totalGrades/3;
		
		System.out.println("Your total scores is: "+totalGrades);

		System.out.println("Your average score is: "+avg);

		if(avg>=70) {
			System.out.println("You are A grade");
		} else if(avg>=60 && avg <70) {
			System.out.println("You are B grade");
		} else if(avg>=50 && avg<60) {
			System.out.println("You are C grade");
		} else if(avg>=40 && avg<50) {
			System.out.println("You are D grade");
		} else {
			System.out.println("You are E grade");
		}
		
		
		
}
} 