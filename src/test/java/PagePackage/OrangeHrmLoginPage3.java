package PagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

	//@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	//WebElement street1;
	
	@FindBy(xpath ="//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	WebElement country;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement savedbutton;


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
	public void orstreet(String colony) throws Throwable

	{
		WebElement street1 =key.driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		street1.click();
		Actions act=new Actions(key.driver);
		act.doubleClick(street1).perform();
		Thread.sleep(4000);
		key.enterData(street1, colony);
	}
	public void orstreet2(String colony2) throws Throwable
	{
		WebElement street2 = key.driver.findElement(By.xpath("(//label[text()='Street 2']//following::input)[1]"));
		street2.click();
		Actions act = new Actions(key.driver);
		act.doubleClick(street2).perform();
		Thread.sleep(4000);
		key.enterData(street2, colony2);


	}
	public void orcity(String city) throws Throwable 
	{
		WebElement cities= key.driver.findElement(By.xpath("(//label[text()='City']//following::input)[1]"));
		cities.click();
		Actions act = new Actions(key.driver);
		act.doubleClick(cities).perform();
		Thread.sleep(4000);
		key.enterData(cities, city);
	}
	public void orstatepro(String state) throws Throwable
	{
		WebElement states= key.driver.findElement(By.xpath("(//label[text()='State/Province']//following::input)[1]"));
		states.click();
		Actions act = new Actions(key.driver);
		act.doubleClick(states).perform();
		key.enterData(states, state);

	}
	public void orzippostal(String zip) throws Throwable
	{
		WebElement postalzip= key.driver.findElement(By.xpath("(//label[text()='Zip/Postal Code']//following::input)[1]"));
		postalzip.click();
		Actions act = new Actions(key.driver);
		act.doubleClick(postalzip).perform();
		Thread.sleep(4000);
		key.enterData(postalzip, zip);
	}
	public void orcountry(String county) throws Throwable
	{
		country.click();
		WebElement countries = key.driver.findElement(By.xpath("//span[text()='"+county+"']"));
		countries.click();
		Thread.sleep(4000);
		
	}
	public void ormobile(String phonenum) throws Throwable
	{
		WebElement mobilenumber= key.driver.findElement(By.xpath("(//label[text()='Mobile']//following::input)[1]"));
		mobilenumber.click();
		Actions act = new Actions(key.driver);
		act.doubleClick(mobilenumber).perform();
		Thread.sleep(4000);
		key.enterData(mobilenumber, phonenum);
	
	}
	public void orworknum(String work) throws Throwable
	{
		WebElement workphonenum = key.driver.findElement(By.xpath("(//label[text()='Work']//following::input)[1]"));
		workphonenum.click();
		Actions act = new Actions(key.driver);
		act.doubleClick(workphonenum).perform();
		Thread.sleep(4000);
		key.enterData(workphonenum, work);
	
	}
	public void orworkemail(String email) throws Throwable
	{
		WebElement emailaddress = key.driver.findElement(By.xpath("(//label[text()='Work Email']//following::input)[1]"));
		emailaddress.click();
		Actions act = new Actions(key.driver);
		//act.doubleClick(emailaddress).perform();
		//Thread.sleep(3000);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();

		//emailaddress.click();
		Thread.sleep(3000);
		key.enterData(emailaddress, email);
	
	}
	public void orotheremail(String email)
	{
		WebElement otheremailadress = key.driver.findElement(By.xpath("(//label[text()='Other Email']//following::input)[1]"));
		otheremailadress.click();
		Actions act = new Actions(key.driver);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		key.enterData(otheremailadress, email);
	}
	public void contactdetailssave()
	{
		savedbutton.click();
	}
	
}



