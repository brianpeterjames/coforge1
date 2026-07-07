package com.coforge.Day_07_07_26_Exceptions;

import java.io.IOException;

public class TryWithResourcesDemo {

	public static void main(String[] args) {

		try(Printer printer = new Printer())
		{
			printer.usePrinter();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
				
	}

}
