package caseExcercises1;
import java.util.Scanner;

public class OperationsCase {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Ingresa 2 numeros y luego haremos una operacion matematica");
		float x=scan.nextInt();
		float y=scan.nextInt();
		scan.nextLine();
		
		System.out.println("Dime la operacion a realizar: SUMA, RESTA, DIV, MUL");
		String operation=scan.nextLine();
		operation=operation.toUpperCase();
		
		switch(operation)
		{
		case "SUMA": System.out.println("SUMA es: "+(x+y));
		break;
		
		case "RESTA": System.out.println("RESTA es: "+(x-y));
		break;
		
		case "DIV": System.out.println("DIV es: "+(x/y));
		break;
		
		case "MUL": System.out.println("MUL es: "+(x*y));
		break;
		
		default: System.out.println("Invalid option");
		break;
		}
	}

}

