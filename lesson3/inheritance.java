package lesson3;
class addition
{
	double sum;
	public double add(double a, double b)
	{
		double sum = a+b;
		return sum;
	}
}
class addition1 extends addition
{
	public void sum(double a, double b)
	{
		System.out.println(add(a,b)+100);
	}
}
public class inheritance {
	public static void main(String[] args) {
		addition1 a = new addition1();
		a.sum(5.0,3.5);
	}
}
