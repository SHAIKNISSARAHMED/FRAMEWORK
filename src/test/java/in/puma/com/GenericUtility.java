package in.puma.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericUtility {
	
public static void selectByIndex(WebElement element, int index){
	Select sel = new Select(element);
	sel.selectByIndex(index);
}
public static void selectByvalue(WebElement element,String value){
	Select sel = new Select(element);
	sel.selectByValue(value);
}
public static void selectByVisisbleText(WebElement element, String text){
	Select sel = new Select(element);
	sel.selectByVisibleText(text);
}

public static void moveToElement(WebDriver driver,WebElement elementToNavigate){
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//	Actions act = new Actions(driver);
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", elementToNavigate); 
//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToNavigate);
    
	
	
}
public static void actionsclass(WebDriver driver,WebElement sizechart){
	Actions act = new Actions(driver);
	
	act.moveToElement(sizechart).click().perform();
}
public static void click(WebElement element){
	element.click();
}
}
