package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signout 
{
ChromeDriver driver;
Properties pr;
public Signout(ChromeDriver driver, Properties pr)
{
	this.driver=driver;
	this.pr=pr;
}
public void logout() throws InterruptedException
{
	
	driver.findElement(By.xpath(pr.getProperty("avatarimage"))).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath(pr.getProperty("signoutbtn"))).click();
	Thread.sleep(5000);
	
	
}
}
