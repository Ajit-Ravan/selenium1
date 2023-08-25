package com.selenium.seleniumProject1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// first we have to set up browser driver and browse

		// browser driver setup
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\aravan\\Downloads\\chromedriver-win64\\chromedriver.exe");
		// cross policy commands
		ChromeOptions co = new ChromeOptions();

		// browser setup
		co.setBinary("C:\\Users\\aravan\\Downloads\\chrome-win64\\chrome.exe");

		// for open browser we need web driver
		// chrome diver object
		WebDriver driver = new ChromeDriver(co); // within this we have to pass object
		driver.get("https://google.com/");
		
		//implicite waits should not wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://firefox/");
		
		
		//Explicit wait 
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		

	}

}
