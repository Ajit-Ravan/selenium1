package com.selenium.seleniumProject1.Day_02_tasks;


import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser2 {

	public static void main(String[] args) throws Exception {
		// browser setup
		WebDriverManager.edgedriver().setup();
		
		//creating driver object for web driver class (driver is mapped with edge browser)
		WebDriver driver = new EdgeDriver();
		driver.get("http://omayo.blogspot.com");
		
		//for full screen window 
		driver.manage().window().maximize();
		
		//getting the current window id 
		String winID = driver.getWindowHandle();
		System.out.println("win ID >>>"+winID);

		//switch to another tab and handle the all tabs 
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://google.com");
		Set<String>handle = driver.getWindowHandles();
		for( String h: handle) {
			System.out.println(driver.switchTo().window(h));
			System.out.println("getting title >>"+driver.getTitle());
			System.out.println("this is handled window ID :"+h);
		}
		
		//another window within that previous window
		driver.get("http://google.com");
		
		driver.navigate().back();
//		Thread.sleep(3000);
		driver.navigate().forward();
		driver.navigate().refresh();
		
		
		//BROWSER COMMANDS 
//		//get title
//		String title = driver.getTitle();
//		System.err.println("Title :"+title);
//		
//		//getting the current url
//		String CurrentUrl = driver.getCurrentUrl();
//		System.out.println(CurrentUrl);
//		
//		//getting page source
//		String pageSource = driver.getPageSource();
//		System.out.println("page source:"+pageSource);
//		//length of page source
//		System.out.println("page source length : "+ pageSource.length());
		
		//close ()
//		driver.close();
		
//		driver.quit();

	}

}
