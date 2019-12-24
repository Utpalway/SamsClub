package com.FFA.elemet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import com.FFA.POM.AsginLeavePOM;

public class AssginLeave {
	WebDriver driver;

	AsginLeavePOM objal = new AsginLeavePOM();
	
	public AssginLeave(WebDriver driver1) {
		this.driver=driver1;
	}

	public void performassign() throws InterruptedException{
	
		Thread.sleep(5000);
		driver.findElement(objal.Assign()).click();
		Thread.sleep(5000);
		WebElement element = driver.findElement(objal.SelectLeave());
		Select obyselect = new Select(element);
		obyselect.selectByIndex(2);
	}
}
