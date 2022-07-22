package lesson3;

public class exceptionHandling {
	public static void main(String args[])
	{
		try
		{
			int i=7;
			int j = 0;
			int l = i/j;
			System.out.println("output is "+ l);
			Thread.sleep(2000);
			int a[] = new int[6];
			a[6]=8;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot Divide by zero ");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Out of Bound ");
		}
		catch(Exception e)
		{
			System.out.println("Something is wrong ");
		}
		finally       
		{
			System.out.println("Bye");
		}
	}


}
