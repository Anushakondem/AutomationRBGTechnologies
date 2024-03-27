package PagePackage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHrmLoginPage4 
{
	public OrangeHrmLoginPage4(WebDriver driver)
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

	
	@FindBy(xpath = "(//a[@class='orangehrm-tabs-item'])[2]")
	
	WebElement Emergencycontacts;

	@FindBy(xpath = "(//button[@type='button'])[3]")
	WebElement addbutton;
	
	@FindBy(xpath = "(//label[text()='Name']//following::input)[1]")
	WebElement personname;
	
	@FindBy(xpath = "(//label[text()='Name']//following::input)[2]")
	WebElement Relationship;
	
	@FindBy(xpath = "(//label[text()='Home Telephone']//following::input)[1]")
	WebElement HomeTelephone;
	
	@FindBy(xpath = "(//label[text()='Mobile']//following::input)[1]")
	WebElement mobilenumber;
	
	@FindBy(xpath = "(//label[text()='Work Telephone']//following::input)[1]")
	WebElement worknum;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement saveebutton;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
	WebElement deletebutton;


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
	public void oremergencydetails()

	{
		key.click(Emergencycontacts);
	}
	public void oraddbutton()
	{
		key.click(addbutton);
		
	}
	public void emergencycontactname(String contactperson) throws Throwable
	{
		
		personname.click();
	 key.enterData(personname, contactperson);
	
	}
	
	public void enterrelation(String relation)
	{
		Relationship.click();
		key.enterData(Relationship, relation);
	}
	public void enterhomeno(String number)
	{
		HomeTelephone.click();
		key.enterData(HomeTelephone, number);
	}
	
	public void enterphoneno(String phone)
	{
		mobilenumber.click();
		key.enterData(mobilenumber, phone);
	}
	public void workmobileno(String mobile)
	{
		worknum.click();
		key.enterData(worknum, mobile);
	}
	public void emerengycontactsaved()
	{
		saveebutton.click();
	}
	public void deleted()
	{
		deletebutton.click();
	}
	
}



