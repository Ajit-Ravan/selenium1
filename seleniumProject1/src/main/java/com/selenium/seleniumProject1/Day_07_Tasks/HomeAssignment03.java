package com.selenium.seleniumProject1.Day_07_Tasks;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeAssignment03 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));

		driver.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");
		// typing userEmail
		WebElement userEmail = driver.findElement(By.xpath("//*[@id=\"user_email\"]"));
		userEmail.sendKeys("admin@ca");
		// typing
		WebElement userPassword = driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
		userPassword.sendKeys("Admin");
		WebElement cpu = driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_CPU i5 8th Gen\"]"));
		cpu.click();

		WebElement mouse = driver.findElement(By.xpath("//*[@id=\"multiple_choice_1641271687_Mouse\"]"));
		mouse.click();

		List<WebElement> l = new ArrayList();
			l.add(cpu);
			l.add(mouse);
			
	for(WebElement m : l) {
		System.out.println(m.getText());
	}

		// quiting the window
//		Thread.sleep(120000);
//		driver.close();

	}

}
