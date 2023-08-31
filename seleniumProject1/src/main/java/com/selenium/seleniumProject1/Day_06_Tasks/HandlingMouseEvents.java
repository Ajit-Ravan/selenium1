package com.selenium.seleniumProject1.Day_06_Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingMouseEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));
		//1. hover -->> moveToElement()
		driver.get("https://www.browserstack.com");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		WebElement hoverElement = driver.findElement(By.xpath("//*[@id=\"products-dd-toggle\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(hoverElement));
		actions.moveToElement(hoverElement).perform();
		
		//2. context click() -->> it will right click on element
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		WebElement getStatedfree = driver.findElement(By.xpath("//*[@id=\"signupModalButton\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(getStatedfree));

		actions.contextClick(getStatedfree).perform();
		
		//3. doubleClick()  -->
		WebElement dobleclick = driver.findElement(By.xpath("//*[@id=\"post-26\"]/section/div[1]/div/div/div/article[1]/div/div/div/div[1]/h1"));
		wait.until(ExpectedConditions.elementToBeClickable(dobleclick));

		actions.doubleClick(dobleclick).perform();
		
		driver.close();
		
	}

}
