package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Videoplay 
{
ChromeDriver driver;
Properties pr;
public Videoplay(ChromeDriver driver, Properties pr)
{
	this.driver=driver;
	this.pr=pr;
	}
public void playVideo(int videono) throws InterruptedException
{
	driver.findElements(By.id(pr.getProperty("allvideos"))).get(videono).click();
	Thread.sleep(7000);
}
}
