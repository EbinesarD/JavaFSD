package lesson1;
import java.util.*;
public class typecasting 
{
	public static void main(String[] args)
	{
		//Implicit conversion
		System.out.println("Implicit conversion: ");
		char a = 'A';
		int num = a;
		float num1 = a;
		double num2 = a;
		long num3 = a;
		System.out.println("Given input: "+a);
		System.out.println("Integer: "+num);
		System.out.println("Float: "+num1);
		System.out.println("Double: "+num2);
		System.out.println("Long: "+num3);
		
		//Explicit conversion
		System.out.println("Explicit conversion: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num4 = sc.nextInt();
		char c = (char) num4;
		float f = (float)num4;
		double d = (double) num4;
		long l = (long) num4;
		System.out.println("Character: "+ c);
		System.out.println("Float: "+ f);
		System.out.println("Double: "+ d);
		System.out.println("Long: "+ l);
		sc.close();
	}

}
