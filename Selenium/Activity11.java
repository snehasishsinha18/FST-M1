package fst_selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Activity11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/dynamic-controls");
		String title =driver.getTitle();
		System.out.println(title);
		
		WebElement w1 =driver.findElement(By.xpath("//input[@id='checkbox']"));
		boolean h1 =w1.isDisplayed();
		System.out.println(h1);
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		wait.until(ExpectedConditions.invisibilityOf(w1));
		WebElement w2 =driver.findElement(By.xpath("//input[@id='checkbox']"));
		boolean h2 =w2.isDisplayed();
		System.out.println(h2);
		

		
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		wait.until(ExpectedConditions.visibilityOf(w2));
		WebElement w3=driver.findElement(By.xpath("//input[@id='checkbox']"));
		boolean h3 =w3.isDisplayed();
		System.out.println(h3);
		driver.close();
		
		
		driver.close();
		
		
		
		
		
	}

}
