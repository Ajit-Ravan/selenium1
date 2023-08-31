package com.selenium.seleniumProject1.Day_07_Tasks;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsInSelenium {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		WebElement typeInput =driver.findElement(By.name("cusid"));
		typeInput.sendKeys("Hello");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		//confirmation alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Alert alert2 = driver.switchTo().alert();
		String alert2content = alert2.getText();
		alert2.accept();
		System.out.println(alert2content);
		
		//prompt alert
		
		
		
		
		
	}

}
