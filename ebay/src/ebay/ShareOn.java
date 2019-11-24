package ebay;

import static org.junit.Assert.fail;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class ShareOn 
{

	/*
	 * in this class i will see if the result\price
	 * of a product can be shared on facebook\twitter\email  
	 */

	@Test
	void ShareOn_Facebooke () 
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

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// choosing the first product
		driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[2]/div[1]/div[2]/ul/li[1]/div/div[2]/a/h3")).click();  

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// finding and clicking on facebook button 
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/table/tbody/tr/td[2]/div/div[1]/div/a[2]")).click();

		// detect URL according to opened window 
		String firstWindow = driver.getWindowHandle();

		for (String secondWindow : driver.getWindowHandles())
		{
			driver.switchTo().window(secondWindow);
		}

		// confirm that a facebook window is opened
		if (driver.getCurrentUrl().contains("facebook"))
		{
			driver.close();
			driver.switchTo().window(firstWindow);
			driver.close();
		}
		else
		{
			fail("ERROR");
		}

	}

	@Test 
	void ShareOn_Twitter () 
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

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// choosing the first product
		driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[2]/div[1]/div[2]/ul/li[1]/div/div[2]/a/h3")).click();  

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// finding and clicking on twitter button 
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/table/tbody/tr/td[2]/div/div[1]/div/a[3]")).click();

		// detect URL according to opened window 
		String firstWindow = driver.getWindowHandle();

		for (String secondWindow : driver.getWindowHandles())
		{
			driver.switchTo().window(secondWindow);
		}

		// confirm that a twitter window is opened
		if (driver.getCurrentUrl().contains("twitter"))
		{
			driver.close();
			driver.switchTo().window(firstWindow);
			driver.close();
		}
		else
		{
			fail("ERROR");
		}
	}

	@Test
	void ShareOn_Email ()
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

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// choosing the first product
		driver.findElement(By.xpath("/html/body/div[4]/div[5]/div[2]/div[1]/div[2]/ul/li[1]/div/div[2]/a/h3")).click();  

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// finding and clicking on email button 
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/table/tbody/tr/td[2]/div/div[1]/div/a[1]")).click();

		// stops for 2.5 seconds 
		try {Thread.sleep(2500);} catch (Exception e) {}

		// finding and clicking on "Gmail" link button
		driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[1]/a[1]/img")).click();

		// detect URL according to opened window 
		String firstWindow = driver.getWindowHandle();

		for (String secondWindow : driver.getWindowHandles())
		{
			driver.switchTo().window(secondWindow);
		}

		// confirm that an email window is opened
		if (driver.getCurrentUrl().contains("mail") == true )
		{
			driver.close();
			driver.switchTo().window(firstWindow);
			driver.close();
		}
		else
		{
			fail("ERROR");
		}
	}
}
