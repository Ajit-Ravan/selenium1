package com.selenium.seleniumProject1.Day_02_tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class browser1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//first we have to set up browser driver and browse
		
		// browser driver setup 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aravan\\Downloads\\chromedriver-win64\\chromedriver.exe");
		//cross policy commands 
		ChromeOptions co = new ChromeOptions();
		
		//browser setup
		co.setBinary("C:\\Users\\aravan\\Downloads\\chrome-win64\\chrome.exe");
		
		//for open browser we need web driver
		//chrome diver object
		WebDriver driver = new ChromeDriver(co); //within this we have to pass object 
		driver.get("http://google.com");

		//for typing the text in the search bar
//		driver.findElement(By.name("q")).sendKeys("google");   // q is name of the search bar element 
		
		//submit using keyboards enter button 
//		driver.findElement(By.className("gLFyf")).sendKeys("google",Keys.ENTER); 
//		//also we can do 
////		driver.findElement(By.name("q")).sendKeys("google",Keys.ENTER);
//		
//		//click google search button
//		driver.findElement(By.className("gLFyf")).submit();    //gLFyf is the class name of the search bar.
//		
//		//search google bing and window in 3 different windows
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("http://google.com");
//		driver.findElement(By.className("gLFyf")).sendKeys("google",Keys.ENTER); 
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("http://google.com");
//		driver.findElement(By.className("gLFyf")).sendKeys("bing",Keys.ENTER); 
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("http://google.com");
//		driver.findElement(By.className("gLFyf")).sendKeys("firefox",Keys.ENTER); 
		
		//for undone the repeatation of the finding by classaname we have to store that in web elemet object
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://google.com");
		WebElement searchbox = driver.findElement(By.className("gLFyf"));
		searchbox.sendKeys("typing using the web element variable");
		//1. clear command 
//		searchbox.clear();
		
		//2. click command ---linkText
		WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
		gmailLink.click();
		
		//partial linktext
		WebElement partialL = driver.findElement(By.partialLinkText("Gm"));
		partialL.click();
		
		//4. isEnable -- true and false return
		WebElement gmailbtn = driver.findElement(By.linkText("Gmail"));
		boolean isenable = gmailbtn.isEnabled();
		System.out.println(isenable);
		
		//5.isDisplay command 
		//6. isSelect command
		//7. submit command
//		driver.findElement(By.id("submitButton")).submit();
		
		
		//8. get Attrribut command 
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("http://google.com");
//		WebElement search = driver.findElement(By.id("APjFqb"));
//		String valueOfSearch = search.getAttribute("id");
//		System.out.println(valueOfSearch);
		
		//locators : 7. XPath
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://google.com");
		WebElement search = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		String valueOfSearch1 = search.getAttribute("id");
		System.out.println("xpath >>>>"+valueOfSearch1);
		
		//to get the data of multiple elements which are same class name 
//		driver.findElements(null)
		
		
		
		
		
		
	}

}
