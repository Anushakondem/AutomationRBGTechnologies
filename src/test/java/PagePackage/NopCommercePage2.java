package PagePackage;

import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.surveillance.utilitiy.GenericKeywordsWithPage;

public class NopCommercePage2 
{
		public  NopCommercePage2(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		@FindBy(xpath="//a[@href='/register?returnUrl=%2F']")
		WebElement register;
		@FindBy(xpath="//label[text()='Female']")
		WebElement gender;
		@FindBy(xpath="//input[@id='FirstName']")
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
		
		@FindBy(xpath=" (//a[text()='Notebooks '])[3]")
		WebElement noteBoks;
		
	
		
		@FindBy(xpath="(//input[@type='checkbox'])[1]")
		WebElement CpuCheckbox;
		
		@FindBy(xpath="//input[@id='attribute-option-8']")
		WebElement memorySelect;
		
		@FindBy(xpath="//select[@id='products-orderby']")
		WebElement sortBy;
		
		@FindBy(xpath="//select[@id='products-pagesize']")
		WebElement pageSize;
		
		@FindBy(xpath="(//button[@type='button'])[1]")
		WebElement addToCart2;
		
		@FindBy(xpath="//button[@id='add-to-cart-button-4']")
		WebElement addedToCart3;
		
		@FindBy(xpath="//a[text()='shopping cart']")
		WebElement shoppingCarts;
		
		@FindBy(xpath="(//label[text()='Qty.:']//following::input)[1]")
		WebElement quantityEdit;
		
		GenericKeywordsWithPage keys=new GenericKeywordsWithPage("NopCommercePage2");
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
		public void firstName(String frstName) throws InterruptedException
		{
			Thread.sleep(1000);
			keys.enterData(firstName, frstName);
			
		}
		public void lastNames(String secondName) throws InterruptedException
		{	
		keys.enterData(lastName, secondName);
		
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
			Thread.sleep(1000);
			keys.SelectDropDown(years,"2001");
			

		}
		public void mailss(String mail) throws InterruptedException
		{Date date=new Date();
		String v= "venkat"+date.toString().replace(" ", "_").replace(":", "_")+"@gmail.com";
		String qs=RandomStringUtils.randomAlphabetic(8);
		String vs=qs+"@gmail.com";
		keys.enterData(emails, vs);
		Thread.sleep(3000);
		//keys.enterData(emails, mail);
		

		}
		public void company(String CompName) throws InterruptedException
		{
			Date dt=new Date();
			String n="neela"+dt.toString().replace(" ","_").replace(":","_")+"gmail.com";
			String ns=RandomStringUtils.randomAlphabetic(7);
			String ng=ns+"@gmail.com";
			keys.enterData(company, ng);
			Thread.sleep(1000);
			//keys.enterData(company, CompName);
			

		}
		public void passWords(String passwords) throws InterruptedException
		{
			Thread.sleep(1000);
			keys.enterData(password, passwords);
			
		}
		public void confirmPassword(String cPassword) throws InterruptedException
		{
			Thread.sleep(1000);
			keys.enterData(confirmPassword, cPassword);
			

		}
		public void registerButton() throws InterruptedException
		{
			Thread.sleep(1000);
			keys.click(registerButton);
			

		}
		public void continuebutton() throws InterruptedException
		{
			Thread.sleep(1000);

			keys.click(continuebutton);
			

		}
		
		public void computers() throws InterruptedException
		{
		
			keys.click(computers);
			Thread.sleep(4000);
			
		}
		public void notebooks() throws InterruptedException
		{
			Thread.sleep(4000);
			keys.click(noteBoks);
		}
		public void cpuCheckBox() throws InterruptedException
		{
			
			keys.click(CpuCheckbox);
			Thread.sleep(3000);
		}
		public void memorySelection() throws InterruptedException
		{
			Thread.sleep(2000);
			keys.click(memorySelect);
		}
		public void sortBy() throws InterruptedException
		{
			Thread.sleep(2000);
			keys.SelectDropDownByIndex(sortBy, 1);	
		}
		public void pagesSize() throws InterruptedException
		{
			Thread.sleep(2000);
			keys.SelectDropDownByIndex(pageSize, 1);	
		}
		public void addToCart2() throws InterruptedException
		{
			Thread.sleep(3000);
			keys.click(addToCart2);
			Thread.sleep(3000);
			Thread.sleep(3000);
			keys.click(addedToCart3);

		}
		public void ShoppingCarts() throws InterruptedException
		{
			Thread.sleep(2000);
			keys.driver.switchTo().activeElement();
			keys.clickForAlert(shoppingCarts);
		}
		public void quantityEdit(String quantity) throws InterruptedException
		{
			Thread.sleep(3000);
			//keys.driver.switchTo().defaultContent();
			Thread.sleep(3000);
			keys.click(quantityEdit);
			keys.enterData(quantityEdit, quantity);
		}
	}

