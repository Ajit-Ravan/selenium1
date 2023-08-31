package com.selenium.seleniumProject1.Day_06_Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		//drag and drop 
		Actions actions = new Actions(driver);
		WebElement srcElement =driver.findElement(By.id("draggable")); //src
		WebElement destElement= driver.findElement(By.id("droppable")); //dest
		actions.clickAndHold(srcElement).release(destElement).build().perform();
		
		//scroll down object using javascript
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)", "");

	}

}
