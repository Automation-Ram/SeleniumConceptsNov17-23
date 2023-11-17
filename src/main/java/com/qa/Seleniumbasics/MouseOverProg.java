package com.qa.Seleniumbasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverProg {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement ele = driver.findElement(By.xpath("//button[@class='dropbtn']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();

		List<WebElement> links = driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));

		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			WebElement element = links.get(i);
			String text = element.getAttribute("innerHTML");
			if (text.equalsIgnoreCase("Appium")) {
				element.click();
				break;
			}
		}

	}

}
