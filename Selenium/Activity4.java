package fst_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
public class Activity4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://training-support.net/webelements/target-practice");
		String title =driver.getTitle();
		System.out.println(title);
		
		String h1 =driver.findElement(By.xpath("//h3[text()='Heading #3']")).getText();
		System.out.println(h1);
		WebElement h2 =driver.findElement(By.xpath("//h5[text()='Heading #5']"));
		String h3=h2.getCssValue("color");
		Color cs = Color.fromString(h3);
		System.out.println(cs.asHex());
		
		String h4=driver.findElement(By.xpath("//button[text()='Purple']")).getAttribute("Class");
		System.out.println(h4);
		
		String h5=driver.findElement(By.xpath("//button[text()='Slate']")).getText();
		System.out.println(h5);
		
		driver.close();
		
		
		
		
		
	}

}
