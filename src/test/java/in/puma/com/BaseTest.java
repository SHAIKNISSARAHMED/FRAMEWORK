package in.puma.com;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

public  abstract class BaseTest implements AutoConstant {
public static WebDriver driver;
@BeforeMethod
public void preCondition()
{
	Reporter.log("Launching Browser");
	System.setProperty(gecko_Key, gecko_value);
    driver = new FirefoxDriver();
    
    driver.get("https://in.puma.com/");
    Reporter.log("Puma WebSite Opended Successfully");
    
}
@AfterMethod
public void postCondition(){
	driver.close();
	Reporter.log("Browser Closed");
}

}
