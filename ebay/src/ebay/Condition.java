package ebay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class Condition {

	@Test
	void chooseAFillterInTheCondition () 
	{
		/*
		 * in this function i will clarify if i can search for a 
		 * specific condition item ("New") through the filter condition  
		 */

		WebDriver driver = new ChromeDriver();

		// maximize the window 
		driver.manage().window().maximize();

		// opens eBay official web site 
		driver.get("https://www.ebay.com/"); 

		// finding the text box for SEARCH
		WebElement textBox = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")); 

		// typing in "iPhone 8 Plus 64GB 256GB" and pressing on ENTER
		textBox.sendKeys("iPhone 8 Plus 64GB 256GB"); 
		textBox.sendKeys(Keys.ENTER); 

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// finding condition button and clicking on "New"
		Actions action = new Actions(driver);
		WebElement condition = driver.findElement(By.xpath("//*[@id=\"w7\"]/button/div"));  
		action.moveToElement(condition).perform();
		driver.findElement(By.linkText("New")).click(); 

		// stops for 4 seconds 
		try {Thread.sleep(4000);} catch (Exception e) {}

		if (driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[2]/div[1]/div[2]/ul/div[1]/div/div/div/div/ul/li[1]/div/a/div")).isDisplayed() == false) 
		{
			fail("ERROE"); 
		}
		else
		{
			driver.close();
		}

	}

	@Test
	void addingTwoConditions ()
	{
		/*
		 * in this function i will clarify if i can search for a 
		 * specific condition item ("New") through the filter condition 
		 * and adding another condition ("Free International Shipping") 
		 */

		WebDriver driver = new ChromeDriver();

		// maximize the window 
		driver.manage().window().maximize();

		// opens eBay official web site 
		driver.get("https://www.ebay.com/"); 

		// finding the text box for SEARCH
		WebElement textBox = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")); 

		// typing in "iPhone 8 Plus 64GB 256GB" and pressing on ENTER
		textBox.sendKeys("iPhone 8 Plus 64GB 256GB"); 
		textBox.sendKeys(Keys.ENTER); 

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// finding condition button and clicking on "New"
		Actions action = new Actions(driver);
		WebElement condition = driver.findElement(By.xpath("//*[@id=\"w7\"]/button/div"));  
		action.moveToElement(condition).perform();
		driver.findElement(By.linkText("New")).click(); 

		// stops for 4 seconds 
		try {Thread.sleep(4000);} catch (Exception e) {}

		// finding delivery button and clicking on it 
		WebElement deliveryOptionButton = driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[1]/div/div[1]/div[2]/div[3]/button/div"));
		action.moveToElement(deliveryOptionButton).perform();
		driver.findElement(By.linkText("Free International Shipping")).click();

		// stops for 2 seconds 
		try {Thread.sleep(2000);} catch (Exception e) {}
		
		if (driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[2]/div[1]/div[2]/ul/div[1]/div/div/div/div/ul/li[1]/div/a/div")).isDisplayed() == true &&
			driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[2]/div[1]/div[2]/ul/div[1]/div/div/div/div/ul/li[2]/div/a/div")).isDisplayed() == true) 
		{
				driver.close();
		}
		else 
		{
			fail("ERROR");
		}


	}
}
