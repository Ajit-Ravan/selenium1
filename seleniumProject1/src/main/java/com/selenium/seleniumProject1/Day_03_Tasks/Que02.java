package com.selenium.seleniumProject1.Day_03_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Que02 {
	public static void main(String [] args) {
		
		//setup edge
		WebDriverManager.edgedriver().setup();
		//creating object of edgedriver
		WebDriver driver = new EdgeDriver();
		//getting website
		driver.get("www.demoqa.com");
		//maximize window full 
		driver.manage().window().maximize();
		
		//
			driver.switchTo().newWindow(WindowType.TAB);   //creating new tab
			driver.switchTo().newWindow(WindowType.TAB.WINDOW); //creating new window
        //
		
		
	}

}
