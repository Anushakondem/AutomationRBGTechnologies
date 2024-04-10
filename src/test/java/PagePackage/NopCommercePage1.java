package PagePackage;


import java.time.Duration;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class NopCommercePage1 

{
	public  NopCommercePage1(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath="//a[@href='/register?returnUrl=%2F']")
	WebElement register;

	@FindBy(xpath = "//label[text()='Female']")
	WebElement gender;

	@FindBy(xpath ="//input[@name='FirstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement lastName;
	
	@FindBy(xpath="//select[@name='DateOfBirthDay']")
	WebElement date;
	
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")
	WebElement monthes;
	
	@FindBy(xpath="//select[@name='DateOfBirthYear']")
	WebElement years;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement emails;
	
	@FindBy(xpath="//input[@id='Company']")
	WebElement company;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//button[@id='register-button']")
	WebElement registerButton;
	
	@FindBy(xpath="//a[text()='Continue']")
	WebElement continuebutton;
	
	@FindBy(xpath="(//a[@href='/computers'])[1]")
	WebElement computers;
	
	@FindBy(xpath="(//a[@href='/desktops'])[4]")
	WebElement desktopp;
	
	@FindBy(xpath="(//button[@class='button-2 product-box-add-to-cart-button'])[1]")
	WebElement addtoCart;
	
	@FindBy(xpath="//select[@name='product_attribute_1']")
	WebElement proccessor;
	
	@FindBy(xpath="//select[@name='product_attribute_2']")
	WebElement raam;
	
	@FindBy(xpath="//input[@id='product_attribute_3_7']")
	WebElement hdd;
	
	@FindBy(xpath="//input[@id='product_attribute_4_9']")
	WebElement os;
	
	@FindBy(xpath="//input[@id='product_attribute_5_10']")
	WebElement softWare;
	
	@FindBy(xpath="//button[@id='add-to-cart-button-1']")
	WebElement addToCart2;
	
	@FindBy(xpath="//a[text()='shopping cart']")
	WebElement linkaddedCart;
	
	@FindBy(xpath="//a[text()='Edit']")
	WebElement editable;
	
	@FindBy(xpath="//select[@id='product_attribute_2']")
	WebElement ramEditable;
	
	@FindBy(xpath="//input[@id='product_attribute_4_9']")
	WebElement osEditable;
	
	@FindBy(xpath="//input[@id='product_attribute_5_11']")
	WebElement softWareEditable;
	
	@FindBy(xpath="//button[@id='add-to-cart-button-1']")
	WebElement editBtton;

	GenericKeywordsWithPage keys=new GenericKeywordsWithPage("NopCommercePage1");


	public void registers() throws InterruptedException
	{
		keys.click(register);
		Thread.sleep(1000);

	}
	public void genderSelected() throws InterruptedException
	{

		keys.click(gender);
		Thread.sleep(2000);
	}
	public void enterfirstName(String frstName) throws InterruptedException
	{
		keys.enterData(firstName, frstName);
		Thread.sleep(4000);
	}
	public void lastNames(String secondName) throws InterruptedException
	{	
	keys.enterData(lastName, secondName);
	Thread.sleep(4000);
	
	}
	
	public void datess(String dates) throws InterruptedException
	{
		Thread.sleep(1000);
		keys.SelectDropDownByIndex(date, 25);
		Thread.sleep(1000);
	

	}
	public void monthss(String month) throws InterruptedException
	{
		Thread.sleep(1000);
		keys.SelectDropDownByIndex(monthes, 8);
	

	}
	public void yearss(String yearr) throws InterruptedException
	{
		
		keys.SelectDropDown(years, "1995");
		Thread.sleep(3000);
		

	}
	public void mailss(String mail) throws InterruptedException
	{
		Date date=new Date();
	String v= "venkat"+date.toString().replace(" ", "_").replace(":", "_")+"@gmail.com";
	String qs=RandomStringUtils.randomAlphabetic(8);
	String vs=qs+"@gmail.com";
	keys.enterData(emails, vs);
	Thread.sleep(3000);
	

	}
	public void company(String CompName) throws InterruptedException
	{
		Date dt=new Date();
		String n="neela"+dt.toString().replace(" ","_").replace(":","_")+"gmail.com";
		String ns=RandomStringUtils.randomAlphabetic(7);
		String ng=ns+"@gmail.com";
		keys.enterData(company, ng);
		Thread.sleep(1000);
		

	}
	public void enterpasswords(String pwords) throws InterruptedException
	{
		Thread.sleep(5000);
		keys.enterData(password, pwords);
		

	}
	public void confirmPassword(String cPassword) throws InterruptedException
	{
		Thread.sleep(1000);
		keys.enterData(confirmPassword, cPassword);
		

	}
	public void registerButton() throws InterruptedException
	{
		
		keys.click(registerButton);
		Thread.sleep(4000);

	}
	public void continuebutton() throws InterruptedException
	{
		Thread.sleep(1000);

		keys.click(continuebutton);
		

	}
	public void computers() throws InterruptedException
	{
		Thread.sleep(1000);
		keys.click(computers);
		Thread.sleep(4000);
		Thread.sleep(4000);

		keys.click(desktopp);
		

	}
	public void addToCart() throws InterruptedException
	{
		Thread.sleep(1000);
		keys.click(addtoCart);
		Thread.sleep(1000);
		

	}
	public void processor() throws InterruptedException
	{
		Thread.sleep(2000);
		keys.SelectDropDownByIndex(proccessor, 2);
		Thread.sleep(2000);
		

	}
	public void ram() throws InterruptedException
	{
		Thread.sleep(1000);
		keys.SelectDropDownByIndex(raam, 3);
		Thread.sleep(1000);
		Thread.sleep(1000);
	

	}
	public void hDD() throws InterruptedException
	{
		Thread.sleep(2000);
		keys.click(hdd);
		

	}
	public void os()throws InterruptedException
	{
		Thread.sleep(2000);
		keys.click(os);
		

	}
	public void software() throws InterruptedException
	{
		Thread.sleep(1000);
		keys.click(softWare);
		

	}
	public void addToCart2() throws InterruptedException
	{
		Thread.sleep(1000);
		keys.click(addToCart2);
		
		Thread.sleep(1000);



	}
	public void addedToCart() throws InterruptedException
	{
		Thread.sleep(9000);
		keys.driver.switchTo().activeElement().click();
		keys.clickForAlert(linkaddedCart);
		//keys.alertclick(linkaddedCart);
		//keys.click(linkaddedCart);
		Thread.sleep(2000);
	}
	public void editables() throws InterruptedException
	{	Thread.sleep(4000);
	keys.driver.switchTo().defaultContent();
	keys.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	keys.click(editable);
	Thread.sleep(4000);

	}
	public void ramEdit() throws InterruptedException
	{
		Thread.sleep(4000);
		keys.SelectDropDownByIndex(ramEditable, 2);
		Thread.sleep(2000);

	}
	public void osEditable() throws InterruptedException
	{
		Thread.sleep(2000);
		keys.click(osEditable);
	}
	public void softwareEditable() throws InterruptedException
	{
		Thread.sleep(3000);
		keys.click(softWareEditable);
		keys.click(editBtton);
	}

}

