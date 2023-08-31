package com.selenium.seleniumProject1.Day_07_Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleSelect {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		
		
		Select s = new Select(driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[10]/td[2]/select")));
		s.selectByIndex(2);
		s.selectByIndex(3);
		
		List<WebElement> li = s.getAllSelectedOptions();
		for(WebElement we : li) {
			System.out.println(we.getText());
		}
		
		
		Thread.sleep(40000);
		s.deselectAll();
	}

}
