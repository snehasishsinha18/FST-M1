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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Activity16 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://training-support.net/webelements/selects");
		String title =driver.getTitle();
		System.out.println(title);
		
		
		WebElement w1=driver.findElement(By.cssSelector("Select.h-10"));
		Select sl = new Select(w1);
		sl.selectByContainsVisibleText("Two");
		System.out.println(sl.getFirstSelectedOption().getText());
		
	
		sl.selectByIndex(3);
		System.out.println(sl.getFirstSelectedOption().getText());
		
		sl.selectByValue("four");
		System.out.println(sl.getFirstSelectedOption().getText());
		
		List<WebElement> w=sl.getOptions();
		for(WebElement i:w)
		{
			System.out.println(i.getText());
		}
		
		
		driver.close();
		
		
		
		
		
	}

}
