package fst_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Activity3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/login-form");
		String title =driver.getTitle();
		System.out.println(title);
		//driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");

		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		Thread.sleep(5000);
		String title1 =driver.getTitle();
		System.out.println(title1);
		driver.close();
		
		
		
		
		
	}

}
