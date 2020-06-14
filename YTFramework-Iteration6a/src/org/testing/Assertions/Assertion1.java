package org.testing.Assertions;

public class Assertion1 
{
public static Boolean assert1(String expected_email, String actual_email)
{
	if(expected_email.equals(actual_email)) 
	{
		System.out.println("Assertion passed");
		
		return true;
	}
	else
	{
		System.out.println("Assertion failed");
		
		return false;
	}
}
}
