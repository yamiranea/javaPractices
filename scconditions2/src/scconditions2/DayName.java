package scconditions2;

import java.util.Scanner;

public class DayName {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int day;
		
		System.out.println("Enter a number");
		
		day=scan.nextInt();
		
		if(day==1) {
			System.out.println("The day is monday");
		}
		else if(day==2) {
			System.out.println("The day is tuesday");
		}
		else if(day==3) {
			System.out.println("The day is wednesday");
		}
		else if(day==4) {
			System.out.println("The day is thursday");
		}
		else if(day==5) {
			System.out.println("The day is friday");
		}
		else if(day==6) {
			System.out.println("The day is saturday");
		}
		else if(day==7) {
			System.out.println("The day is sunday");
		}
	}

}
