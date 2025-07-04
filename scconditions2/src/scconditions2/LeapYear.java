package scconditions2;

import java.util.Scanner;

public class LeapYear {
	// Determine if a year is leap or not
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int year;
		
		System.out.println("Enter a year");
		
		year=scan.nextInt();
		
		if(year%4!=0)
		{
			System.out.println("This is a leap year");
		}
		else 
		{
			System.out.println("This is a regular year");
		}
	}

}
