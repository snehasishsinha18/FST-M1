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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity8 {
	WebDriver driver = new ChromeDriver();
	
	@DataProvider(name="Credentials")
	public Object[][] cred()
	{
		return new Object[][]
				{
				{"admin","password"},
				{"sinha","sam"}
				};
	}
	
	@BeforeMethod
	public void Setup()
	{
	driver.get("https://training-support.net/webelements/login-form");
	}
	
	@Test(dataProvider="Credentials")
	public void test1(String user, String pass) throws InterruptedException 
	{
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
		String s1= driver.findElement(By.cssSelector("h1.text-center")).getText();
		Assert.assertEquals("Login Success!", s1);
	}
	
	
	@AfterClass
	public void Close()
	{
	driver.close();
	}

	}


