package com.selenium.seleniumProject1.Day_07_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatesInSelenium {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/bus-ticket-booking");

		// Enter source location
		WebElement src = driver.findElement(By.id("source"));
		src.sendKeys("pune");

		// Enter destination location
		WebElement dst = driver.findElement(By.id("destination"));
		dst.sendKeys("Chennai");

		// Dates in selenium
		WebElement datepick = driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','04/10/2023')", datepick);
		
		WebElement searchbtn= driver.findElement(By.xpath("//*[@id=\"seo_search_btn\"]"));
		searchbtn.click();
		
		// delete the window
		Thread.sleep(20000);
//		driver.quit();
	}

}
