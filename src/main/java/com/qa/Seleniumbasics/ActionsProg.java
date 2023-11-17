package com.qa.Seleniumbasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsProg {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String URL = "https://the-internet.herokuapp.com/drag_and_drop";
		driver.get(URL);
		// It is always advisable to Maximize the window before performing DragNDrop action driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		//Actions class method to drag and drop 
		Actions builder = new Actions(driver);
		WebElement from = driver.findElement(By.id("column-a"));
		WebElement to = driver.findElement(By.id("column-b")); 
		//Perform drag and drop
		builder.dragAndDrop(from, to).perform();

	}

}
