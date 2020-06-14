package org.testing.utilities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateCalculation 
{
public static String calculateDate()
{
	LocalDateTime ldt=LocalDateTime.now();
	DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd_MM_yyyy_HH_mm_ss");
	String s=ldt.format(dtf);
	return s;
}
}

