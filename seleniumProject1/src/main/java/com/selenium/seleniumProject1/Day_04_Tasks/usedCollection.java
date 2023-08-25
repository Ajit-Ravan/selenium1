package com.selenium.seleniumProject1.Day_04_Tasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class usedCollection {

	public static void main(String[] args) throws Exception {
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
		driver.get("http://flipkart.in");

		Thread.sleep(2000);

		// clear that login popup
		driver.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);

		// type mobile and enter key
		driver.findElement(By.name("q")).sendKeys("mobile", Keys.ENTER);

		// click samsung checkbox
		Thread.sleep(2000);
		WebElement samsung = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[3]/div[2]/div[1]/div[2]/div/label/div[1]"));
		samsung.click();
		String classname = samsung.getAttribute("className");
		System.out.println(classname);

		// print all the elements using class name because class name is same

		List<WebElement> list = driver.findElements(By.className("_24_Dny"));

		for (WebElement webElement  : list) {
			System.out.println(webElement.getText());
		}

	}

}
