package org.online;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import graphql.ThreadSafe;

public class Online {
public static void main(String[] args) throws InterruptedException  {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\eclipse\\selenium\\SeleniumProject\\driver\\chromedriver.exe");

WebDriver driver = new ChromeDriver();
driver.get("http://www.amazon.in");
driver.manage().window().maximize();
Thread.sleep(2000);
WebElement txtPrime = driver.findElement(By.className("nav-a  "));

Actions acc = new Actions(driver);
acc.moveToElement(txtPrime).perform();





	
}





{
	
}

}

