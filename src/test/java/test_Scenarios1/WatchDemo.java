package test_Scenarios1;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
 
public class WatchDemo extends LaunchEntrataURL {
     
     @Test(priority = 1)
    public void validateWatchDemoButton() throws InterruptedException {
	
    	//cliking on Watchdemo button and after that it open the second page
 		WebElement WDButton =driver.findElement(By.xpath("//a[@class='button-default solid-dark-button' and text()='Watch Demo']"));
 		
 		 Assert.assertTrue(WDButton.isDisplayed());  
 		
 		WDButton.isDisplayed();
 		WDButton.isEnabled();
 		WDButton.click();
 		Thread.sleep(3000);
 		
 		WebElement FirstName = driver.findElement(By.id("FirstName"));
 		
 		Assert.assertTrue(FirstName.isDisplayed());  
 		 FirstName.isDisplayed();
 		 FirstName.isEnabled();
 		
 		FirstName.sendKeys("manisha");
 		//FirstName.clear();
 		//Assert.assertSame(WDButton, FirstName);
    	 
    	 WebElement LastName = driver.findElement(By.id("LastName"));
    	 
    	 Assert.assertTrue(LastName.isDisplayed());  
    	 LastName.sendKeys("parihar");
 	 
         WebElement EmailId = driver.findElement(By.id("Email"));
         EmailId.sendKeys("manishaparihar@gmai.com");
        // Assert.assertEquals("//div[text()='Must be valid email. ']", "Must be valid email.\r\n"
         //		+ "example@yourdomain.com");
         
         WebElement CompanyName = driver.findElement(By.id("Company"));
         CompanyName.sendKeys("entrata");
         
         WebElement PhoneNumber = driver.findElement(By.id("Phone"));
         PhoneNumber.sendKeys("9875643275");
         Thread.sleep(3000);
         
         Select sell=new Select(driver.findElementById("Unit_Count__c"));
         sell.selectByIndex(3);
         
         WebElement JobTitle = driver.findElement(By.id("Title"));
         JobTitle.sendKeys("Software Engineer");
         
         Select sell2=new Select(driver.findElementById("demoRequest"));
         sell2.selectByValue("a Resident");
         
         Thread.sleep(3000);
     

 /*     
        WebElement EmailId = driver.findElement(By.id("Email"));
         EmailId.sendKeys("manishaparihar222");
         
         LastName.click();
         EmailId.click();
         Thread.sleep(200);
         WebElement WrongEmailIdMessage = driver.findElement(By.xpath("//div[@id='ValidMsgEmail']"));
         WrongEmailIdMessage.isEnabled();
         Assert.assertTrue(WrongEmailIdMessage.isDisplayed());  
   */      
         
        /* LastName.clear();
         EmailId.clear();
         PhoneNumber.clear();
         JobTitle.clear();*/
 //        Thread.sleep(3000);
         
        
  
     }
   
    
    
 
	
}