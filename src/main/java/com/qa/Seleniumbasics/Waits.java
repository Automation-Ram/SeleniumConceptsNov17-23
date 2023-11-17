package com.qa.Seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		Explicit Wait
//		WebDriverWait wait = new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'COMPOSE')]")));

//		Fluent Wait
//		//Declare and initialise a fluent wait
//		FluentWait wait = new FluentWait(driver);
//		//Specify the timout of the wait
//		wait.withTimeout(5000, TimeUnit.MILLISECONDS);
//		//Sepcify polling time
//		wait.pollingEvery(250, TimeUnit.MILLISECONDS);
//		//Specify what exceptions to ignore
//		wait.ignoring(NoSuchElementException.class)
//
//		//This is how we specify the condition to wait on.
//		//This is what we will explore more in this chapter
//		wait.until(ExpectedConditions.alertIsPresent());

	}

}
