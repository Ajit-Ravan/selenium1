package com.seleniumtest;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukariTask {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// opening naukari .com website
		driver.get("https://www.naukri.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		String s = driver.getWindowHandle();
		JavascriptExecutor jss = (JavascriptExecutor) driver;

		jss.executeScript("window.scrollBy(0,300)", "");
		//finding element which containig & IT text
		driver.findElement(By.xpath("//*[contains(text(),'& IT')]")).click();

		ArrayList<String> findTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(findTabs.get(1));

		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/section[2]/div[2]/div[1]/div[2]/div[1]/label/p/span[1]"));
		actions.moveToElement(element).click().perform();

		Thread.sleep(3000);

		WebElement first = driver.findElement(By.xpath(""));

		actions.moveToElement(first).click().perform();

		findTabs = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(findTabs.get(2));

		Thread.sleep(3000);

		driver.switchTo().window(s);

		Thread.sleep(8000);

		driver.quit();

	}

}
