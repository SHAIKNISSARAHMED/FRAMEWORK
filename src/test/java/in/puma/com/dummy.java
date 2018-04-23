package in.puma.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class dummy {
static{
	System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
}
	public static void main(String[] args) {
		
	WebDriver driver = new FirefoxDriver();
	driver.get("https://in.puma.com/");
	String atitle = driver.getTitle();
	System.out.println(atitle);
	String etitle = "Buy Sports T-Shirts, Tracks, Running Shoes and Accessories Online - in.puma.com";
	if(etitle.equals(atitle)){
		System.out.println("Title is  matching");
	}
	else {
		System.out.println("Title is Not matching");
	}
	GenericUtility gen = new GenericUtility();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement men = driver.findElement(By.xpath("//a[contains(@href,'https://in.puma.com/men.html')]"));
	
	
	GenericUtility.moveToElement(driver, men);
	try {
		Thread.sleep(10000);
		WebElement running = driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div/div[2]/div[4]/div[2]/div/div[2]/ul/div[1]/div/div[1]/li/a/img"));
		
		 gen.click(running);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	WebElement secondshoe = driver.findElement(By.xpath("html/body/div[1]/div/div/div[4]/div[2]/div[2]/div[2]/div/ul/li[2]/div/h2/a"));
	gen.click(secondshoe);

//	WebElement cartshoe =driver.findElement(By.xpath("html/body/div[1]/div/div/div[4]/div/div[2]/div[2]/div[1]/form/div[3]/div[1]/span"));
//	gen.moveToElement(driver, cartshoe);
	 String selectedprice = driver.findElement(By.xpath("//span[contains(@class,'price')]")).getText();
	Actions act = new Actions(driver);
	
	act.moveToElement(driver.findElement(By.xpath("html/body/div[1]/div/div/div[4]/div/div[2]/div[2]/div[1]/form/div[3]/fieldset/dl[1]/dd[2]/div[2]/div[1]/div/div[1]/div[2]"))).click().perform();

		try {
		Thread.sleep(2000);
		WebElement size = (driver.findElement(By.id("180~71")));
		size.click();;
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
//	
//	
		act.moveToElement(driver.findElement(By.xpath("//span/span[.='Add to Cart']"))).click().perform();
//	gen.click(driver.findElement(By.xpath("//span/span[.='Add to Cart']")));
	

	try {
		Thread.sleep(15000);
		String finalprice = driver.findElement(By.xpath("//span[contains(@class,'price')]")).getText();
        System.out.println(selectedprice);
        System.out.println(finalprice);
		if(finalprice.equals(selectedprice)){
		System.out.println("Product added to cart is same as selected before");
	
	}
	else {
		System.out.println("Product mismatch");
	}
	driver.findElement(By.id("empty_cart_button")).click();
	driver.close();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	

		
		
		
//	}
	}
}
