package appium_test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Activity3 {
    private AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testTodoList() {
        driver.get("https://v1.training-support.net/selenium");
        driver.findElement(By.xpath("//android.view.View[contains(@text, 'To-Do List')]")).click();

        String[] tasks = {"Add tasks to list", "Get number of tasks", "Clear the list"};
        for (String task : tasks) {
            driver.findElement(By.id("taskInput")) .sendKeys(task);
            driver.findElement(By.xpath("//button[contains(text(),'Add Task')]")).click();
        }

        int taskCount = driver.findElements(By.className("task")) .size();
        Assert.assertEquals(taskCount, 3);

        driver.findElements(By.className("task")) .forEach(MobileElement::click);
        driver.findElement(By.xpath("//button[contains(text(),'Clear List')]")).click();
        Assert.assertEquals(driver.findElements(By.className("task")) .size(), 0);
    }

    @Test
    public void testLoginCorrect() {
        driver.get("https://v1.training-support.net/selenium");
        driver.findElement(By.xpath("//android.view.View[contains(@text, 'Login Form')]")).click();

        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        String successMessage = driver.findElement(By.id("message")) .getText();
        Assert.assertEquals(successMessage, "Welcome Back, admin");
    }

    @Test
    public void testLoginIncorrect() {
        driver.get("https://v1.training-support.net/selenium");
        driver.findElement(By.xpath("//android.view.View[contains(@text, 'Login Form')]")).click();

        driver.findElement(By.id("username")).sendKeys("user");
        driver.findElement(By.id("password")).sendKeys("wrongpass");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        String errorMessage = driver.findElement(By.id("message")) .getText();
        Assert.assertEquals(errorMessage, "Invalid Credentials");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
