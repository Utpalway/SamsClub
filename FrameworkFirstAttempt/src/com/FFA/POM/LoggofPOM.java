package com.FFA.POM;

import org.openqa.selenium.By;

public class LoggofPOM {
	
	public By Welcome(){
		return By.xpath("//a[@id='welcome']");
	}
	
	public By Loggoff(){
		return By.xpath("//a[contains(text(),'Logout')]");
	}
}
