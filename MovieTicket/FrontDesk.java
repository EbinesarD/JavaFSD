package MovieTicket;

import java.util.*;

public class FrontDesk {
	
	public static void main(String[] args) {
		login();
		date();
	}
	
	
	private static void login()
	{
		String username = "Ren";
		String password = "123";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Username: ");
		String u = s.nextLine();
		System.out.println("Enter the Password: ");
		String p =s.nextLine();
		if(u.equals(username) && p.equals(password))
		{
			System.out.println("Logged in\n");
			System.out.println("1. Change Passord\t2. Go Back\n");
			System.out.println("Enter your option: ");
			int option = s.nextInt();
			switch(option)
			{
			case 1:
			{
				System.out.println("Enter new password: ");
				password=s.next();
				System.out.println("Password updated ");
				date();
				break;
			}
			case 2:
			{
				date();
				break;
			}
			}	
		}
		else
		{
			System.out.println("Please enter a valid Username and Password");
			login();
		}
	}
	
	private static void date()
	{
		String[] dates = {"28-July-2022","29-July-2022","30-July-2022" };
		
	}

}
