package in.puma.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class VerfiyCaseTest extends BaseTest {
@Test
public void testA(){
	
	Reporter.log("Verify Test Case Add  to Cart");
	PumaHomePage p = new PumaHomePage(driver);
	
	p.verifyTitle("Buy Sports T-Shirts, Tracks, Running Shoes and Accessories Online - in.puma.com");
	
	WebElement men = driver.findElement(By.xpath("//a[contains(@href,'https://in.puma.com/men.html')]"));

	
	GenericUtility gen = new GenericUtility();
	
	GenericUtility.moveToElement(driver,men);
	Reporter.log("Click on Men dropdown Passed");
	
	WebElement running = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div[4]/div[2]/div/div[2]/ul/div[1]/div/div[1]/li/a/img"));
	Reporter.log("Click on Running link Passed");
	 gen.click(running);
	
	 WebElement secondshoe = driver.findElement(By.xpath("html/body/div[1]/div/div/div[4]/div[2]/div[2]/div[2]/div/ul/li[2]/div/h2/a"));
	 Reporter.log("Click on SecondShoe link Passed");
	 gen.click(secondshoe);
	//Now get the text of the shoe and store in selectedprice variable
	 
	 String selectedprice = driver.findElement(By.xpath("//span[contains(@class,'price')]")).getText();
	 
	 
	 WebElement sizechart = driver.findElement(By.xpath("html/body/div[1]/div/div/div[4]/div/div[2]/div[2]/div[1]/form/div[3]/fieldset/dl[1]/dd[2]/div[2]/div[1]/div/div[1]/div[2]"));
	 
	 gen.actionsclass(driver, sizechart);
	 
	 Reporter.log("Sizechart dropdown clicked passed ");
	
	 WebElement size = (driver.findElement(By.id("180~71")));
	 gen.click(size);
	 
	 Reporter.log("Shoe size selected passed");
	 
	 WebElement addToCart=driver.findElement(By.xpath("//span/span[.='Add to Cart']"));
		 
	 gen.actionsclass(driver, addToCart);
	 
	 Reporter.log("Click on Add to Cart Passed");
	 
	 SoftAssert sa = new SoftAssert();
	 
	 try {
			Thread.sleep(15000);
			String finalprice = driver.findElement(By.xpath("//span[contains(@class,'price')]")).getText();
	        System.out.println(selectedprice);
	        System.out.println(finalprice);
	        sa.assertEquals(finalprice, selectedprice);
			{
				Reporter.log("Product added to cart is same as selected",true);
				Reporter.log("TestCase Passed",true);
				
				
			}
			
		}
	 catch (Exception e)
		{
			// TODO Auto-generated catch block
			Reporter.log("Product mismatch",true);
			sa.assertAll(); 
		}
//	 driver.findElement(By.id("empty_cart_button")).click();
		
		
		} 
	 

}
