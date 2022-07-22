package lesson1;
import java.util.*;

class Operation
{
	double num1;
	double num2;
	public Operation(double num1, double num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	public void add()
	{
		System.out.println("Answer: "+ (num1+num2));
	}
	public void subtract()
	{
		System.out.println("Answer: "+ (num1-num2));
	}
	public void multiply()
	{
		System.out.println("Answer: "+ (num1*num2));
	}
	public void division()
	{
		System.out.println("Answer: "+ (num1/num2));
	}
}
public class arithmeticcalculator 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st numbers: ");
		final double num1 = sc.nextDouble();
		System.out.println("Enter the 2nd numbers: ");
		final double num2 = sc.nextDouble();
		Operation o = new Operation(num1, num2);
		System.out.println("Enter your choice of operation:\t1. add\t2. subtract\t3. multiply\t4. division");
		final int ch = sc.nextInt();
		switch(ch)
		{
		case 1:o.add();
		break;
		case 2:o.subtract();
		break;
		case 3:o.multiply();
		break;
		case 4:o.division();
		break;
		default:System.out.println("Please, Enter the right choice");
		break;
		}
		sc.close();
	}
}






