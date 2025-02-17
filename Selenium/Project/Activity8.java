package AlchemyJobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity8 {
    public static void main(String[] args) {
        // Set up ChromeDriver path (Update path if needed)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Step 1: Open the browser and navigate to the login page
            driver.get("https://alchemy.hguy.co/jobs/wp-admin");

            // Step 2: Find username field and enter the username
            WebElement usernameField = driver.findElement(By.id("user_login"));
            usernameField.sendKeys("your-username");

            // Step 3: Find password field and enter the password
            WebElement passwordField = driver.findElement(By.id("user_pass"));
            passwordField.sendKeys("your-password");

            // Step 4: Find login button and click it
            WebElement loginButton = driver.findElement(By.id("wp-submit"));
            loginButton.click();

            // Step 5: Verify login by checking the presence of the dashboard
            Thread.sleep(2000); // Wait for the page to load
            if (driver.getCurrentUrl().contains("dashboard")) {
                System.out.println("Login successful!");
            } else {
                System.out.println("Login failed!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 6: Close the browser
            driver.quit();
        }
    }
}
