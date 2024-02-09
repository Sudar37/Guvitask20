package Guvitask20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que1 {

	public static void main(String[] args) {


	        // Initialize ChromeDriver and maximize the window
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Navigate to the jQuery UI 
	        driver.get("https://jqueryui.com/datepicker/");

	        
	        WebElement iframe = driver.findElement(By.className("demo-frame"));
	        driver.switchTo().frame(iframe);

	        // Click the date input field to open the datepicker
	        WebElement dateInput = driver.findElement(By.id("datepicker"));
	        dateInput.click();

	        // Select the next month
	        WebElement nextMonthButton = driver.findElement(By.xpath("//a[@title='Next']"));
	        nextMonthButton.click();

	        // Select the date "22"
	        WebElement date22 = driver.findElement(By.xpath("//a[text()='22']"));
	        date22.click();

	        // Get the selected date and print it to the console
	        String selectedDate = dateInput.getAttribute("value");
	        System.out.println("Selected date: " + selectedDate);

	        // Close the browser
	        driver.quit();
	}

}
