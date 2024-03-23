package practicetest;

import java.util.Hashtable;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.surveillance.Test.BaseTest;
import com.surveillance.utilitiy.GenericKeywordsWithPage;
import com.surveillance.utilitiy.PropertySingleton;
import com.surveillance.utilitiy.ReadData;
import com.surveillance.utilitiy.Xls_Reader;

import PagePackage.OrangeHrmloginPage;



public class OrangeLoginTest extends BaseTest
{
	OrangeHrmloginPage p1 ;
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();

	public void OrangeHRMLoginPage() throws Throwable
	{
		_instance = PropertySingleton.getInstance();
		p1 = new OrangeHrmloginPage(GenericKeywordsWithPage.driver);
	}
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}
	

	@Test(dataProvider = "setData1")
	public void OrangeHRMLogin(Hashtable<String , String> h1) throws Throwable 
	{
		extentLoggerECP = parentExtentLogger.createNode("Login With Invalid Credentials");
		s_assert = new SoftAssert();
		
		OrangeHRMLoginPage();
		p1.orusername(h1.get("username"));
		p1.orpassword(h1.get("password"));
		p1.loginbutton();
		Thread.sleep(4000);

		p1.myinfo();

		Thread.sleep(4000);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		p1.personaldetails();
	
		Thread.sleep(4000); 
		p1.fristname(h1.get("firstname"));
	
		Thread.sleep(5000);
		p1.middlename(h1.get("middlename"));
		
		p1.lastname(h1.get("lastname"));
		Thread.sleep(6000);
		
		p1.empid(h1.get("empid"));
		Thread.sleep(7000);
		
		p1.otherId(h1.get("OtherId"));
		Thread.sleep(8000);

	}
	@DataProvider
	public Object[][] setData1() 
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "//TestData//testdata.xlsx");
		return ReadData.getData("OrangeHRM", "OrangeHRM_TESTCASES", xls);	
	}


}
