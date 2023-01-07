package com.cdac.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","c:\downloads\chromedriver\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.makemytrip.com");
		driver.get("http://localhost:8181/selenium-demo/");
		System.out.println(driver.getTitle());
		//try { Thread.sleep(2000); } catch(Exception e) { }
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.id("link1")).click();
		driver.findElement(By.className("loginlink")).click();
		//driver.findElement(By.name("username")).sendKeys("majrul");
		//driver.findElement(By.name("password")).sendKeys("123");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("majrul");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("123");
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		WebElement w = driver.findElement(By.name("role"));
		Select s = new Select(w);
		//s.selectByIndex(2);
		s.selectByValue("HR");
		
		try { Thread.sleep(2000); } catch(Exception e) { }
		//driver.findElement(By.cssSelector("button[type='submit']")).submit();
		System.out.println(driver.findElement(By.tagName("h1")).getText());
		
		try { Thread.sleep(10000); } catch(Exception e) { }
		driver.close();
	}
}
