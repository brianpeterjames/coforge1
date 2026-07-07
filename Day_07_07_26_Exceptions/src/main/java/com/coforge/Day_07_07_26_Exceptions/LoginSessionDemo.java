package com.coforge.Day_07_07_26_Exceptions;

import java.io.IOException;

public class LoginSessionDemo {
	public static void validate(String uname, String pwd)
	{
		if(uname.equals("Brian") && pwd.equals("brian007"))
		{
 		try(LoginSession session = new LoginSession())
 		{
 			session.login();
 			session.accessPages();
 		}
		catch(IOException e){
			e.printStackTrace();
		}
		}
		else 
			System.out.println("Invalid Credentials, No Session");
		
	}
	public static void main(String[] args) {
		String uname = "Brian", pwd = "brian007";
		validate(uname,pwd);
	}

}
