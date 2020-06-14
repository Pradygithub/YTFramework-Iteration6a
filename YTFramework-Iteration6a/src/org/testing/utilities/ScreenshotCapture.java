package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotCapture 
{
//For taking screenshot, we require 2 things. First is the driver object and second is location
//where screenshot will be saved. The below method is declared static so that we can call 
//the method directly using the class name and there is no need to create object of the class
	
	
public static void takeScreenshot(ChromeDriver driver, String path) throws IOException	
{
	File source= driver.getScreenshotAs(OutputType.FILE);
	File dest=new File(path);
	FileUtils.copyFile(source, dest);
}
}
