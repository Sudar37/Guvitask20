package Guvitask20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que2 {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the Guvi website
        driver.get("https://www.guvi.in/");

        WebElement signupButton = driver.findElement(By.linkText("Signup"));
        signupButton.click();

        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("Sudar");

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("sudar2@gmail.com");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("Sudarguvi@111");

      
        WebElement signupSubmitButton = driver.findElement(By.id("signup-submit"));
        signupSubmitButton.click();


        // Locate and click the Login button
        WebElement loginButton = driver.findElement(By.linkText("Login"));
        loginButton.click();

     
        WebElement loginEmailField = driver.findElement(By.id("login-email"));
        loginEmailField.sendKeys("sudar2@gmail.com");

        WebElement loginPasswordField = driver.findElement(By.id("login-password"));
        loginPasswordField.sendKeys("Sudarguvi@111");

        // Click the Login button
        WebElement loginSubmitButton = driver.findElement(By.id("login-submit"));
        loginSubmitButton.click();

        // Close the browser
        driver.quit();
	}

}
