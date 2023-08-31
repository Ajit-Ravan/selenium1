package com.selenium.seleniumProject1.Day_07_Tasks;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingTables {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
//print single element	
//	WebElement  we=   driver.findElement(By.xpath("//table[@id=\"table1\"]//tr"));
//		System.out.println(we.getText());
		
		//printing the table on the console
		List<WebElement> list = driver.findElements(By.xpath("//table[@id=\"table1\"]//tr//td[3]"));
		for(WebElement li: list) {
			System.out.println(li.getText());
		}
//		
		
		//fetching individual values
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody//tr"));
		List<String> str = new ArrayList();
		for(int i=0;i<row.size();i++) {
			WebElement num = driver.findElement(By.xpath("//table[@id=\"table1\"]//tr["+(i+1)+"]//td[3]"));
			System.out.println(" column3 each element  >>> "+num.getText());
			str.add(num.getText());
		}
		
		System.out.println("3rd column in sorting order :");
		Collections.sort(str);
		for(String w: str) {
			System.out.println(">>> "+w);
		}
		
		
		//quiting the window
		Thread.sleep(20000);
		driver.close();
	}

}
