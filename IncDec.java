package incDec;

public class IncDec {
	public static void main(String args[])
	{
		int x=5, y=4, z;
		
		z=2 * x++ + 3 * ++y; //En el primer caso x++ primero se realiza la multiplicacion y luego la asignación de x
							//En el segundo caso ++y se realiza primero la asignación de y, luego la multiplicacion
		System.out.println(z);)
	}
}