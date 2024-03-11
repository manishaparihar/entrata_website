package test_Scenarios1;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductNevigation extends LaunchEntrataURL {

	@Test(priority = 1)
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

	@Test(priority =2)
	public void verifyLogo() {

		boolean flag =driver.findElement(By.xpath("//a[@class='main-header-logo']")).isDisplayed();
		Assert.assertTrue(flag);
		
	}


	@Test(priority = 3)
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

	


	@Test(priority=4)
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
			Thread.sleep(1000);

			// Assertion to check if the element is displayed after hover
			Assert.assertTrue(menuElement.isDisplayed(), menuValue + " menu is not displayed after hover");

		}
		//Resident element
				WebDriverWait wait = new WebDriverWait(driver, 10);	
				WebElement Resident = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='nav-group']//a[text()='ResidentPay' ]")));

				// Assertion to check if the element is clickable
				Assert.assertNotNull(Resident, "ResidentPay element is not clickable");
				Resident.click();
				Thread.sleep(2000);
				String actualTitle = driver.getTitle();

				//to print the title of page
				System.out.println("title is-----"+actualTitle);
				String expectedTitle="ResidentPay complete payment solution paying rent online with any payment method.";
				//comparing actual title and expected title
				Assert.assertEquals(actualTitle,expectedTitle, "Matched");
				
	}






}