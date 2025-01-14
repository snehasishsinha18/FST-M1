package fst_testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
	WebDriver driver = new ChromeDriver();
	
	@BeforeClass
	public void Setup()
	{
	driver.get("https://training-support.net/webelements/target-practice");
	}
	
	@Test
	public void titletest()
	{
		System.out.println(driver.getTitle());
	}
	@Test(groups={"header"})
	public void headertest1() 
	{
		Assert.assertEquals("Heading #3", driver.findElement(By.xpath("//h3[contains(@class, 'orange')]")).getText());
	}
	@Test(groups={"header"})
	public void headertest2() 
	{
		Color cl = Color.fromString(driver.findElement(By.xpath("//h5[contains(@class, 'purple')]")).getCssValue("color"));
		Assert.assertEquals("#9333ea", cl.asHex());
	}
	@Test(groups={"button"})
	public void buttontest1()
	{
		Assert.assertEquals("Emerald", driver.findElement(By.xpath("//button[contains(@class, 'emerald')]")).getText());
	}
	@Test(groups={"button"})
	public void buttontest2()
	{
		Color cl1 = Color.fromString(driver.findElement(By.xpath("//button[contains(@class, 'teal')]")).getCssValue("color"));
		Assert.assertEquals("#134e4a", cl1.asHex());
	}
	
	@AfterClass
	public void Close()
	{
	driver.close();
	}

	}


