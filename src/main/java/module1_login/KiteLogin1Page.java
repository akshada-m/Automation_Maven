package module1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page 
{
@FindBy(xpath="//input[@id='userid']") private WebElement UN;
@FindBy(xpath="//input[@id='password']") private WebElement Pwd;
@FindBy(xpath="//button[text()='Login ']") private WebElement Loginbtn;

	public KiteLogin1Page (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void inpKiteLogin1PageUsername(String username)
	{
		UN.sendKeys(username);
	}

	public void inpKiteLogin1PagePassword(String password)
	{
		Pwd.sendKeys(password);
	}
	
	public void clickKiteLogin1PageLoginbtn() throws InterruptedException
	{
		Loginbtn.click();
		
	}
}
