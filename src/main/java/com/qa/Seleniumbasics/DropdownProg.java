package com.qa.Seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownProg {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement tag = driver.findElement(By.tagName("select"));
		Select sel = new Select(tag);
		List<WebElement> values = sel.getOptions();
		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i).getText());
		}

	}

}
