package fst_testng;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity10 {
	WebDriver driver = new ChromeDriver();
	WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(10));
	
	
    public static List<List<String>> readExcel(String filePath) {
        List<List<String>> data = new ArrayList<List<String>>();
        try {
            FileInputStream file = new FileInputStream(filePath);
 
            // Create Workbook instance holding reference to Excel file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            // Get first sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
 
            // Iterate through each rows one by one
            for (Row cells : sheet) {
                // Temp variable
                List<String> rowData = new ArrayList<String>();
                for (Cell cell : cells) {
                    // Store row data
                    rowData.add(cell.getStringCellValue());
                }
                // Store row data in List
                data.add(rowData);
            }
            file.close();
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
    
	@DataProvider(name="events")
	public static Object[][] event()
	{
		String fp = "src/test/resources/sample.xlsx";
		List<List<String>> data = readExcel(fp);
		return new Object[][] {
				
			 	{ data.get(1) },
	            { data.get(2) },
	            { data.get(3) }
				};
		
	}
	
	
	
	@BeforeClass
	public void Setup()
	{
	driver.get("https://training-support.net/webelements/simple-form");
	}
	
	@Test(dataProvider="events")
	public void test1(List<String> rows) throws InterruptedException 
	{
	driver.findElement(By.xpath("//input[starts-with(@id, 'full-name')]")).sendKeys(rows.get(0));
	driver.findElement(By.xpath("//input[contains(@id, 'email')]")).sendKeys(rows.get(1));
	driver.findElement(By.xpath("//input[contains(@name, 'event-date')]")).sendKeys(rows.get(2).replaceAll("\"", ""));
	driver.findElement(By.cssSelector("textarea[id*='additional-details']")).sendKeys(rows.get(3));
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@id='action-confirmation']")));
	String s1=driver.findElement(By.xpath("//h3[@id='action-confirmation']")).getText();
	System.out.println(s1);
	driver.navigate().refresh();
	}
	
	@AfterClass
	public void Close()
	{
	driver.close();
	}

	}


