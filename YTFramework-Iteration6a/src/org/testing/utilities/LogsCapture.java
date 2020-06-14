package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture 
{
public static void takeLogs(String classname, String message )
{
	DOMConfigurator.configure("../YTFramework-Iteration6a/LogsLayout.xml");
	Logger l=Logger.getLogger(classname); //For Taking the logs 
	l.info(message);//For printing the message 
}
}

//here configure method is static of Class DOMConfigurator to create a connection with LogLayout XML File
//getLogger method of Logger class will take class name or test case (here TC1 to TC7) as parameter 
//for which we want to capture the logs. When the test cases are run we will get a file Application.log
//in test-output folder which will contain the logs.