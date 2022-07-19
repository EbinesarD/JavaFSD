package lesson2;

abstract class anonymous
{
	abstract void anonymousInner();
}
public class innerClass {
	private String s ="Inner class";
	class inner
	{
		void display()
		{
			System.out.println(s+": Welcome to inner class");
		}
	}
	void show()
	{
		class inner1
		{
			void show1()
			{
				System.out.println("\nThis is 2nd inner class");
			}
		}
		inner1 i1 = new inner1();
		i1.show1();
	}
	public static void main(String[] args) {
		innerClass i = new innerClass();
		innerClass.inner in = i.new inner();
		in.display();
		i.show();
		anonymous a = new anonymous() {
			void anonymousInner()
			{
				System.out.println("\nThis is anonymous inner class");
			}
		};
		a.anonymousInner();
	}
}
