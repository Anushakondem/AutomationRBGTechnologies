package PagePackage;

import java.io.IOException;

import org.openqa.selenium.By;
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

	WebElement firstName;

	@FindBy(xpath = "//input[@name='middleName']")
	WebElement middleName;

	@FindBy(xpath = "//input[@name='lastName']")
	WebElement lastName;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	WebElement empId;

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[4]")
	WebElement driverLicense;

	@FindBy(xpath = "(//input[@placeholder='yyyy-dd-mm'])[1]")
	WebElement licenseExpiryDate;

	@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[1]")
	WebElement nationaLitySelect;

	@FindBy(xpath = "//span[text()='Indian']")
	WebElement nationaLitySelected;


	@FindBy(xpath = "(//div[@class = 'oxd-select-text--after'])[2]" )
	WebElement martialStatusSelect;

	@FindBy(xpath = "(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[2]")
	WebElement genderSelected;
	
	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement savebutton;
	
	@FindBy(xpath = "//div[@class='orangehrm-edit-employee-image']")
	WebElement image;
	
	@FindBy(xpath ="//i[@class='oxd-icon bi-plus']")
	WebElement profilepicture;



	//@FindBy(xpath = "//div[@class='oxd-select-text-input'])[1]")
	//WebElement nationaLity;


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
	public void enterfristname(String frist) throws Throwable
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

		keys.enterData(firstName, frist);
		//    	this.firstname.clear();

		Thread.sleep(5000);
		//    	keys.enterData(firstname, frist);
	}
	public void entermiddlename(String middle)
	{
		keys.enterData(middleName, middle);
	}

	public void enterlastname(String last) 
	{
		keys.enterData(lastName, last);

	}

	public void enterempid(String emp) 
	{
		keys.enterData(empId, emp);

	}

	public void enterdriverLicensenum(String license)
	{
		keys.enterData(driverLicense, license);
	}
	public void enterlicenseExpiry(String licexpirydate)
	{
		keys.enterData(licenseExpiryDate, licexpirydate);
	}
	public void selectNationality(String nationality) throws InterruptedException 
	{
		keys.click(nationaLitySelect);
		Thread.sleep(5000);
		keys.click(nationaLitySelected);

	}
	public void martialstatusselect(String martial) throws InterruptedException
	{
		keys.click(martialStatusSelect);
		Thread.sleep(4000);
		WebElement martialStatusSelected = keys.driver.findElement(By.xpath("//span[text()='"+martial+"']"));
		martialStatusSelected.click();

	}
	public void genderselection(String gender)
	{
		keys.click(genderSelected);
	}

	public void submitbutton(String save)
	{
		keys.click(savebutton);
	}
	public void clickimage()
	{
		keys.click(image);
	}
	public void profilepictureupload() throws IOException, InterruptedException
	{
		keys.click(profilepicture);
		Thread.sleep(5000);
		Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\AUTOIT\\FileUpload.exe");
	}
	
	
}






