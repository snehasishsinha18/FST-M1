package AlchemyJobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
	WebDriver driver = new ChromeDriver();
	
	@BeforeClass
	public void Setup()
	{
	driver.get("https://alchemy.hguy.co/jobs/");
	}
	@Test
	public void title() throws InterruptedException 
	{
		WebElement S1= driver.findElement(By.xpath("//img[@class='attachment-large size-large wp-post-image']"));
		@SuppressWarnings("deprecation")
		String s2=S1.getAttribute("src");
		System.out.println(s2);
	}
	
	@AfterClass
	public void Close()
	{
	driver.close();
	}


	
	
	
}
