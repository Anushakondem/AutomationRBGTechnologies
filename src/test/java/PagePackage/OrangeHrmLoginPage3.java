package PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHrmLoginPage3 
{
public OrangeHrmLoginPage3(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath = "//input[@name='username']")
WebElement userName;

@FindBy(xpath = "//input[@name='password']")
WebElement passWord;

@FindBy(xpath = "//button[@type='submit']")
WebElement login;

@FindBy(xpath = "(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]")
WebElement myInfo;

@FindBy(xpath = "(//a[@class='orangehrm-tabs-item'])[1]")
WebElement contactDetails;


GenericKeywordsWithPage key = new GenericKeywordsWithPage("OrangeHrmLoginPage2");

public void orusername(String enteruserId) 
{
	key.enterData(userName, enteruserId);
	
}

public void orpassword(String enterpassword) 
{
	key.enterData(passWord, enterpassword);
	
}

public void loginbutton() 
{
	key.click(login);
	
}
public void myinfo()

{
	key.click(myInfo);
}
public void orcontactdetails()

{
	key.click(contactDetails);
}

}


