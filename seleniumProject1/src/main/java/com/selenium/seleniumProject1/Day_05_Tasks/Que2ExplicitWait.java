package com.selenium.seleniumProject1.Day_05_Tasks;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Que2ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//

// Question 1 :Synchronization problem using Explicit wait

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
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
// maximize screeen
		driver.manage().window().maximize();
// implicitly wait

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
// Enter username and password
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));

		WebElement username = driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		wait.until(ExpectedConditions.elementToBeClickable(username));
		username.sendKeys("Admin");

		WebElement pass = driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		wait.until(ExpectedConditions.elementToBeClickable(pass));
		pass.sendKeys("admin123");

		WebElement Enter = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		wait.until(ExpectedConditions.elementToBeClickable(Enter));

		Enter.click();

		// find Admin and click on Admin
		WebElement Admin = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span"));
		wait.until(ExpectedConditions.elementToBeClickable(Admin));
		Admin.click();

		// type Admin in search bar
		WebElement searchUsername = driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));
		wait.until(ExpectedConditions.elementToBeClickable(searchUsername));
		searchUsername.sendKeys("Admin");

		// click on search button
		WebElement searchBtn = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
		wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
		searchBtn.click();
		
		//print list on the console
		List<WebElement> list = driver.findElements(By.className("orangehrm-container"));
		for(WebElement webE : list) {
			System.out.println(webE.getText());
		}
		

		// logout click on profile and logout button
//		WebElement profile = driver
//				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img"));
//		wait.until(ExpectedConditions.elementToBeClickable(profile));
//		profile.click();
//
//		WebElement logout = driver.findElement(By.linkText("Logout"));
//		wait.until(ExpectedConditions.elementToBeClickable(logout));
//		logout.click();

	}
}