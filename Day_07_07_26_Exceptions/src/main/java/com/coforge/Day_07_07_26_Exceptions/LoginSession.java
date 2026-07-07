package com.coforge.Day_07_07_26_Exceptions;

import java.io.Closeable;
import java.io.IOException;

public class LoginSession implements Closeable{
	public void login() {
		System.out.println("User Logged In");
	}
	public void accessPages()
	{
		System.out.println("User Accessing Pages");
	}
	@Override
	public void close() throws IOException {
		System.out.println("Session completed automatically");
		
	}

}
