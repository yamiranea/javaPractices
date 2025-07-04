package scconditions;

import java.util.Scanner;

public class SCConditions {

	public static void main(String[] args) {
		int number;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Give me a number and I'll tell you if it's odd or even");
		
		number=sc.nextInt();
		
		if(number%2==0) {
			System.out.println("The number is even");
		} else {
			System.out.println("The number is odd");
		}
	}
	

}
