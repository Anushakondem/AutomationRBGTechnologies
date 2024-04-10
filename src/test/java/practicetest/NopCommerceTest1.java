package practicetest;

import java.util.Hashtable;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

import PagePackage.NopCommercePage1;



public class NopCommerceTest1 extends BaseTest
{
	NopCommercePage1 orl;
	PropertySingleton _instance=null;
	SoftAssert s_assert =  new  SoftAssert();
	public NopCommerceTest1() throws Throwable
	{
		_instance = PropertySingleton.getInstance();
		orl= new NopCommercePage1(GenericKeywordsWithPage.driver);
	}
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	@Test(dataProvider="setData1")
	public void loginWithValidCredentials(Hashtable<String, String> h1) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("login With Valid Credentials");
		s_assert = new SoftAssert();
		orl=new NopCommercePage1(GenericKeywordsWithPage.driver);
		orl.registers();

		orl.genderSelected();
		orl.enterfirstName(h1.get("firstname"));
		orl.lastNames(h1.get("lastName"));
		orl.datess(h1.get("dates"));
		orl.monthss(h1.get("month"));
		orl.yearss(h1.get("yearr"));
		orl.mailss(h1.get("mails"));
		orl.company(h1.get("CompName"));
		orl.enterpasswords("sandeep");
		orl.confirmPassword("sandeep");
		orl.registerButton();

		orl.continuebutton();
		orl.computers();
		orl.addToCart();
		orl.ram();
		orl.hDD();
		orl.os();
		orl.software();
		orl.addToCart2();
		orl.addedToCart();
		orl.editables();
		orl.ramEdit();
		orl.osEditable();
		orl.softwareEditable();
	}
	@DataProvider
	public Object[][] setData1()
	{
		Xls_Reader xls=new Xls_Reader(System.getProperty("user.dir")+"\\TestData\\testdata.xlsx");
		return ReadData.getData("nopCommerce","nop_Commerce_Tests" , xls);
	}

}

