package lesson1;
import java.util.*;

class Operation
{
	public void add(double arr[], int n)
	{
		double ans=0;
		for(int i=0;i<n;i++)
		{
			ans+=arr[i];
		}
		System.out.println("Answer: "+ ans);
	}
	public void subtract(double arr[], int n)
	{
		double ans=0;
		for(int i=0;i<n;i++)
		{
			ans-=arr[i];
		}
		System.out.println("Answer: "+ ans);
	}
	public void multiply(double arr[], int n)
	{
		double ans=1;
		for(int i=0;i<n;i++)
		{
			ans*=arr[i];
		}
		System.out.println("Answer: "+ ans);
	}
	public void division(double arr[], int n)
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
		Operation o = new Operation();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the total numbers: ");
		int n = sc.nextInt();
		double arr[] = new double[n];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextDouble();
		}
		System.out.println("Enter your choice of operation:\t1. add\t2. subtract\t3. multiply\t4. division");
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:o.add(arr, n);
		break;
		case 2:o.subtract(arr, n);
		break;
		case 3:o.multiply(arr, n);
		break;
		case 4:o.division(arr, n);
		break;
		default:System.out.println("Enter the right choice");
		}
		sc.close();
	}
}






