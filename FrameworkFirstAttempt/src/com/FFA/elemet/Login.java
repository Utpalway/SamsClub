package com.FFA.elemet;


import org.openqa.selenium.WebDriver;

import com.FFA.POM.LoginPOM;

public class Login {

	LoginPOM objlg = new LoginPOM();
	
	WebDriver driver;
	public Login(WebDriver driver1) {
		this.driver=driver1;	
		}

	public void PerformLogin()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/"); 
		driver.findElement(objlg.Username()).sendKeys("Admin");
		driver.findElement(objlg.Password()).sendKeys("admin123");
		driver.findElement(objlg.Signin()).click();
	}
}
