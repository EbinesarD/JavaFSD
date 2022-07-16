package lesson1;
class Modifiers
{
	int num_private = 10;
	void run()
	{
		System.out.println("Default run function ");
	}
	public void pub_func()
	{
		int num_public = 20;
		System.out.println("Public: "+ num_public);
	}
	protected void pro_func()
	{
		int num_protected = 30;
		System.out.println("Protected: "+ num_protected);
	}
}
public class accessmodifiers 
{
	public static void main(String[] args)
	{
		Modifiers M = new Modifiers();
		M.run();
		System.out.println("Private: "+ M.num_private);
		M.pub_func();
		M.pro_func();
	}
}
