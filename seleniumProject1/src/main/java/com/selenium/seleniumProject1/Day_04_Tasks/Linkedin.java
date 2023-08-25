package com.selenium.seleniumProject1.Day_04_Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Linkedin {

	public static void main(String[] args) throws InterruptedException {

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

		driver.get("https://in.linkedin.com/");

		Thread.sleep(3000);

		driver.manage().window().maximize();

		driver.findElement(By.id("session_key")).sendKeys("ajit@gmail.com");

		driver.findElement(By.id("session_password")).sendKeys("pass@123");

		driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/div[2]/button")).click();

		// Test_case 2

		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"global-nav-typeahead\"]/input")).sendKeys("Expleo", Keys.ENTER);

		// Test_Case3

		Thread.sleep(3000);

		WebElement followButton = driver.findElement(By.id("ember219"));

		String Fbutton = followButton.getText();

		if (Fbutton.equals("Following")) {

			System.out.println("you are already following");

		} else {
			followButton.click();
		}
		// Test_case4

		Thread.sleep(4000);

		driver.findElement(By.linkText("Expleo Group")).click();

	}

}