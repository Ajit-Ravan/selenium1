package com.selenium.seleniumProject1.Day_07_Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectclass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=p.sort_order&order=ASC");
		// select object for sortby dropsown
		Select s = new Select(driver.findElement(By.xpath("//*[@id=\"input-sort\"]")));

		List<WebElement> li = s.getOptions();
		List<String> str = new ArrayList();
		for (int i = 0; i < li.size(); i++) {
			str.add(li.get(i).getText());
		}

		// select dropdown using select object //it will select 2 nd index in that
		// dropdown
		//s.selectByIndex(2);
		// select by value
		//s.selectByValue("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=24&sort=rating&order=DESC");
		// select by visible text
		
		s.selectByVisibleText("Default");
		Collections.sort(str);
		for (String st : str) {
			System.out.println(st);
		}
		

		//quiting the window
		Thread.sleep(30000);
		driver.close();
	}

}
