package com.selenium.seleniumProject1.Day_07_Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class homeAssignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		driver.get("https://demo.smart-hospital.in/site/login");
		// click on pathologist
		driver.findElement(By.xpath("//*[@style=\"background:#e91e63;\"]")).click();
		// click on sign in
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		// click on messaging
		driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[8]/a/span")).click();
		// click on new message driver
		driver.findElement(By.linkText("Post New Message")).click();
		// Title
		driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys("new message");

		// switching the frame
		WebElement frame = driver.findElement(By.className("wysihtml5-sandbox"));
		driver.switchTo().frame(frame);

		// input text
		driver.findElement(By.xpath("/html/body")).sendKeys("this is new message");

		// switching to default frame
		driver.switchTo().defaultContent();

		// notice date
		WebElement noticeDate = driver.findElement(By.xpath("//*[@id=\"date\"]"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].setAttribute('value','10/10/2023')", noticeDate);

		// another way to send the date
		noticeDate.sendKeys("09122023");

		// publish date
		WebElement publishDate = driver.findElement(By.xpath("//*[@id=\"publish_date\"]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].setAttribute('value','12/10/2023')", publishDate);

		// click on send button
		 driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[3]/div/button")).sendKeys("new message");
		WebElement finalmsg = driver.findElement(By.xpath("//*[@id=\"form1\"]/div/div[2]/div/div[1]"));
		if (finalmsg.getText().equals("Record Saved Successfully")) {
			System.out.println("Record Saved Successfully");
		} else {
			System.out.println("Record Not Saved Successfully");
		}

	}

}
