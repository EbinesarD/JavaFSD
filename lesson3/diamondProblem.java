package lesson3;
interface A
{
	default void display()
	{
		System.out.println("1st interface");
	}
}
interface B
{
	default void display()
	{
		System.out.println("2nd interface");
	}
}
public class diamondProblem implements A,B
{
	public void display()
	{
		A.super.display();
		B.super.display();
	}
	public static void main(String[] args) {
		diamondProblem d = new diamondProblem();
		d.display();
	}

}
