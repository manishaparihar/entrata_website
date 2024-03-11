package test_Scenarios1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LaunchEntrataURL {
	
	 public static ChromeDriver driver;
	  
	@BeforeClass
    public void testSetUp()  {
     
        WebDriverManager.chromedriver().setup();
       
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
         driver = new ChromeDriver(options);
        
 
        driver.manage().window().maximize();
        driver.get("https://www.entrata.com//");
       
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //to decline cookies
       WebElement e= driver.findElementById("rcc-decline-button");
       e.click();
       
    }
	
	
	@AfterClass
    public void tearDown() {
    	//quite browser
            driver.quit();
    }
    

	
	
}

		
		
		
		 
		
	
  

	


    


