package com.classassignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.masterpagefactory.MasterPageFactory;

public class Zoopla {
	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver", 
	"./Driver/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	
	driver.get("http://www.zoopla.co.uk");
	
	MasterPageFactory pf = PageFactory.initElements(driver,MasterPageFactory.class);
	
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	jse.executeScript("arguments[0].style.border='3px solid red'",pf.getSignin());
	pf.getSignin().click();
		
	jse.executeScript("arguments[0].style.border='3px solid red'",pf.getEmail());
	pf.getEmail().sendKeys("arif@gmail.com");
	
	jse.executeScript("arguments[0].style.border='3px solid red'",pf.getPassword());
	pf.getPassword().sendKeys("smarttech");
	
	pf.getPassword().submit();
	
	
		
	}
	
	

}
