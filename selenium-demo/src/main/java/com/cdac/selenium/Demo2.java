package com.cdac.selenium;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://vjmklvljn3.csb.app");
		
		driver.manage().timeouts().implicitlyWait(Duration.of(10, ChronoUnit.SECONDS));
		//driver.findElement(By.tagName("span")).click();
		//driver.findElement(By.linkText("Create New Contact")).click();
		driver.findElement(By.xpath("//div[@class='App']/span")).click();
		//driver.findElement(By.xpath("//form/div[@class='form-group'][1]/input")).sendKeys("majrul");
		driver.findElement(By.xpath("//form/div[1]/input")).sendKeys("majrul");
		driver.findElement(By.xpath("//form/div[2]/input")).sendKeys("12345");
		driver.findElement(By.className("btn-primary")).click();
		try { Thread.sleep(10000); } catch(Exception e) { }
		/*TODO:
		Convert adding a contact in the form as a test case
		and assert whether the contact was added or not
		*/
		driver.close();
	}
}
