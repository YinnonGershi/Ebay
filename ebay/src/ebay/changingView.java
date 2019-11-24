package ebay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class changingView {

	@Test
	void changingViewToGallery () 
	{
		WebDriver driver = new ChromeDriver();

		// opens eBay official web site and maximizing the window
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/"); 

		// finding the text box for SEARCH
		WebElement textBox = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")); 

		// typing in "iPhone 8 Plus 64GB 256GB" and pressing on ENTER
		textBox.sendKeys("iPhone 8 Plus 64GB 256GB"); 
		textBox.sendKeys(Keys.ENTER); 

		// stops for 4 seconds 
		try {Thread.sleep(4000);} catch (Exception e) {}

		// finding changing view button and click on it
		Actions act = new Actions(driver);
		WebElement changingViewButton = driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[1]/div/div[1]/div[3]/div[2]/div/button/div"));
		act.moveToElement(changingViewButton).perform();
		driver.findElement(By.linkText("Gallery View")).click();

		// stops for 4 seconds 
		try {Thread.sleep(4000);} catch (Exception e) {}

		if (driver.getCurrentUrl().equals("https://www.ebay.com/sch/i.html?_from=R40&_nkw=iPhone+8+Plus+64GB+256GB&_sacat=0&_dmd=2&rt=nc") == true)
		{
			driver.close();
		}
		else
		{
			fail("ERROR");
		}
	}

	@Test
	void changingViewBackToList ()
	{
		WebDriver driver = new ChromeDriver();

		// opens eBay official web site and maximizing the window
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/"); 

		// finding the text box for SEARCH
		WebElement textBox = driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")); 

		// typing in "iPhone 8 Plus 64GB 256GB" and pressing on ENTER
		textBox.sendKeys("iPhone 8 Plus 64GB 256GB"); 
		textBox.sendKeys(Keys.ENTER); 

		// stops for 4 seconds 
		try {Thread.sleep(4000);} catch (Exception e) {}

		// finding changing view button and click on it to gallery view
		Actions act = new Actions(driver);
		WebElement changingViewButton = driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[1]/div/div[1]/div[3]/div[2]/div/button/div"));
		act.moveToElement(changingViewButton).perform();
		driver.findElement(By.linkText("Gallery View")).click();

		// stops for 4 seconds 
		try {Thread.sleep(4000);} catch (Exception e) {}

		// confirming that it changed to gallery view
		if (driver.getCurrentUrl().equals("https://www.ebay.com/sch/i.html?_from=R40&_nkw=iPhone+8+Plus+64GB+256GB&_sacat=0&_dmd=2&rt=nc") == false)
		{
			fail("ERROR");
		}

		// finding changing view button and click on it
		WebElement changingViewButton2 = driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[1]/div/div[1]/div[3]/div[2]/div/button/div"));
		act.moveToElement(changingViewButton2).perform();
		driver.findElement(By.linkText("List View")).click();

		if (driver.getCurrentUrl().equals("https://www.ebay.com/sch/i.html?_from=R40&_nkw=iPhone+8+Plus+64GB+256GB&_sacat=0&_dmd=1&rt=nc") == false)
		{
			fail("ERROR");
		}
		else 
		{
			driver.close();
		}
	}

}
