package AlchemyJobs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity9 {
    public static void main(String[] args) {
        // Set up ChromeDriver path (Update path if needed)
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Step 1: Open the browser and navigate to the login page
            driver.get("https://alchemy.hguy.co/jobs/wp-admin");

            // Step 2: Login to the WordPress backend
            driver.findElement(By.id("user_login")).sendKeys("your-username");
            driver.findElement(By.id("user_pass")).sendKeys("your-password");
            driver.findElement(By.id("wp-submit")).click();

            // Step 3: Wait and navigate to "Job Listings" from the left-hand menu
            Thread.sleep(2000); // Allow page to load
            WebElement jobListingsMenu = driver.findElement(By.xpath("//div[text()='Job Listings']"));
            jobListingsMenu.click();

            // Step 4: Locate and click the "Add New" button
            Thread.sleep(2000);
            WebElement addNewButton = driver.findElement(By.xpath("//a[@class='page-title-action']"));
            addNewButton.click();

            System.out.println("Navigated to Add New Job Listing page successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Step 5: Close the browser
            driver.quit();
        }
    }
}

