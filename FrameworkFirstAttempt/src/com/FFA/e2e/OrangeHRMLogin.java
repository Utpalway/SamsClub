package com.FFA.e2e;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.FFA.elemet.AssginLeave;
import com.FFA.elemet.Loggoff;
import com.FFA.elemet.Login;

public class OrangeHRMLogin {
	WebDriver driver = new FirefoxDriver(); ;
	 
	//Log - in
	@Test(priority=1)
	public void perfmlg(){
		Login objlg = new Login(driver);
		objlg.PerformLogin();
	}
	
	//Assign Leave
	@Test(priority=2)
	public void perfrmal() throws InterruptedException{
	AssginLeave objal = new AssginLeave(driver);
	objal.performassign();
	}
	
	
	//Log-off
	@Test(priority=3)
	public void perfrlo() throws InterruptedException{
	Loggoff objlf = new Loggoff(driver);
	objlf.performlog();
	}
}
