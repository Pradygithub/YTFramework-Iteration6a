package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signin 
{
ChromeDriver driver;
Properties pr;
public Signin(ChromeDriver driver, Properties pr)
{
	this.driver=driver;
	this.pr=pr;
}
public void login(String username, String password) throws InterruptedException
{
	driver.findElement(By.xpath(pr.getProperty("signbtn"))).click();
	driver.findElement(By.xpath(pr.getProperty("emailfield"))).sendKeys("panwarp727@gmail.com");
	driver.findElement(By.xpath(pr.getProperty("nextbtn"))).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(pr.getProperty("passfield"))).sendKeys("pradygoogle");
	Thread.sleep(5000);
	driver.findElement(By.xpath(pr.getProperty("nextbtn"))).click();
	Thread.sleep(5000);
}
}

