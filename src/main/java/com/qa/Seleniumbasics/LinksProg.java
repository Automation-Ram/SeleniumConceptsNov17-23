package com.qa.Seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksProg {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (int i = 0; i < allLinks.size(); i++) {
			String str = allLinks.get(i).getText();
			System.out.println(str);
		}

	}

}
