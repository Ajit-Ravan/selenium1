package com.selenium.seleniumProject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Que01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// browser setup
		WebDriverManager.edgedriver().setup();
		//
		WebDriver driver = new EdgeDriver();
		//opening flipkart web application
		driver.get("https://www.flipkart.com/");
		//for full screen window 
		driver.manage().window().maximize();
		
		//get page title name and title length
		String titleName = driver.getTitle();
		int titleLength = driver.getTitle().length();
		
		System.out.println("title name : "+ titleName + " and the title length :"+titleLength);
		
		//get page url and varify if its correct page opened or not 
		String pageurl = driver.getCurrentUrl();
		System.out.println("page URL :"+pageurl);
        if (pageurl.equals("https://www.flipkart.com/")) {
            System.out.println("The correct page is loaded.");
        } else {
            System.out.println("The incorrect page is loaded.");
        }
		
		//getting sourcecode and printing the sourcecodelength on the console
		driver.getPageSource();
		int sourceCodeLength = driver.getPageSource().length();
		System.out.println(sourceCodeLength);
		
		//closing the browser
		driver.quit();
		
		
		
	}

}
