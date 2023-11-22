package E2EProject.Bproperty;
import org.testng.annotations.Test;

import PageObjects.HomePageObjects;
import PageObjects.SearchPageObjects;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;




public class SearchPage extends base {
	@BeforeMethod
	public void BeforeTest() throws Exception  {
		 driver = InitializeDriver();
		
		// ... Get the URL
	//	driver.get("https://sl:getin1@stage2.bproperty.com/en/bangladesh/properties-for-rent/");
	}
	@Test
	public void TestCase1() {

		SearchPageObjects TestCase1 = new SearchPageObjects(driver);
		TestCase1.verifypurpose();
	}
	@AfterMethod
	public void After(){
		try{
		    driver.quit();
		   }catch (Exception e){
		      System.out.println(e);
		      }
	}
	@Test
	public void TestCase2() {
		SearchPageObjects TestCase2 = new SearchPageObjects(driver);
		TestCase2.verifyBedsBaths();
		
	}
    @Test
    public void TestCase3() {
    	SearchPageObjects TestCase3 = new SearchPageObjects(driver);
		TestCase3.verifyMBS();
    }
    @Test
    public void TestCase4() {
    	SearchPageObjects TestCase4 = new SearchPageObjects(driver);
		TestCase4.verifyNewSortingfilter();
    }	
    @Test
    public void TestCase5() {
    	SearchPageObjects TestCase5 = new SearchPageObjects(driver);
		TestCase5.verifyNewSortingfilter();
    }
    @Test
    public void TestCase6() {
    	SearchPageObjects TestCase6 = new SearchPageObjects(driver);
		TestCase6.verifyHighSortingfilter();
    }
    @Test
    public void TestCase7() {
    	SearchPageObjects TestCase7 = new SearchPageObjects(driver);
		TestCase7.verifyLowSortingfilter();
    }
    @Test
    public void TestCase8() {
    	SearchPageObjects TestCase8 = new SearchPageObjects(driver);
		TestCase8.verifyActiveListings();
    }
    @Test
    public void TestCase9() throws InterruptedException {
    	SearchPageObjects TestCase9 = new SearchPageObjects(driver);
		TestCase9.verifyCompletionstatus();
    }
    
    @Test
    public void TestCase10() throws InterruptedException {
    	SearchPageObjects TestCase10 = new SearchPageObjects(driver);
		TestCase10.verifyPagination();;
    }	
	



	
	   
}
