package in.puma.com;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class BasePage {
	public WebDriver driver;
	public BasePage(WebDriver driver){
		this.driver=driver;
	}

	//To verify the title
	public void verifyTitle(String expectedTitle){
		Reporter.log("Verify The Title of the webPage");
		SoftAssert sa = new SoftAssert();
		try {
			Thread.sleep(2000);
			String actualTitle = driver.getTitle();
			
			sa.assertEquals(actualTitle, expectedTitle);
//			Assert.assertEquals(actualTitle,expectedTitle);
			{
			Reporter.log("Title is matching " +actualTitle,true);
			}
			}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			Reporter.log("Title is not matching",true);
			sa.assertAll(); 
		}
	
		
		
		                                      }
	
		
	

                     }
