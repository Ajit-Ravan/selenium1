package com.selenium.seleniumProject1.Day_06_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class keyboardMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		WebElement type = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		Actions actions  = new Actions(driver);
		//pressing the shift key
		actions.keyDown(Keys.SHIFT);
		actions.sendKeys("hello").build().perform();
		//key up the shift key
		actions.keyUp(Keys.SHIFT);
		actions.sendKeys("how are you ??").perform();
		

	}

}
