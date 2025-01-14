package fst_testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
	WebDriver driver = new ChromeDriver();
	
	@BeforeClass
	public void Setup()
	{
	driver.get("https://training-support.net/");
	}
	
	@Test
	public void Ops() throws InterruptedException
	{
	System.out.println(driver.getTitle());
	Assert.assertEquals(driver.getTitle(), "Training Support");
	driver.findElement(By.linkText("About Us")).click();
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	Assert.assertEquals(driver.getTitle(), "About Training Support");
	}
	
	@AfterClass
	public void Close()
	{
	driver.close();
	}

	}


