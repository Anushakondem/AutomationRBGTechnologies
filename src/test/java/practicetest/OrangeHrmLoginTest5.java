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


import PagePackage.OrangeHrmLoginPage5;

public class OrangeHrmLoginTest5 extends BaseTest
{
	OrangeHrmLoginPage5 s1;
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();

	public void OrangeHrmLoginPage5() throws Throwable
	{
		_instance = PropertySingleton.getInstance();
		s1 = new OrangeHrmLoginPage5(GenericKeywordsWithPage.driver);
	}
	@BeforeClass
	public void startReport()
	{
		beforeClassForChild(this);
	}

	@Test(dataProvider = "setData1")
	public void OrangeHrmLogin(Hashtable<String , String> h1) throws Throwable
	{
		extentLoggerECP = parentExtentLogger.createNode("Login With Invalid Credentials");
		s_assert = new SoftAssert();
		OrangeHrmLoginPage5();
		s1.orusername(h1.get("username"));
		s1.orpassword(h1.get("password"));
		s1.loginbutton();
	
		s1.myinfo();
		Thread.sleep(6000);
		s1.dependencieslink();
		s1.addbuttondependencies();
	
		s1.dependentaddname(h1.get("name"));
		s1.enterrelationship(h1.get("relations"));
		
		s1.dateofbirth(h1.get("year"), h1.get("Month"), h1.get("date"));
		
		s1.clicksave();
	
		
		s1.clickdelete();
		Thread.sleep(6000);
		}

	@DataProvider
	public Object[][] setData1()
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "//TestData//testdata.xlsx");
		return ReadData.getData("OrangeHRM5", "OrangeHRM_TESTCASES", xls);	
	}
}
