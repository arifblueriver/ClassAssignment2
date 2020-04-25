package com.masterpagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MasterPageFactory {
	
	@FindBy(xpath ="//*[contains(@class,'button button--tertiary-dark account-link__text')]")
	private WebElement Signin;
	
	@FindBy(xpath ="//*[contains(@id,'signin_email')]")
	private WebElement Email;
	
	@FindBy(xpath ="//*[contains(@id,'signin_password')]")
	private WebElement Password;

	public WebElement getSignin() {
		return Signin;
	}

	public void setSignin(WebElement signin) {
		Signin = signin;
	}

	public WebElement getEmail() {
		return Email;
	}

	public void setEmail(WebElement email) {
		Email = email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public void setPassword(WebElement password) {
		Password = password;
	}
	
	
	
	

}
