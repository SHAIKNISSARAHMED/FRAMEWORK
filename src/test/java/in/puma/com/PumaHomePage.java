package in.puma.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PumaHomePage extends BasePage {


	

public PumaHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(xpath="//a[contains(@href,'https://in.puma.com/men.html')]")
WebElement men;


@FindBy(xpath="//a[contains(@href,'https://in.puma.com/men/shoes/running.html?dir=asc&order=position&in-stock=1')]")
private WebElement running;

@FindBy(xpath="html/body/div[1]/div/div/div[4]/div[2]/div[2]/div[2]/div/ul/li[2]/div/h2/a")
private WebElement secondshoe;

@FindBy(xpath="html/body/div[1]/div/div/div[4]/div/div[2]/div[2]/div[1]/form/div[3]/div[1]/span")
private WebElement cartshoe;

@FindBy(xpath="//div[contains(@class,'product-size-click-btn')]")
private WebElement size;

@FindBy(xpath="html/body/div[1]/div/div/div[4]/div/div[2]/div[2]/div[1]/form/div[3]/fieldset/dl[1]/dd[2]/div[2]/div[1]/div/div[2]/ul/li[1]/a/span[1]")
private WebElement size6;
@FindBy(xpath="html/body/div[1]/div/div/div[4]/div/div[2]/div[2]/div[1]/form/div[3]/div[6]/div[2]/div/button")
private WebElement addtocart;

@FindBy(xpath="html/body/div[1]/div/div[1]/div[4]/div/div[1]/div/form/table/tbody/tr[1]/td[2]/h2/a")
private WebElement finalshoe;


  public  void clickOnMen(){
	 men.click();
	 
  }

	
	

public void clickOnRunning(){
	running.click();
}
public void clickOnSecondShoe(){
	secondshoe.click();
}
public void selectsize(){
	size.click();
}
public void cartshoe(){
	cartshoe.click();
}


public void selectsize6(){
	size6.click();
}

public void addtocart(){
	addtocart.click();
}
public void finalshoe(){
	finalshoe.click();
}
public  void movetoElement(WebDriver driver,WebElement element){
	Actions act = new Actions(driver);
	act.moveToElement(element).perform();
	
}

}
