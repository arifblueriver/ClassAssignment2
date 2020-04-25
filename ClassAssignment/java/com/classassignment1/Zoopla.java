package com.classassignment1;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.config.ObjectMap;
import com.masterpagefactory.MasterPageFactory;
import com.util.HighLighter;
import com.util.TakeScreenShot;

public class Zoopla {
	public static void main(String[] args) throws IOException {
		
		
	System.setProperty("webdriver.chrome.driver", 
	"./Driver/chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	
	ObjectMap obj= new ObjectMap();
	driver.get(obj.getconfig("URL"));
	
	MasterPageFactory pf = PageFactory.initElements(driver,MasterPageFactory.class);
	
	
	
	HighLighter.color(driver,pf.getSignin() );
	pf.getSignin().click();
		
	HighLighter.color(driver,pf.getEmail());
	pf.getEmail().sendKeys(obj.getconfig("Name"));
	
	HighLighter.color(driver,pf.getPassword());
	pf.getPassword().sendKeys(obj.getconfig("Password"));
	
	pf.getPassword().submit();
	
	TakeScreenShot.captureScreenShot(driver, "Zoopla login page");
	driver.quit();
	
	
	
		
	}
	
	

}

