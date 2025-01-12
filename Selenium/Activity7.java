package fst_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
public class Activity7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		String title =driver.getTitle();
		System.out.println(title);
		
		WebElement el=driver.findElement(By.xpath("//input[@id='textInput']"));
		
		boolean h1 =el.isEnabled();
		System.out.println(h1);
		
		WebElement el1=driver.findElement(By.xpath("//button[@id='textInputButton']"));
		el1.click();
		
		boolean h2=el.isEnabled();
		System.out.println(h2);
		
		driver.close();
		
		
		
		
		
	}

}
