package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Commentpost 
{
ChromeDriver driver;
Properties pr;

public Commentpost(ChromeDriver driver, Properties pr)
{
	this.driver=driver;
	this.pr=pr;
		
}
public void postComment() throws InterruptedException
{
	Actions ac=new Actions(driver);
	ac.sendKeys(Keys.PAGE_DOWN).perform();
	Thread.sleep(5000);
	driver.findElement(By.xpath(pr.getProperty("commentavatarimage"))).click();
	ac.sendKeys(Keys.TAB).perform();
	Thread.sleep(5000);
	ac.sendKeys("Very Nice Video").perform();
	Thread.sleep(5000);
	driver.findElement(By.xpath(pr.getProperty("commentsubmit"))).click();
	Thread.sleep(5000);
}
}

