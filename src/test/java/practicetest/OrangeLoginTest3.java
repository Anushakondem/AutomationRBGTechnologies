
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

import PagePackage.OrangeHrmLoginPage2;
import PagePackage.OrangeHrmLoginPage3;


public class OrangeLoginTest3 extends BaseTest
{
	OrangeHrmLoginPage3 s1;
	PropertySingleton _instance = null;
	SoftAssert s_assert = new SoftAssert();

	public void OrangeHrmLoginPage3() throws Throwable
	{
		_instance = PropertySingleton.getInstance();
		s1 = new OrangeHrmLoginPage3(GenericKeywordsWithPage.driver);
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
		OrangeHrmLoginPage3();
		s1.orusername(h1.get("username"));
		s1.orpassword(h1.get("password"));
		s1.loginbutton();
		Thread.sleep(4000);
		s1.myinfo();
		Thread.sleep(6000);
		s1.orcontactdetails();
		Thread.sleep(5000);
		
	}

	@DataProvider
	public Object[][] setData1()
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "//TestData//testdata.xlsx");
		return ReadData.getData("OrangeHRM2", "OrangeHRM_TESTCASES", xls);	
	}
}



