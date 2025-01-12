package fst_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
public class Activity5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/dynamic-controls");
		String title =driver.getTitle();
		System.out.println(title);
		
		boolean h1 =driver.findElement(By.xpath("//input[@id='checkbox']")).isDisplayed();
		System.out.println(h1);
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		boolean h2 =driver.findElement(By.xpath("//input[@id='checkbox']")).isDisplayed();
		System.out.println(h2);
		driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
		boolean h3 =driver.findElement(By.xpath("//input[@id='checkbox']")).isDisplayed();
		System.out.println(h3);
		driver.close();
		
		
		
		
		
	}

}
