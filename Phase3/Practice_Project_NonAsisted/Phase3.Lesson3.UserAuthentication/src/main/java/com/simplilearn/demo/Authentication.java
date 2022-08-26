package com.simplilearn.demo;

import java.util.regex.*;

public class Authentication {
	public boolean authenticate(String Email, String password){
		
		String email = "Renny@123";
		String pass = "renny";
		String emailPatern = "^(.+)@(.+)$";
		Pattern p = Pattern.compile(emailPatern);
		Matcher m = p.matcher(Email);
		if(m.matches())
		{
			if(email.equals(Email) && pass.equals(password))
				return true;
			else
				return false;
		}
		return false;
		
	}
}
	