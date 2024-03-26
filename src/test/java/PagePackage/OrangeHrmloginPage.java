package PagePackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	
	@FindBy(xpath = "(//label[text()='License Expiry Date']//following::i)[1]")
	WebElement licexpirydate;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon'])[2]")
	WebElement year;
	
	@FindBy(xpath ="(//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon'])[1]")
	WebElement month;
	

    @FindBy(xpath = "(//div[@class='oxd-select-text--after'])[1]")
	WebElement nationaLitySelect;

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
	public void enterfristname(String first1) throws Throwable
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
		

		//keys.enterData(firstName, frist);
		//    	this.firstname.clear();

		//Thread.sleep(5000);
		//    	keys.enterData(firstname, frist);
		
		WebElement firstName=keys.driver.findElement(By.xpath("//input[@name='firstName']"));
		firstName.click();
		Actions act=new Actions(keys.driver);
		act.doubleClick(firstName).perform();
		Thread.sleep(4000);
		keys.enterData(firstName, first1);
	}
	public void entermiddlename(String middle) throws Throwable
	{
		WebElement middleName = keys.driver.findElement(By.xpath("//input[@name='middleName']"));
		middleName.click();
		Actions act = new Actions(keys.driver);
		act.doubleClick(middleName).perform();
		Thread.sleep(5000);
		keys.enterData(middleName, middle);
	}
	public void enterlastname(String last) throws Throwable
	{
		WebElement lastName = keys.driver.findElement(By.xpath("//input[@name='lastName']"));
		lastName.click();
		Actions act = new Actions(keys.driver);
		act.doubleClick(lastName).perform();
		Thread.sleep(5000);
		keys.enterData(lastName, last);
		
	}
	
	public void calender1(String years,String months,String date) throws Throwable
	{
		keys.click(licexpirydate);
		keys.click(year);
		Thread.sleep(4000);
		WebElement year1 =keys.driver.findElement(By.xpath("//li[text()='"+years+"']"));
		year1.click();
		Thread.sleep(5000);
		month.click();
		WebElement month1 = keys.driver.findElement(By.xpath("//li[text()='"+months+"']"));
		month1.click();
		Thread.sleep(6000);
		WebElement dated = keys.driver.findElement(By.xpath("//div[text()='"+date+"']"));
		dated.click();
		Thread.sleep(4000);
		
	}
	public void selectNationality(String nationality) throws InterruptedException 
	{
		keys.click(nationaLitySelect);
		Thread.sleep(5000);
		WebElement nationaLitySelected = keys.driver.findElement(By.xpath("//span[text()='"+nationality+"']"));
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
	
	
	public void submitbutton()
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