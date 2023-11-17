package com.qa.Seleniumbasics;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']//a)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']//a)[2]")).click();
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']//a)[3]")).click();
		driver.findElement(By.xpath("(//div[@class='orangehrm-login-footer-sm']//a)[4]")).click();

		Set<String> handle = driver.getWindowHandles();
		List<String> hList = new ArrayList<>(handle);
		if (switchToRightWindow("Facebook", hList)) {
			System.out.println(driver.getCurrentUrl() + " " + driver.getTitle());
		}

	}

	public static boolean switchToRightWindow(String windowTitle, List<String> hList) {
		for (String e : hList)

		{
			String title = driver.switchTo().window(e).getTitle();
			if (title.contains(windowTitle)) {
				System.out.println("Found the right window");
				return true;
			}
		}
		return false;
	}

}
