package AlchemyJobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
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
		Thread.sleep(2000);
		driver.findElement(By.id("search_keywords")).sendKeys("Banking");
		driver.findElement(By.cssSelector("div.search_submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(@class, 'job_listing')][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.application_button")).click();
		WebElement w1=driver.findElement(By.cssSelector("a.job_application_email"));
		String s1=w1.getText();
		
		System.out.println(s1);
	
	}
	
	@AfterClass
	public void Close()
	{
	driver.close();
	}


	
	
	
}
