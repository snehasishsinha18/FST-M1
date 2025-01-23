package AlchemyJobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
	WebDriver driver = new ChromeDriver();
	
	@BeforeClass
	public void Setup()
	{
	driver.get("https://alchemy.hguy.co/jobs/");
	}
	@Test
	public void title() throws InterruptedException 
	{
		driver.findElement(By.linkText("Jobs")).click();
		Assert.assertEquals("Jobs – Alchemy Jobs", driver.getTitle());
	}
	
	@AfterClass
	public void Close()
	{
	driver.close();
	}


	
	
	
}
