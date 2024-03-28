
package PagePackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class OrangeHrmLoginPage5
{
	public OrangeHrmLoginPage5(WebDriver driver)
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

	@FindBy(xpath = "(//a[@class='orangehrm-tabs-item'])[3]")
	WebElement dependents;

	@FindBy(xpath = "(//button[@type='button'])[3]")
	WebElement addbutton;

	@FindBy(xpath = "(//label[text()='Name']//following::input)[1]")
	WebElement name;

	@FindBy(xpath = "//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
	WebElement selectrelationshipbutton;

	@FindBy(xpath = "//i[@class='oxd-icon bi-calendar oxd-date-input-icon']")
	WebElement dobclick;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon'])[2]")
	WebElement yearclick;
	

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
	public void dependencieslink()
	{
		key.click(dependents);
	}
	public void addbuttondependencies()
	{
		key.click(addbutton);
	}
	public void dependentaddname(String dependent)
	{
		key.enterData(name, dependent);
	}

	public void enterrelationship(String relation) throws InterruptedException
	{
		key.click(selectrelationshipbutton);
		WebElement relations = key.driver.findElement(By.xpath("//span[text()='"+relation+"']"));
		relations.click();
		Thread.sleep(4000);
	}
	@FindBy(xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-icon-button__icon'])[1]")
	WebElement monthclick;
	public void dateofbirth(String year, String Month, String date) throws Throwable
	{
		key.click(dobclick);
		Thread.sleep(4000);
		key.click(yearclick);
		WebElement year1 = key.driver.findElement(By.xpath("//li[text()='"+year+"']"));
		year1.click();
		key.click(monthclick);
		Thread.sleep(4000);
		WebElement month1=	key.driver.findElement(By.xpath("//li[text()='October']"));
		month1.click();
		WebElement dates = key.driver.findElement(By.xpath("//div[text()='"+date+"']"));
		dates.click();
		Thread.sleep(4000);

    }
	@FindBy(xpath = "//button[text()=' Cancel ']//following::button[1]")
	//@FindBy(xpath = "//button[text()=' Save ']")
	WebElement savebutton;
	public void clicksave()
	{
		key.click(savebutton);
	}
	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	WebElement deletebutton;
	public void clickdelete()
	{
		key.click(deletebutton);
	}
	
}







