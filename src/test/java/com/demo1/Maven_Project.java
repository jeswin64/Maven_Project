package com.demo1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maven_Project {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.americanexpress.com/en-in/");
		
		WebElement findElement = driver.findElement(By.xpath("//span[text()='Log In']"));
	findElement.click();
	TakesScreenshot ts = (TakesScreenshot) driver;
	
	File from = ts.getScreenshotAs(OutputType.FILE);
File to = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Maven_Project\\screenshot\\abc.png");
 FileUtils.copyFile(from, to);
	}
}
