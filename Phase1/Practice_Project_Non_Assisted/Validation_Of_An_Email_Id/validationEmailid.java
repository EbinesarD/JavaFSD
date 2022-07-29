package Phase1.Practice_Project_Non_Assisted.Validation_Of_An_Email_Id;

import java.util.LinkedHashSet;
import java.util.*;
import java.util.regex.*;
public class validationEmailid {
	public static void main(String[] args) {
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		lh.add("abc@gmail.com");
		lh.add("def@gmail.com");
		lh.add("pqr@gmail.com");
		lh.add("abc@yahoo.com");
		lh.add(null);
		System.out.println("Enter your Email Id: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String email = "^(.+)@(.+)$"; 
		Pattern p = Pattern.compile(email);
		Matcher m = p.matcher(s);
		if(m.matches())
		{
			if(lh.contains(s))
			{
				System.out.println("Your Email Id '"+s+"' is present");
			}
			else
			{
				System.out.println("Your Email Id '"+s+ "' is not present\nPlease register yourself");
			}
		}
		else
		{
			System.out.println("Please enter a valid email id");
		}
		sc.close();
	}
}
