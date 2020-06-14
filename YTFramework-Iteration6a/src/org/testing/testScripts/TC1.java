package org.testing.testScripts;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Assertions.Assertion1;
import org.testing.Base.Base;
import org.testing.pages.Signin;
import org.testing.pages.Signout;
import org.testing.utilities.DateCalculation;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1 extends Base
{
	@Test
	public void trending() throws InterruptedException, IOException
	{
		//Login & Capture logs
		Signin s=new Signin(driver, pr);
		s.login("panwarp727@gmail.com", "pradygoogle");
		LogsCapture.takeLogs("TC1", "Login success");
		
		 //URL matching using hard assertion
		 String expected_url="https://www.youtube.com/";             
		 String actual_url=driver.getCurrentUrl(); 
		 Assert.assertEquals(expected_url, actual_url);
		 LogsCapture.takeLogs("TC1", "Hard assretion for URL matching is true");
		 
		//screenshot capture		
		String mypath="E:\\screenshots\\"+"TC1_"+DateCalculation.calculateDate()+".png";
		ScreenshotCapture.takeScreenshot(driver, mypath);
		
		//expected and actual email matching using soft assertion passed to hard assertion
		driver.findElement(By.xpath(pr.getProperty("avatarimage"))).click();
		Thread.sleep(5000);
		WebElement emaillabel=driver.findElement(By.xpath(pr.getProperty("emailtext")));
		String actualemail=emaillabel.getText();
		String expectedemail="panwarp727@gmail.com";
		Assert.assertTrue(Assertion1.assert1(actualemail, expectedemail));
		LogsCapture.takeLogs("TC1", "Soft assertion of email matching is true");
		
		// clicking on trending
		driver.findElement(By.xpath(pr.getProperty("trendingbtn"))).click();
		Thread.sleep(5000);
				
		//logout and capture logs
		Signout s1=new Signout(driver, pr);
		s1.logout();
		LogsCapture.takeLogs("TC1", "Logout success");
		
		
			}
}
	
