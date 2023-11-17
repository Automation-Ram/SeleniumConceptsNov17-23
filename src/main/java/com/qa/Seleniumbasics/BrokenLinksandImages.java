package com.qa.Seleniumbasics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksandImages {

	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		alllinks.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Size of all full links and images:" + alllinks.size());

		List<WebElement> activeLinks = new ArrayList<WebElement>();
		for (int i = 0; i < alllinks.size(); i++) {
			// System.out.println(alllinks.get(i).getAttribute("href"));
			if (alllinks.get(i).getAttribute("href") != null
					&& (!alllinks.get(i).getAttribute("href").contains("javascript"))) {
				activeLinks.add(alllinks.get(i));
			}

		}
		System.out.println("Size of the active links and images:" + activeLinks.size());

		for (int j = 0; j < activeLinks.size(); j++) {
			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
					.openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();
			System.out.println(activeLinks.get(j).getAttribute("href") + " -------->" + response);
		}

	}

}
