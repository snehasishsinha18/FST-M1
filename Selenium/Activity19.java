package fst_selenium;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Activity19 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/alerts");
		String title =driver.getTitle();
		System.out.println(title);
		
		
		driver.findElement(By.id("confirmation")).click();
		Alert al =driver.switchTo().alert();
		String s1=al.getText();
		System.out.println(s1);
		al.accept();
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("confirmation")).click();
		al.dismiss();
		
		driver.close();
		
		
		
		
		
	}

}
