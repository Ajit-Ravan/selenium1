package com.selenium.seleniumProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class seleniumBlogsSpot {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		
		//red checkbox
		WebElement redCheckbox = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]"));
		boolean isEnable = redCheckbox.isEnabled();
		if(isEnable) {
			System.out.println("it is enabled ...");
		}else {
			System.out.println("its not enable..");
		}
		boolean isSelected = redCheckbox.isSelected();
		if(isSelected) {
			System.out.println("it is selected..");
		}else {
			System.out.println("it is not selected..");
		}
		
		Thread.sleep(2000);
		WebElement red = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[1]"));
		red.click();
		
		Thread.sleep(2000);
		WebElement orange = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[4]"));
		orange.click();
		
		Thread.sleep(2000);
		WebElement green = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[5]"));
		green.click();

		Thread.sleep(2000);
		//check internet exploral button slected or not
		WebElement InternetEx = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[1]"));
		boolean isSelectedIE = InternetEx.isSelected();
		if(isSelectedIE) {
			System.out.println("Internet Exploral is selected");
		}else {
			System.out.println("internet exploral is not selected");
		}
		
		//check opera radio button slected or not
		WebElement opera = driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[3]"));
		boolean isSelectedOpera = opera.isSelected();
		if(isSelectedOpera) {
			System.out.println("opera raido button is selected");
		}else {
			System.out.println("opera radio button is not selected");
		}
		
		
	}

}
