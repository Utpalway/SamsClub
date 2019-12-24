package com.FFA.elemet;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.FFA.POM.LoggofPOM;

public class Loggoff {
	WebDriver driver;
	WebDriverWait wait ;
	LoggofPOM objlo = new LoggofPOM();
	
	
	public Loggoff(WebDriver driver1) {
		this.driver=driver1;
	}
public void performlog() throws InterruptedException{
	Thread.sleep(5000);
	driver.findElement(objlo.Welcome()).click();
	Thread.sleep(5000);
	driver.findElement(objlo.Loggoff()).click();
}
	
}
