package fst_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
public class Activity8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/mouse-events");
		String title =driver.getTitle();
		System.out.println(title);
		Actions builder = new Actions(driver);
		
		WebElement h1=driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
		WebElement h2=driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
		WebElement h3=driver.findElement(By.xpath("//h1[text()='src']"));
		WebElement h4=driver.findElement(By.xpath("//h1[text()='target']"));
		
		builder.click(h1).moveToElement(h2).click(h2).build().perform();
		String s1 =driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(s1);
		
		builder.doubleClick(h3).pause(2000).moveToElement(h4).contextClick(h4).build().perform();
		Thread.sleep(3000);
		
		WebElement h5=driver.findElement(By.xpath("//div[@id='menu']/div/ul/li[1]"));
		
		builder.moveToElement(h5).click(h5).build().perform();
		Thread.sleep(3000);
		String s2 =driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(s2);
		
		
		driver.close();
		
		
		
		
		
	}

}
