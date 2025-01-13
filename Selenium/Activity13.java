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
public class Activity13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/tables");
		String title =driver.getTitle();
		System.out.println(title);
		
		
		List<WebElement> w1 =driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/thead/tr/th"));
		System.out.println(w1.size());
		
		List<WebElement> w2 =driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr"));
		System.out.println(w2.size());
		
		List<WebElement> w3 =driver.findElements(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[3]/td"));
		for(WebElement i:w3)
		{
			System.out.println(i.getText());
		}
		
		String w4 =driver.findElement(By.xpath("//table[contains(@class, 'table-auto')]/tbody/tr[2]/td[2]")).getText();
		System.out.println(w4);
			
		driver.close();
		
		
		
		
		
	}

}
