package fst_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
public class Activity9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/drag-drop");
		String title =driver.getTitle();
		System.out.println(title);
		Actions builder = new Actions(driver);	
		WebElement h1=driver.findElement(By.id("ball"));
		WebElement h2=driver.findElement(By.id("dropzone1"));
		WebElement h3=driver.findElement(By.id("dropzone2"));
		
		builder.dragAndDrop(h1, h2).build().perform();
		
		String s1=h2.findElement(By.className("dropzone-text")).getText();
		System.out.println(s1+ "in Dropzone1");
		
		builder.dragAndDrop(h2, h3).build().perform();
		
		String s2=h3.findElement(By.className("dropzone-text")).getText();
		System.out.println(s2+ "in Dropzone2");
		
		driver.close();
		
		
		
		
		
	}

}
