package com.seleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoOrangeLive {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		// opening demo orange live
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// maximizing the screeen
		driver.manage().window().maximize();
		// entering username
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"))
				.sendKeys("Admin");
		// enetering password
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"))
				.sendKeys("admin123");
		// click on login button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

		// click on profile
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img")).click();
		// click on logout
		driver.findElement(By.linkText("Logout")).click();

		// varifying that user returns into login page or not
		String url = driver.getCurrentUrl();

		if (url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
			System.out.println("User returns into login page");
		} else {
			System.out.println("User did not return into login page");
		}

	}

}
