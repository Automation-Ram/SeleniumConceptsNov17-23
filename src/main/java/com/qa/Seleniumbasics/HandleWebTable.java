package com.qa.Seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWebTable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		List<WebElement> data = driver.findElements(By.xpath("//table[@name='cust_123']//tr"));
		for (WebElement str : data) {
			System.out.println(str.getText());
		}

	}

}
