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
 		Thread.sleep(500);
 		
 		//to get title
 		String actualTitle = driver.getTitle();
		//to print the title of page
		System.out.println("title is-----"+actualTitle);
		String expectedTitle="Property Management Software | Entrata";
		//comparing actual title and expected title
		Assert.assertEquals(actualTitle,expectedTitle, "Matched");
		
		
 		//to fill the form send text to first name
 		WebElement FirstName = driver.findElement(By.id("FirstName"));
 		
 		Assert.assertTrue(FirstName.isDisplayed());  
 		 FirstName.isDisplayed();
 		 FirstName.isEnabled();
 		
 		FirstName.sendKeys("manisha");
 		 
    	 WebElement LastName = driver.findElement(By.id("LastName"));
    	 LastName.isDisplayed();
    	 LastName.isEnabled();
 
    	 Assert.assertTrue(LastName.isDisplayed());  
    	 LastName.sendKeys("parihar");
    	 
    	 //to validate the wrong emailid message
    	  WebElement EmailId = driver.findElement(By.id("Email"));
          EmailId.sendKeys("manishaparihar222");
          LastName.click();
          EmailId.click();
        
          Thread.sleep(200);
          WebElement WrongEmailIdMessage = driver.findElement(By.xpath("//div[@id='ValidMsgEmail']"));
          WrongEmailIdMessage.isEnabled();
          Assert.assertTrue(WrongEmailIdMessage.isDisplayed());
          EmailId.clear();
          
        
         WebElement EmailId1 = driver.findElement(By.id("Email"));
         EmailId1.sendKeys("manishaparihar@gmai.com");
       
         
         WebElement CompanyName = driver.findElement(By.id("Company"));
         CompanyName.sendKeys("entrata");
         
         //validate wrong phone number
         WebElement PhoneNumber = driver.findElement(By.id("Phone"));
         PhoneNumber.sendKeys("xyz");
         LastName.click();
         PhoneNumber.click();
       
         Thread.sleep(200);
         WebElement WrongPhoneNumber = driver.findElement(By.xpath("//div[text()='Must be a phone number. ']"));
         WrongPhoneNumber.isEnabled();
         Assert.assertTrue(WrongPhoneNumber.isDisplayed());
         PhoneNumber.clear();
         
         WebElement PhoneNumber1 = driver.findElement(By.id("Phone"));
         PhoneNumber1.sendKeys("9875643275");
         Thread.sleep(500);
         
         Select sell=new Select(driver.findElementById("Unit_Count__c"));
         sell.selectByIndex(3);
         
         WebElement JobTitle = driver.findElement(By.id("Title"));
         JobTitle.sendKeys("Software Engineer");
         
         Select sell2=new Select(driver.findElementById("demoRequest"));
         sell2.selectByValue("a Resident");
         
         Thread.sleep(1000);
         
        
     }
   
	
}