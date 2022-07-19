package lesson2;

public class method 
{
	int num = 150;
	//call by value
	void operation(int num)
	{
		this.num=num/10;
	}
	//return type int
	public int show()
	{
		return 1;
	}
	//method overloading
	public int show1(int a)
	{
		return a*a;
	}
	public int show1(int a, int b)
	{
		return a+b;
	}
	public double show1(double a, int b)
	{
		return (a+b);
	}
	//no return type
	public void run()
	{
		System.out.println("No return type void method");
	}
	public void run(String name)
	{
		System.out.println("Name: "+name);
	}
	
	public static void main(String[] args)
	{
		method m = new method();
		System.out.println("Return type int: "+m.show());
		System.out.println("Square of 3 is "+m.show1(3));
		System.out.println("Method overloading: "+m.show1(3,7));
		System.out.println("Method overloading: "+m.show1(7.5,7));
		m.run();
		m.run("Ebi");
		System.out.println("Value before call: "+m.num);
		m.operation(40);
		System.out.println("Value after call: "+m.num);
	}
}
