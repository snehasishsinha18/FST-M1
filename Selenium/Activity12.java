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
public class Activity12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/dynamic-content");
		String title =driver.getTitle();
		System.out.println(title);
		
		
		WebElement w1 =driver.findElement(By.id("genButton"));
		w1.click();
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "release"));
				WebElement w2 = driver.findElement(By.id("word"));
		String s1= w2.getText();
		System.out.println(s1);
		
		driver.close();
		
		
		
		
		
	}

}
