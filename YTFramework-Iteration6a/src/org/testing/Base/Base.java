package org.testing. Base;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util. Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
public ChromeDriver driver;
public Properties pr;

@BeforeMethod
public void browserOpen() throws IOException, InterruptedException, FileNotFoundException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\lenovo\\Desktop\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
	File f=new File("../YTFramework-Iteration6a/ObjectsRepository.properties");
	pr=new Properties();
	FileInputStream fi=new FileInputStream(f);
	pr.load(fi);
	driver=new ChromeDriver();
	driver.get("https://www.youtube.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
}
@AfterMethod
public void browserClose() throws InterruptedException
{
	driver.close();
	Thread.sleep(3000);
}
}
