package lesson3;

import java.io.Serializable;

public class serilization implements Serializable
{
	private int id;
	private String name;
	private transient String email; //can't serialize this value
	private String password;
	
	public serilization(int id,String name, String email, String password) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.password=password;	
	}
	
	public void display() {
		System.out.println(id+ " "+name+" "+email+ " "+password);
	}
	public static void main(String[] args) 
	{
		serilization  s1=new serilization(1, "test", "test@gmail.com", "test@1234");
		s1.display();
	}
}
