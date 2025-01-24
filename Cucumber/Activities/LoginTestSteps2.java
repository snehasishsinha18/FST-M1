package stepDefinitions;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps2 extends BaseClass {

	

	@Given("the user is on the login page")
	public void login()throws Throwable  {
		
		driver.get("https://training-support.net/webelements/login-form");
	}

	@When("the user enters username and password")
	public void name() throws Throwable  {
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		
	}
	@When("the user enters {string} and {string}")
	public void name2(String username, String password) throws Throwable  {
		
		WebElement us=driver.findElement(By.id("username"));
		WebElement pw=driver.findElement(By.id("password"));
		us.clear();
		pw.clear();
		us.sendKeys(username);
		pw.sendKeys(password);
		
	}
	@And("clicks the submit button")
	public void submit() throws Throwable  {
		
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
	}

	@Then("get the confirmation message and verify it")
	public void confirm() throws Throwable  {
		
		String result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.mt-5"))).getText();
		Assert.assertEquals("Welcome Back, Admin!", result);
	}
    @Then("get the confirmation text and verify message as {string}")
    public void confirmMessageAsInput(String expectedMessage) {
    	// Find the confirmation message
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("h2.mt-5"), "Welcome"));
        String message = driver.findElement(By.cssSelector("h2.mt-5")).getText();
        // Assert message
        Assertions.assertEquals(expectedMessage, message);
}
}