package PagePackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHrmLoginPage2 
{
	public OrangeHrmLoginPage2(WebDriver driver)
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
	
	@FindBy(xpath ="//a[@class='orangehrm-tabs-item --active']")
	WebElement personalDetails;
	
	@FindBy(xpath = "(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[1]")
	WebElement editButton;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement  empid;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
	WebElement driverlicensenumber;
	
	@FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])[2]")
	WebElement dateOfBirth;
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
	public void personaldetails()
	{
		key.click(personalDetails);
	}
	public void editaction()
	{
		key.click(editButton);
	}
	public void editempid(String emp)
	{
		key.enterData(empid, emp);
	}
	public void editlicense(String lic)
	{
		key.enterData(driverlicensenumber, lic);
	}
	public void editdob(String dob)
	{
		key.enterData(dateOfBirth, dob);
	}
}
