package com.selenium.seleniumProject1.Day_07_Tasks;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Actions actions = new Actions(driver);
		
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		//finding iframe for that particular div and store it into WebElement
		WebElement frame1 = driver.findElement(By.id("frame1"));
		
		//switching into that frame
		driver.switchTo().frame(frame1);
		
		//inside frame1 html page find and store that web element
		WebElement text =driver.findElement(By.id("sampleHeading"));  
		
		//Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#sampleHeading"}
//		  (Session info: chrome=116.0.5845.111)
		
		actions.doubleClick(text).click().perform();
		//getting the text of that div and stored it into string
		String finalt = text.getText();
		System.out.println(">>>> "+finalt);
		
		//switch to  main html page and try to print the text
		driver.switchTo().defaultContent();
		WebElement text2 =driver.findElement(By.id("sampleHeading"));
		String fromMainframe = text2.getText();
		System.out.println(">>>> "+fromMainframe);
		

	}

}
