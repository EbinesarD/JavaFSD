package lesson2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regularExpressions {
	public static void main(String[] args) {
		String pattern = "[a-z]+";
		String check = "Regular Expressions";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		while(c.find())
		{
			System.out.println(check.substring(c.start(), c.end()));
		}
		String s1 = "[0-9]+";
		String s2 = "1005";
		Pattern p1 = Pattern.compile(s1);
		Matcher m1 = p1.matcher(s2);
		String s3 = "^[A-Za-z0-9]+\\.(docx|pdf|csv|xls|txt)$";
		String s4 = "file1.txt";
		Pattern p2 = Pattern.compile(s3);
		Matcher m2 = p2.matcher(s4);
		if(m2.matches())
		{
			System.out.println("Match found");
		}
		else
		{
			System.out.println("No match found");
		}
		
	}
}
