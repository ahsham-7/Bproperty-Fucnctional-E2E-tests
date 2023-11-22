package PageObjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SearchPageObjects {
WebDriver driver;
	public SearchPageObjects(WebDriver driver) {
		this.driver=driver;
	}

public void verifypurpose() {
	By purpose= By.xpath("//*[text()='purpose']//parent::div");
	driver.findElement(purpose).click();
	driver.manage().timeouts().pageLoadTimeout(50000, TimeUnit.SECONDS);
	By BuyBtn= By.xpath("//button[@aria-label='Buy']");
	driver.findElement(BuyBtn).click();
	By btn= By.xpath("//span[@class='d92d11c7 FilterDesign2022']");
	System.out.println(driver.findElement(btn).getAttribute("aria-selected"));
	if((driver.findElement(btn).getAttribute("aria-selected").contains("true"))){
		By btn1= By.xpath("//li[text()='Under Construction']");
		driver.findElement(btn1).click();
		String URL="https://sl:getin1@stage2.bproperty.com/en/bangladesh/properties-for-sale/?completion_status=under-construction";
		assertEquals(driver.getCurrentUrl(), URL);
  
	}
	else {
		assertTrue(false);
	
	}
}

public void verifyBedsBaths() {
	By bedsBathFilter= By.xpath("//span[@class='fontCompensation' and text()='Beds & Baths']");
	driver.findElement(bedsBathFilter).click();	
	By selectBeds3=By.xpath("//ul[@aria-label='Beds filter']/li[text()='3']");
	driver.findElement(selectBeds3).click();
	By selectBeds4=By.xpath("//ul[@aria-label='Beds filter']/li[text()='4']");
	driver.findElement(selectBeds4).click();
	By selectBeds5=By.xpath("//ul[@aria-label='Beds filter']/li[text()='5']");
	driver.findElement(selectBeds5).click();

	By selectBaths2=By.xpath("//ul[@aria-label='Baths filter']/li[text()='2']");
	driver.findElement(selectBaths2).click();
	By selectBaths3=By.xpath("//ul[@aria-label='Baths filter']/li[text()='3']");
	driver.findElement(selectBaths3).click();
	By done= By.xpath("//button[@aria-label='Close']");
	driver.findElement(done).click();

	String URL="https://sl:getin1@stage2.bproperty.com/en/bangladesh/3,4,5-bedroom-properties-for-rent/?baths_in=2%2C3";
    assertEquals(URL, driver.getCurrentUrl());
 
	}

public void verifyMBS() {
	By MbsBtn=By.xpath("//div[@aria-label='Map based search toggle']");
	driver.findElement(MbsBtn).click();
	String Url="https://sl:getin1@stage2.bproperty.com/en/bangladesh/properties-for-rent/?map_active=true";
	assertEquals(driver.getCurrentUrl(),Url);
	driver.close();
}

public void verifyNewSortingfilter() {
	By sortFilter= By.xpath("//div[@aria-label='Sort by filter']");
	driver.findElement(sortFilter).click();
	By Newest = By.xpath("//div[@class='_0a772a68']/div/div/ul//li[@value='Newest']");
	driver.findElement(Newest).click();
	String Url="https://sl:getin1@stage2.bproperty.com/en/bangladesh/properties-for-rent/?sort=date_desc";
	assertEquals(driver.getCurrentUrl(),Url);	
	driver.close();
}

public void verifyLowSortingfilter() {
	By sortFilter= By.xpath("//div[@aria-label='Sort by filter']");
	driver.findElement(sortFilter).click();
	By Lowest = By.xpath("//div[@class='_0a772a68']/div/div/ul//li[@value='Lowest Price']");
	driver.findElement(Lowest).click();
	String Url="https://sl:getin1@stage2.bproperty.com/en/bangladesh/properties-for-rent/?sort=price_asc";
	assertEquals(driver.getCurrentUrl(),Url);	
	driver.close();
}

public void verifyHighSortingfilter() {
	By sortFilter= By.xpath("//div[@aria-label='Sort by filter']");
	driver.findElement(sortFilter).click();
	By Highest = By.xpath("//div[@class='_0a772a68']/div/div/ul//li[@value='Highest Price']");
	driver.findElement(Highest).click();
	String Url="https://sl:getin1@stage2.bproperty.com/en/bangladesh/properties-for-rent/?sort=price_desc";
	assertEquals(driver.getCurrentUrl(),Url);	
	driver.close();
}

public void verifyActiveListings() {
	By activeListing = By.xpath("//input[@id='active-listings-filter']");
	driver.findElement(activeListing).click();
	String Url="https://sl:getin1@stage2.bproperty.com/en/bangladesh/properties-for-rent/?load_all_prop=1";
	assertEquals(driver.getCurrentUrl(),Url);
}


public void verifyCompletionstatus() throws InterruptedException{
driver.get("https://sl:getin1@stage2.bproperty.com/en/bangladesh/properties-for-sale/");
By Ready = By.xpath("//button[text()='Ready']");
driver.findElement(Ready).click();
String Url="https://sl:getin1@stage2.bproperty.com/en/bangladesh/properties-for-sale/?completion_status=ready";
assertEquals(driver.getCurrentUrl(), Url);

By UnderCons = By.xpath("//button[text()='Under Construction']");
driver.findElement(UnderCons).click();
String UrlD="https://sl:getin1@stage2.bproperty.com/en/bangladesh/properties-for-sale/?completion_status=under-construction";
assertEquals(driver.getCurrentUrl(),UrlD);
By All = By.xpath("//button[text()='All']");
driver.findElement(All).click();
String UrlD1="https://sl:getin1@stage2.bproperty.com/en/bangladesh/properties-for-sale/";
assertEquals(driver.getCurrentUrl(),UrlD1);
}
public void verifyGridView() {
 By GridBtn= By.xpath("//span[@aria-label='Grid view']");
 driver.findElement(GridBtn).click();
 By DispGrid= By.xpath("//ul[@class='_5fe78509']");
  assertTrue(driver.findElement(DispGrid).isDisplayed()) ;
}
public void verifyListView() {
 By GridBtn= By.xpath("//span[@aria-label='Grid view']");
 driver.findElement(GridBtn).click();
 By ListBtn= By.xpath("//span[@aria-label='List view']");
 driver.findElement(ListBtn).click();
 By DispList= By.xpath("//ul[@class='_357a9937']");
 assertTrue(driver.findElement(DispList).isDisplayed());
}
public void verifyPagination() {
	By Pg2= By.xpath("//div[@title='Page 2']");
	driver.findElement(Pg2).click();
	String URL=("https://sl:getin1@stage2.bproperty.com/en/bangladesh/properties-for-rent/page-2/");
	Assert.assertEquals(driver.getCurrentUrl(), URL);
	By Pg5 = By.xpath("//div[@title='Page 5']");
	driver.findElement(Pg5).click();
	String URL1= ("https://sl:getin1@stage2.bproperty.com/en/bangladesh/properties-for-rent/page-5/");
	Assert.assertEquals(driver.getCurrentUrl(), URL1);
	By NextBtn = By.xpath("//div[@title='Next']");
	driver.findElement(NextBtn).click();
	String URL2=("https://sl:getin1@stage2.bproperty.com/en/bangladesh/properties-for-rent/page-6/");
	Assert.assertEquals(driver.getCurrentUrl(), URL2);
	By PreviosBtn = By.xpath("//div[@title='Previous']");
	driver.findElement(PreviosBtn).click();
	Assert.assertEquals(driver.getCurrentUrl(), URL1);
	By FirstPage = By.xpath("//div[@title='First Page']");
	driver.findElement(FirstPage).click();
	String URL_Default=("https://sl:getin1@stage2.bproperty.com/en/bangladesh/properties-for-rent/");
	Assert.assertEquals(driver.getCurrentUrl(), URL_Default);
}
}




