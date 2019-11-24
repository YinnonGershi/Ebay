package ebay;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class SanityTest 
{

	@Test
	void _SanityTest() 
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

		// choosing the first product
		driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[2]/div[1]/div[2]/ul/li[1]/div/div[2]/a/h3")).click();  

		// stops for 4 seconds 
		try {Thread.sleep(4000);} catch (Exception e) {}
		
		// clicking on buy it now button
		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/div[3]/div[2]/form/div[2]/div[1]/div[2]/div[3]/a")).click();

		// verifying if the purchase succeeded 
		if (driver.findElement(By.xpath("//*[@id=\"test12\"]/div[2]")).isDisplayed() || 
			driver.findElement(By.xpath("//*[@id=\"test12\"]/div[2]")).isDisplayed()) 
		{
			fail("ERROR");
		}
		else
		{
			//driver.close();
		}

	}
}
