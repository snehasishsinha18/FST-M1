package AlchemyJobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver = new ChromeDriver();
	
	@BeforeClass
	public void Setup()
	{
	driver.get("https://alchemy.hguy.co/jobs/");
	}
	@Test
	public void title() throws InterruptedException 
	{
		String S1= driver.findElement(By.cssSelector("h1.entry-title")).getText();
		Assert.assertEquals("Welcome to Alchemy Jobs", S1);
	}
	
	@AfterClass
	public void Close()
	{
	driver.close();
	}


	
	
	
}
