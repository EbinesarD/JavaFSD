package Phase1.lesson1;
class Modifiers
{
	int num = 10;
	void run()
	{
		System.out.println("Default function ");
	}
	public void pub_func()
	{
		System.out.println("Public function: "+ num);
	}
	protected void pro_func()
	{
		System.out.println("Protected function: "+ num);
	}
}
public class accessmodifiers1 extends Modifiers
{
	public static void main(String[] args)
	{
		Modifiers M = new Modifiers();
		M.run();
		System.out.println("Private: "+ M.num);
		M.pub_func();
		M.pro_func();
	}
}
