package com.selenium.seleniumProject1.Day_05_Tasks;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
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
//		driver.get("https://google.com/");

		// implicite

		// implicite waits should not wait for given time period its only wait for
		// previous task to done after that next tasks are run
		// how to find page loading time
//		long starttime = System.currentTimeMillis();
//		driver.get("https://omayo.blogspot.com/");
//		driver.findElement(By.className("dropbtn")).click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
//		long endtime = System.currentTimeMillis();
//		
//		System.out.println(((endtime-starttime)/1000.0)+" seconds..");
//		driver.findElement(By.linkText("Facebook")).click();

		// Explicit wait
//		long starttime = System.currentTimeMillis();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
//		driver.manage().window().maximize();
//		driver.get("https://omayo.blogspot.com/");
//		WebElement webElement = driver.findElement(By.id("timerButton"));
//		wait.until(ExpectedConditions.elementToBeClickable(webElement));  //Explicit wait condition
//		long endtime = System.currentTimeMillis();
//		System.out.println(((endtime-starttime)/1000.0)+" seconds..");
//		webElement.click();

		// handling chrome notifications
//		ChromeOptions co1 = new ChromeOptions();
//		co.addArguments("--desable-notifications");
//		WebDriver driver2 = new ChromeDriver(co1);

		// fluent wait

		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)) // this defines the
																										// total amount
																										// of time to
																										// wait for
				.pollingEvery(Duration.ofSeconds(3)) // this defines the polling frequency
				.ignoring(NoSuchElementException.class); // this defines the exception to ignore

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("foo"));
			}
		});

	}

}
