package ebay;

import static org.junit.Assert.fail;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class clickingOnAnAdd 
{

	@Test
	void clickingOnAnAdd_ReadyToShopWhatIsHot() 
	{
		/*
		 * in this function i will see if i can get result 
		 * if i'm clicking on an add "Ready to Shop What’s Hot?"
		 */

		WebDriver driver = new ChromeDriver();

		// maximizing the window and opens eBay official web site 
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/"); 

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// finding and clicking on "Ready to Shop What’s Hot?" add
		driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/div/div[2]/a/div[2]")).click();

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		if (driver.findElement(By.xpath("/html/body/div[3]/div[1]/nav/ol/li[2]/span")).isDisplayed() == false)
		{
			fail("ERROR");
		}
		else 
		{
			driver.close();
		}

	}

	@Test
	void clickingOnAnAdd_RandomAdd ()
	{
		/*
		 * in this function i will see if i can get  
		 * result if i'm clicking on an random add 
		 */

		WebDriver driver = new ChromeDriver();

		// maximizing the window and opens eBay official web site 
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/"); 

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// finding and clicking on an add
		driver.findElement(By.xpath("//*[@id=\"rtm_list1\"]/div/div/div/ul/li[1]/div/a/div/div")).click();

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		if (driver.getCurrentUrl().equals("https://www.ebay.com/") == false)
		{
			driver.close();
		}
		else
		{
			fail("ERROR");
		}

	}

}
