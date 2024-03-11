package test_Scenarios1;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class SignInTest extends LaunchEntrataURL {

	@Test(priority=1)
	public void testValidSignIn() throws InterruptedException {

		//cliking on signin button and after that it open the signin page
		WebElement SignInButton =driver.findElement(By.xpath("//a[@class='button-default outline-dark-button']"));
		SignInButton.isDisplayed();
		SignInButton.isEnabled();
		SignInButton.click();
		Thread.sleep(1000);
		
		String actualTitle = driver.getTitle();
		//to print the title of page
		System.out.println("title is-----"+actualTitle);
		String expectedTitle="Entrata Sign In";
		//comparing actual title and expected title
		Assert.assertEquals(actualTitle,expectedTitle, "Matched");
	}

	
	@Test(priority=2)
	public void testResidentLogin() throws InterruptedException {

		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		WebElement Resident = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Resident Login']")));

		Resident.click();
		Thread.sleep(1000);
		
		//to get title of page
		String actualTitle = driver.getTitle();
		
		//to print the title of page
		System.out.println("title is-----"+actualTitle);
		
		String expectedTitle="Welcome to the Resident Portal App";
		//comparing actual title and expected title
		Assert.assertEquals(actualTitle,expectedTitle, "Matched");
		
	}
	
	@Test(priority=3)
	public void testViewApp() throws InterruptedException {  	
		WebElement ViewApp =driver.findElement(By.xpath("//div[text()='View the App']"));
		ViewApp.isDisplayed();
		ViewApp.isEnabled();
		ViewApp.click();
		Thread.sleep(1000);
		
		
	}
	@Test(priority=4)
	public void viewAppPage() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Video =driver.findElement(By.xpath("//a[text()='How-to Videos']"));
		Video.isDisplayed();
		Video.isEnabled();
		Video.click();
		Thread.sleep(1000);	
		//vertical scroll 
		js.executeScript("window.scrollBy(0,500)");
		
       //to open appFeatures 
		WebElement AppFeatures =driver.findElement(By.xpath("//div[@class='landing-nav app-content']//a[text()='App Features']"));
		AppFeatures.isDisplayed();
		AppFeatures.isEnabled();
		AppFeatures.click();
		Thread.sleep(500);
		
		//click on menu bar
		WebElement Menu =driver.findElement(By.xpath("//div[@class='nav-burger']"));
		Menu.isDisplayed();
		Menu.isEnabled();
		Menu.click();
		Thread.sleep(1000);
		WebElement close =driver.findElement(By.xpath("//div[@class='nav-burger']"));
		close.click();
		Thread.sleep(600);
	}
	

}
