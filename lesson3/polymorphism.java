package lesson3;

class Animal
{
	public void sound()
	{
		System.out.println("Sound: ");
	}
}	
class Dog extends Animal
{
	public void sound()
	{
		System.out.println("Dog: Bow Bow");
	}
}
class Cat extends Animal
{
	public void sound()
	{
		System.out.println("Cat: Meow Meow");
	}
}
public class polymorphism {
	public static void main(String[] args) {
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		a.sound();
		d.sound();
		c.sound();	
	}
}
