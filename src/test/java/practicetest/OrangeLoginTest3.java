
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
		s1.orstreet(h1.get("street1"));
	
		s1.orstreet2(h1.get("street2"));
	
		s1.orcity(h1.get("cities"));
		
	
		s1.orstatepro(h1.get("states"));
		
		
		s1.orzippostal(h1.get("postalzip"));
		
		
		s1.orcountry(h1.get("countries"));
		
		s1.ormobile(h1.get("mobilenumber"));
	
		s1.orworknum(h1.get("workphonenum"));
	
		s1.orworkemail(h1.get("emailaddress"));
		
		s1.orotheremail(h1.get("otheremailadress"));
		
		s1.contactdetailssave();
		}

	@DataProvider
	public Object[][] setData1()
	{
		Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "//TestData//testdata.xlsx");
		return ReadData.getData("OrangeHRM3", "OrangeHRM_TESTCASES", xls);	
	}
}



