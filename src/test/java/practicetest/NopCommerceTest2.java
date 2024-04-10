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

import PagePackage.NopCommercePage2;

public class NopCommerceTest2 extends BaseTest
{
	
		NopCommercePage2 orl;
		PropertySingleton _instance=null;
		SoftAssert s_assert =  new  SoftAssert();
		public NopCommerceTest2() throws Throwable
		{
			_instance = PropertySingleton.getInstance();
			orl= new NopCommercePage2(GenericKeywordsWithPage.driver);
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
			orl=new NopCommercePage2(GenericKeywordsWithPage.driver);
			orl.registers();
			orl.genderSelected();
			orl.firstName(h1.get("firstName"));
			orl.lastNames(h1.get("lastName"));
			orl.datess(h1.get("dates"));
			orl.monthss(h1.get("month"));
			orl.yearss(h1.get("yearr"));
			orl.mailss(h1.get("mails"));
			orl.company(h1.get("CompName"));
			orl.passWords(h1.get("passwords"));
			orl.confirmPassword(h1.get("cPassword"));
			orl.registerButton();
			
			orl.continuebutton();
			
			orl.computers();
			
			orl.notebooks();
			
			orl.cpuCheckBox();
			orl.memorySelection();
			orl.sortBy();
			Thread.sleep(12000);
			
			orl.pagesSize();
			Thread.sleep(12000);
			orl.addToCart2();
			orl.ShoppingCarts();
			orl.quantityEdit(h1.get("quantity"));
	}
		@DataProvider
		public Object[][] setData1()
		{
			Xls_Reader xls=new Xls_Reader(System.getProperty("user.dir")+"\\TestData\\testdata.xlsx");
			return ReadData.getData("nopCommerce2","nop_Commerce_Tests" , xls);
		}
	}


