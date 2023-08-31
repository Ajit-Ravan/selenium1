package com.selenium.seleniumProject1.Day_06_Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LatestVersionWebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// browser setup
		WebDriverManager.chromedriver().setup();
		
		//creating driver object for web driver class (driver is mapped with edge browser)
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(6));

		
		//below relative locator for input which is below username
		//implicityWait
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
//		  By user =RelativeLocator.with(By.tagName("input")).below(By.className("oxd-input-group__label-wrapper"));
//          wait.until(ExpectedConditions.elementToBeClickable(user));
//          WebElement a= driver.findElement(user);
//          a.sendKeys("Admin");
			


		
			//RIGHT OF AND LEFT OF

			driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
			driver.get("https://www.softwaretestingmaterial.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));  //implicitlyWait 
			
			//left of 
			WebElement seleniumTutorial = driver.findElement(By.xpath("//*[@id=\"kt-layout-id_ce6aeb-d9\"]/div/div[2]/div/figure/a/img"));
			WebElement findLeftof = driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(seleniumTutorial));
			wait.until(ExpectedConditions.elementToBeClickable(findLeftof));  //Explicit wait condition
			findLeftof.click();
			
		//Right of 	
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://www.softwaretestingmaterial.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));  //implicitlyWait 
			driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);

			WebElement findRightof = driver.findElement(RelativeLocator.with(By.tagName("img")).toLeftOf(seleniumTutorial));
			findRightof.click();
			
		//near	
			driver.switchTo().newWindow(WindowType.TAB);
			driver.get("https://www.softwaretestingmaterial.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));  //implicitlyWait 
			WebElement findnearof = driver.findElement(RelativeLocator.with(By.tagName("img")).near(seleniumTutorial));
			findnearof.click();
			
			
	}

}
