package com.seleniumtest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SmartHospital {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		// open the url
		driver.get("https://demo.smart-hospital.in/site/login");

		// clicking on the pathology
		driver.findElement(By.xpath("//*[@style=\"background:#e91e63;\" ]")).click();

		// click on sign in button
		driver.findElement(By.xpath("//button[@type=\"submit\" ]")).click();

		// click on messaging
		driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[8]/a/span")).click();

		// click on post new message
		driver.findElement(By.linkText("Post New Message")).click();

		// type message in title input
		driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys("For New Message");

		// switch to frame for accessing the i frame html page elements

		driver.switchTo().frame(driver.findElement(By.xpath("//*[@class=\"wysihtml5-sandbox\" ]")));

		// type message in title input
		driver.findElement(By.xpath("/html/body")).sendKeys("This is my first message");

		// switch to default frame
		driver.switchTo().defaultContent();

		// notice date
		driver.findElement(By.xpath("//*[@id=\"date\"]")).sendKeys("05122023");

		// publish date
		driver.findElement(By.xpath("//*[@id=\"publish_date\"]")).sendKeys("10122023");

		// send button
		driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[3]/div/button")).click();

		// gettting final message
		WebElement msg = driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[2]/div/div[1]"));
		String finalMsg = msg.getText();
		if (finalMsg.equals("Record Saved Successfully")) {
			System.out.println("Record is varified");
		} else {
			System.out.println("Record is not varified");
		}

	}

}
