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
public class Activity21 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/tabs");
		String title =driver.getTitle();
		String win=driver.getWindowHandle();
		System.out.println(title);
		System.out.println(win);
		
		
		driver.findElement(By.xpath("//button[text()='Open A New Tab']")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		System.out.println(driver.getWindowHandles());
		
		for (String h1: driver.getWindowHandles())
		{
		driver.switchTo().window(h1);
		}
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Another One')]")));
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getTitle());
		System.out.println("New Page message: " + driver.findElement(By.cssSelector("h2.mt-5")).getText());
		
		driver.findElement(By.xpath("//button[contains(text(), 'Another One')]")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		for (String h1: driver.getWindowHandles())
		{
		driver.switchTo().window(h1);
		}
		System.out.println("New Page message: " + driver.findElement(By.cssSelector("h2.mt-5")).getText());
		
		
		driver.quit();
		
		
		
		
		
	}

}
