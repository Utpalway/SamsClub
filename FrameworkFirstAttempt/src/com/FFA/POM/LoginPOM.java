package com.FFA.POM;

import org.openqa.selenium.By;

public class LoginPOM {

	public By Username(){
		return By.xpath("//input[@id='txtUsername']");
	}
	public By Password(){
		return By.xpath(" //input[@id='txtPassword']");
	}
	public By Signin(){
		return By.xpath(" //input[@id='btnLogin']");
	}
	
}
