package fst_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
public class Activity10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/keyboard-events");
		String title =driver.getTitle();
		System.out.println(title);
		Actions builder = new Actions(driver);
		
		builder.sendKeys("I am from selenium").build().perform();
		
		WebElement h1=driver.findElement(By.xpath("//h1[contains(@class,'text-4xl')]"));
		String s1= h1.getText();

		System.out.println(s1);

		
		
		driver.close();
		
		
		
		
		
	}

}
