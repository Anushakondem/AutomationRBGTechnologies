package PagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHrmloginPage 
{
	public OrangeHrmloginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement Username;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement Login;
	
	@FindBy(xpath = "//span[text()='My Info']")
	WebElement myInfo;
	
	@FindBy(xpath = "//a[@class='orangehrm-tabs-item --active']")
	WebElement personalDetails;
	
	
	@FindBy(xpath = "//input[@name = 'firstName']" )
	
	WebElement firstname;
	
	@FindBy(xpath = "//input[@name='middleName']")
	WebElement middlename;
	
	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lastname;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement empId;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	WebElement OtherId;

	
	GenericKeywordsWithPage keys = new GenericKeywordsWithPage("OrangeHrmloginPage");
	public void orusername(String enteruserId)
	{
		keys.enterData(Username, enteruserId);
	}
	public void orpassword(String enterPassword)
	{
		keys.enterData(Password, enterPassword);
	}
	public void loginbutton()
	{
		keys.click(Login);
		
	}
	public void myinfo()
	{
		keys.click(myInfo);
	}
    public void personaldetails()
    {
    	keys.click(personalDetails);
    	
    }
    public void fristname(String frist) throws Throwable
    {
//    	keys.clearEnter(firstname, frist);
    	
//    	this.firstname.click();
    	
//    boolean d=	firstname.isDisplayed();
//    System.out.println("Actual is dispaling  "+d);
//    
//    boolean d2=	firstname.isEnabled();
//    System.out.println("Actual is Enabled  "+d2);
//    
//    	keys.jsClick(firstname);
    	Thread.sleep(5000);
        
    	keys.enterData(firstname, frist);
//    	this.firstname.clear();
    	
    	Thread.sleep(5000);
//    	keys.enterData(firstname, frist);
    }
    public void middlename(String middle)
    {
    	keys.enterData(middlename, middle);
    }
   
	public void lastname(String last) 
	{
		keys.enterData(lastname, last);
		
	}
	
	public void empid(String emp) 
	{
		keys.enterData(empId, emp);
		
	}
	public void otherId(String other)
	{
		keys.enterData(OtherId, other);
	}
}
    	
    


