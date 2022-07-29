package lesson3;

public class tryCatch {
	public static void divide() //throws Exception
	{
		try 
		{
			int i = 7;
			int j = 0;
			int l = i/j;
			System.out.println("output is "+ l);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot Divide by zero ");
		}
	}
	public static void array() //throws Exception
	{
		try
		{
			int a[] = new int[6];
			a[6]=8;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index Out of Bound ");
		}	
	}
	public static void main(String[] args) {
		divide();
		array();	
	}
}
