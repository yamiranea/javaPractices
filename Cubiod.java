import java.lang.*;
import java.util.Scanner;

class Cubiod {
	
	public static void main (String args[])
	{
		Scanner sc=new Scanner (System.in);
		
		int length,breadth,height;		
		int totalArea,volume;
		
		System.out.println("Enter length, breadth and height of your room:");
		length=sc.nextInt();
		breadth=sc.nextInt();
		height=sc.nextInt();
		
		totalArea=2*(length*breadth+length*height+breadth*height);
		System.out.println("Total area of your room is: "+totalArea);
		
		volume=length*breadth*height;
		System.out.println("Volume is: "+volume);
	}
}