package test_Scenarios1;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test2 extends LaunchEntrataURL {

	@Test
	public void verifyTitle()  {

		//to get the title of page
		String actualTitle = driver.getTitle();

		//to print the title of page
		System.out.println("title is-----"+actualTitle);

		//assign the value of expected title
		String expectedTitle="Property Management Software | Entrata";
		//statement to print the expected title
		System.out.println("expectedtitle...."+expectedTitle);

		//comparing actual title and expected title
		Assert.assertEquals(actualTitle, expectedTitle);


	}

	@Test
	public void verifyLogo() {

		boolean flag =driver.findElement(By.xpath("//a[@class='main-header-logo']")).isDisplayed();
		Assert.assertTrue(flag);
	}


	@Test(priority = 1)
	public void mouseHover() throws InterruptedException {

		WebElement Products= driver.findElement(By.xpath("//div[text()='Products']"));

		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(Products).perform();
		Thread.sleep(200);
		// Assertion to check if the element is displayed after hover
		Assert.assertTrue(Products.isDisplayed(), "Products menu is not displayed after hover");
	}

	@Test(priority = 2)
	public void mouseHover1() throws InterruptedException {
		WebElement PropertyManagment = driver.findElement(By.xpath("//div[@class='fat-nav-grid']//div[1]"));

		//Creating object of an Actions class
		Actions action1 = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action1.moveToElement(PropertyManagment).perform();
		Thread.sleep(500);
		// Assertion to check if the element is displayed after hover
		Assert.assertTrue(PropertyManagment.isDisplayed(), "PropertyManagment menu is not displayed after hover");

		//Resident element
		WebDriverWait wait = new WebDriverWait(driver, 10);	
		WebElement Resident = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='nav-group']//a[text()='ResidentPay' ]")));

		// Assertion to check if the element is clickable
		Assert.assertNotNull(Resident, "ResidentPay element is not clickable");
		Resident.click();
		Thread.sleep(600);    	
	}

	@Test(priority=3) 
	public void mouseHover2() throws InterruptedException {

		WebElement Products= driver.findElement(By.xpath("//div[text()='Products']"));

		//Creating object of an Actions class
		Actions action = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action.moveToElement(Products).perform();
		Thread.sleep(200);


		WebElement MarketingAndLeasing = driver.findElement(By.xpath("//div[@class='fat-nav-grid']//div[2]"));

		//Creating object of an Actions class
		Actions action2 = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action2.moveToElement(MarketingAndLeasing).perform();
		Thread.sleep(500);

		// Assertion to check if the element is displayed after hover
		Assert.assertTrue(MarketingAndLeasing.isDisplayed(), "MarketingAndLeasing menu is not displayed after hover");

	}

	@Test(priority=4)
	public void mouseHover3() throws InterruptedException {


		WebElement Accounting = driver.findElement(By.xpath("//div[@class='fat-nav-grid']//div[3]"));

		//Creating object of an Actions class
		Actions action3 = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action3.moveToElement(Accounting).perform();
		Thread.sleep(700);

		// Assertion to check if the element is displayed after hover
		Assert.assertTrue(Accounting.isDisplayed(), "Accounting menu is not displayed after hover");

	}
	@Test(priority=5)
	public void mouseHover4() throws InterruptedException {


		WebElement Utilities = driver.findElement(By.xpath("//div[@class='header-nav-item']//div[4]"));

		//Creating object of an Actions class
		Actions action4 = new Actions(driver);

		//Performing the mouse hover action on the target element.
		action4.moveToElement(Utilities).perform();
		Thread.sleep(5000);

		// Assertion to check if the element is displayed after hover
		Assert.assertTrue(Utilities.isDisplayed(), "Utilities menu is not displayed after hover");


	}

	@Test(priority=5)
	public void mouseHoverNew() throws InterruptedException
	{
		int menuCounter = 0;
		for( menuCounter = 1; menuCounter < 5; menuCounter++ ) {

			// This will find the menu element using the xpath and find its value.
			WebElement menuElement = driver.findElement(By.xpath("//div[@class='header-nav-item']//div["+menuCounter+"]"));
			String menuValue = menuElement.getText();


			//Creating object of an Actions class  
			Actions action4 = new Actions(driver);

			//Performing the mouse hover action on the target element.
			action4.moveToElement(menuElement).perform();
			Thread.sleep(200);

			// Assertion to check if the element is displayed after hover
			Assert.assertTrue(menuElement.isDisplayed(), menuValue + " menu is not displayed after hover");

		}
	}






}