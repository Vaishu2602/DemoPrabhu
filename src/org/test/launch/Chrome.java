package org.test.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\Desktop\\eclipse\\TestLaunch\\driver\\chromedriver.exe");	

		WebDriver d = new ChromeDriver();

		d.get("https://en-gb.facebook.com/");
		
		String title = d.getTitle();
		System.out.println(title);
		
		String currentUrl = d.getCurrentUrl();
		System.out.println(currentUrl);
		
		d.manage().window().maximize();
		
		WebElement findElement = d.findElement(By.id("email"));
		findElement.sendKeys("karthi.krishna.04@gmail.com");
		
		WebElement findElement2 = d.findElement(By.id("pass"));
		findElement2.sendKeys("9003530588.a");
		
		WebElement findElement3 = d.findElement(By.name("login"));
		findElement3.click();
		System.out.println();
	}
}
