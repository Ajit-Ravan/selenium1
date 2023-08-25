package com.selenium.seleniumProject1.Day_05_Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Que01ImplicitWait {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Question 1 :Synchronization problem using Implicit wait

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
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// maximize screeen
		driver.manage().window().maximize();
		// implicitly wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		// Enter username and password
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"))
				.sendKeys("Admin");

		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"))
				.sendKeys("admin123");

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"))
				.sendKeys(Keys.ENTER);
		
		// click on the profile
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img")).click();
		
	
		

		// click logout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.linkText("Logout")).click();
		// verify the user returns into the login page
		String pageURL = driver.getCurrentUrl();
		if(pageURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
			System.out.println("User returns on the login page");
		}else {
			System.out.println("User not returns on the login page");
		}
	}

}
