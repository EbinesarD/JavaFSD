package lesson1;
import java.util.*;

class Operation
{
	int n;
	double arr[];
	public Operation(double arr[], int n)
	{
		this.arr = arr;
		this.n=n;
	}
	public void add()
	{
		double ans=0;
		for(int i=0;i<n;i++)
		{
			ans+=arr[i];
		}
		System.out.println("Answer: "+ ans);
	}
	public void subtract()
	{
		double ans=0;
		for(int i=0;i<n;i++)
		{
			ans-=arr[i];
		}
		System.out.println("Answer: "+ ans);
	}
	public void multiply()
	{
		double ans=1;
		for(int i=0;i<n;i++)
		{
			ans*=arr[i];
		}
		System.out.println("Answer: "+ ans);
	}
	public void division()
	{
		double ans=1;
		for(int i=1;i<n;i++)
		{
			ans= arr[i-1]/arr[i];
		}
		System.out.println("Answer: "+ ans);
	}
}
public class arithmeticcalculator 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the total numbers: ");
		final int n = sc.nextInt();
		double arr[] = new double[n];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextDouble();
		}
		Operation o = new Operation(arr, n);
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
		default:System.out.println("Enter the right choice");
		}
		sc.close();
	}
}






