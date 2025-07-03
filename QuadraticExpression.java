import java.lang.*;
import java.util.Scanner;

class QuadraticExpression {
	
	public static void main (String args[]) 
	{
		Scanner sc=new Scanner (System.in);
		
		int a,b,c;
		double r1, r2;
		
		System.out.println("Enter 3 numbers and I'll give you the exponents");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		/**System.out.println("Exponents: ");
		System.out.println(a*a);
		System.out.println(b*b);
		System.out.println(c*c);**/
		
		//System.out.println("Square Roots: ");
		r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
		r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
		
		System.out.println("Root are "+r1+" "+r2);
		//System.out.println(r2);
	}

}