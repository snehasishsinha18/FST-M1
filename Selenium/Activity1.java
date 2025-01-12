package fst_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Activity1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/");
		String title =driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("About Us")).click();
		Thread.sleep(5000);
		String title1 =driver.getTitle();
		System.out.println(title1);
		driver.close();
		
		
		
		
		
	}

}
