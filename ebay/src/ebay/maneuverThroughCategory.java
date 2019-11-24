package ebay;

import static org.junit.Assert.fail;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class maneuverThroughCategory 
{

	@Test
	void maneuverThroughCategory1 () 
	{
		/*
		 * in this function i will see if i can get result 
		 * without typing in the search text box 
		 */

		WebDriver driver = new ChromeDriver();

		// maximizing the window and opens eBay official web site 
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/"); 

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// finding and clicking on "Home&garden" button
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li[9]/a")).click(); 

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// confirming that driver is at "Home&garden" category 
		if (driver.findElement(By.xpath("/html/body/div[3]/div[2]/nav/ol/li[2]/span")).isDisplayed() == false)
		{
			fail("ERROR");
		}

		// clicking on "Yard, Garden & Outdoor Living" link button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/section[1]/div[2]/div/div/ul/li[1]/a/p")).click();

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// confirming that driver is at "Yard, Garden & Outdoor Living" category 
		if (driver.findElement(By.xpath("/html/body/div[3]/div[2]/nav/ol/li[3]/span")).isDisplayed() == false)
		{
			fail("ERROR");
		}

		// finding and clicking on "Lawn Mowers" button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/section[1]/div[2]/div/div/ul/li[1]/a/p")).click();

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// confirming that driver is at "Lawn Mowers" category 
		if (driver.findElement(By.xpath("/html/body/div[3]/div[2]/nav/ol/li[4]/span")).isDisplayed() == false)
		{
			fail("ERROR");
		}

		// finding and clicking on "Lawn Mower Parts & Accessories" button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/section[1]/div[2]/div/div/ul/li[1]/a/p")).click();

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// confirming that driver is at "Lawn Mowers" category 
		if (driver.findElement(By.xpath("/html/body/div[3]/div[2]/nav/ol/li[5]/span")).isDisplayed() == false)
		{
			fail("ERROR");
		}

		// finding and clicking on "John Deere" button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/section[1]/div[2]/div/div/ul/li[1]/a/p")).click();

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// confirming that driver is at "John Deere" category 
		if (driver.findElement(By.xpath("/html/body/div[3]/div[2]/nav/ol/li[6]/span")).isDisplayed() == false)
		{
			fail("ERROR");
		}

		// finding and clicking on "Deck" button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/div[1]/section[1]/div[2]/div/div/ul/li[1]/a/p")).click();

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// confirming that driver is at "Deck" category 
		if (driver.findElement(By.xpath("/html/body/div[3]/div[2]/nav/ol/li[6]/span")).isDisplayed() == false)
		{
			fail("ERROR");
		}

		// finding and clicking on "18hp" button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[4]/section[1]/div[2]/div/div/ul/li[2]/a/p")).click();

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// confirming that driver is at "18hp" category 
		if (driver.findElement(By.xpath("/html/body/div[3]/div[2]/nav/ol/li[6]/span")).isDisplayed() == false)
		{
			fail("ERROR");
		}
		else 
		{
			driver.close();
		}

	}

	@Test
	void maneuverThroughCategory2 ()
	{

		/*
		 * in this function i will see if i can get result 
		 * without typing in the search text box 
		 */

		WebDriver driver = new ChromeDriver();

		// maximizing the window and opens eBay official web site 
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/"); 

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// finding and clicking on "Under $10" button
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/ul/li[11]/a")).click(); 

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// confirming that driver is at "Under $10" category 
		if (driver.findElement(By.xpath("/html/body/div[3]/div[2]/nav/ol/li[2]/span")).isDisplayed() == false)
		{
			fail("ERROR");
		}

		// finding and clicking on down button
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[1]/div/div/div/section[1]/ul/li[1]/button/span")).click(); 

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// confirming that driver enabled down button
		if (driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[1]/div/div/div/section[1]/ul/li[1]/button/span")).isEnabled() == false)
		{
			fail("ERROR");
		}

		// finding and clicking on "Dresses" button
		driver.findElement(By.xpath("/html/body/div[3]/div[4]/div[1]/div/div/div/section[1]/ul/li[1]/ul/li[2]/a")).click(); 

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// confirming that driver is at "Dresses" category 
		if (driver.findElement(By.xpath("/html/body/div[3]/div/nav/ul/li[5]/a")).isDisplayed() == false)
		{
			fail("ERROR");
		}
		else
		{
			driver.close();
		}

	}
}
