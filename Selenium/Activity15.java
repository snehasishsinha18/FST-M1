package fst_selenium;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Activity15 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/dynamic-attributes");
		String title =driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//input[starts-with(@id, 'full-name')]")).sendKeys("Sinha");
		driver.findElement(By.xpath("//input[contains(@id, 'email')]")).sendKeys("Sinha@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name, '-event-date')]")).sendKeys("07/03/1991");
		driver.findElement(By.cssSelector("textarea[id*='-additional-details']")).sendKeys("nothing");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@id='action-confirmation']")));
		String s1=driver.findElement(By.xpath("//h3[@id='action-confirmation']")).getText();
		System.out.println(s1);
		driver.close();
		
		
		
		
		
	}

}
