package com.selenium.seleniumProject1.Day_07_Tasks;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class promptAlert {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		// Scrollbar
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,300)", "");
		WebElement btn1 = driver.findElement(By.xpath("//button[@id='promtButton']"));
		btn1.click();
		Alert alert= driver.switchTo().alert();
		alert.sendKeys("Hello");
		String str = alert.getText();
		alert.accept();
		System.out.println(str);

	}

}
