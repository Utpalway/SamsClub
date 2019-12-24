package com.FFA.POM;

import org.openqa.selenium.By;

public class AsginLeavePOM {

	public By Assign(){
		return By.xpath("//img[contains(@src,'ApplyLeave')]");
	}
	
	public By SelectLeave(){
		return By.xpath("//select[@id='assignleave_txtLeaveType']");
	}
	
}
