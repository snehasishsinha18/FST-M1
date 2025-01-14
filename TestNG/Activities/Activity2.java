package fst_testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
	WebDriver driver = new ChromeDriver();
	
	@BeforeClass
	public void Setup()
	{
	driver.get("https://training-support.net/webelements/target-practice");
	}
	
	@Test
	public void test1() 
	{
	System.out.println(driver.getTitle());
	Assert.assertEquals(driver.getTitle(), "Selenium: Target Practice");
	}
	
	@Test
	public void test2()
	{
	WebElement black= driver.findElement(By.xpath("//button[text()='Black']"));
	Assert.assertTrue(black.isDisplayed());
	}
	
	@Test(enabled=false)
	public void test3()
	{
		System.out.println("Skipped");
	}
	
	@Test
	public void test4()
	{
		throw new SkipException("Skipping test case");
	}
	
	@AfterClass
	public void Close()
	{
	driver.close();
	}

	}


