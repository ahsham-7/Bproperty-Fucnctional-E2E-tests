package PageObjects;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.URL;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class HomePageObjects {
public WebDriver driver;

public HomePageObjects(WebDriver driver) {
	this.driver=driver;
}
@Test
public void Loginf() {
By Login= By.xpath("//*[@id=\"body-wrapper\"]/div/div[1]/div/div/nav/div[2]/div/button");
driver.findElement(Login).click();
By LoginUsername = By.xpath("//*[@id=\"body-wrapper\"]/div/div[1]/div/div/nav/div[2]/div/div/div/div/div[1]/form/div[1]/input");
driver.findElement(LoginUsername).sendKeys("testingreview30@gmail.com");
By LoginPassword = By.xpath("//*[@id=\"password\"]");
driver.findElement(LoginPassword).sendKeys("LN93");
By LoginBtnPop= By.xpath("//*[@id=\"body-wrapper\"]/div/div[1]/div/div/nav/div[2]/div/div/div/div/div[1]/form/div[3]/button");
driver.findElement(LoginBtnPop).click();
By Accountname= By.xpath("//*[@id=\"body-wrapper\"]/div/div[1]/div/div/nav/div[2]/div/a/span/div/span[2]");
WebElement acc= driver.findElement(Accountname);
assertEquals("techtesting",acc.getText());
}

@Test
public boolean VerifySearchpage() {
By FindBtn= By.xpath("//*[@id=\"body-wrapper\"]/header/div[4]/div/div/div[2]/a");
driver.findElement(FindBtn).click();
String searchpage=driver.getCurrentUrl();
if(searchpage.contains("https://www.bproperty.com/en/bangladesh/properties-for-rent/")) {
	driver.close();
	return true;
}
else {
	driver.close();
	return false;
}

}

@Test
public boolean VerifyCountry() {
By countryname= By.xpath("//*[@id=\"body-wrapper\"]/div/div[1]/div/div/nav/div[1]/div[1]/a/span/button");
driver.findElement(countryname).click();
By selectcname= By.xpath("//*[@id=\"body-wrapper\"]/div/div[1]/div/div/nav/div[1]/div[1]/div/ul/li[1]/a");
driver.findElement(selectcname).click();
String cname=driver.getTitle();
if(cname.contains("https://www.bayut.com/")) {
	driver.close();
	return true;
}
else {
	driver.close();
	return false;
}

}

@Test
public boolean VerifyLanguage() {
	By BangaliLanguage= By.xpath("//*[@id=\"body-wrapper\"]/div[1]/div[1]/div/div/nav/div[1]/a");
	driver.findElement(BangaliLanguage).click();
	if(driver.getTitle().contains("https://www.bproperty.com/bn/")) {
		driver.close();
		return true;
	}
	else {
		driver.close();
		return true;
	}
}

@Test
public boolean verifycurrency() {
	By sitesetting= By.xpath("//*[@id=\"body-wrapper\"]/div/div[1]/div/div/nav/div[1]/div[2]/a/span/button");
	driver.findElement(sitesetting).click();
	By changecurrency= By.xpath("//*[@id=\"body-wrapper\"]/div[1]/div[1]/div/div/nav/div[1]/div[2]/div/ul/li[1]/button");
	driver.findElement(changecurrency).click();
	By dropdown = By.xpath("//div[@class='dropdown _3f5a8f46']");
	driver.findElement(dropdown).click();
	By Euro= By.xpath("//li[@class='_55869fea' and text()='European Union (EUR)']");
	driver.findElement(Euro).click();
	By SaveBtn= By.xpath("//button[@class='d8b1d2e4' and @aria-label='Submit']");
	driver.findElement(SaveBtn).click();
	By verify= By.xpath("//span[@class='fontCompensation' and text()='Price (EUR)']");
	String Name= driver.findElement(verify).getText();
	if(Name.contains("Price (EUR)")) {
		driver.close();
		return true;
	}
	else {
		driver.close();
		return false;
	}
	
}
@Test
public boolean verifyAreaunit() {
	By sitesetting= By.xpath("//*[@id=\"body-wrapper\"]/div/div[1]/div/div/nav/div[1]/div[2]/a/span/button");
	driver.findElement(sitesetting).click();
	By areaunit= By.xpath("//button[@class='a1810848' and @aria-label='Change area unit'] ");
	driver.findElement(areaunit).click();
	By dropdown= By.xpath("//div[@class='dropdown _3f5a8f46']");
	driver.findElement(dropdown).click();
	By Katha= By.xpath("//li[@class='_55869fea' and text()='Katha']");
	driver.findElement(Katha).click();
	By Save= By.xpath("//button[@class='d8b1d2e4' and @aria-label='Submit']");
	driver.findElement(Save).click();
	By verify= By.xpath("//span[@class='fontCompensation' and text()='Area (Katha)']");
	if(driver.findElement(verify).getText().contains("Area (Katha)")) {
		driver.close();
		return true;
	}
	else {
		driver.close();
		return false;
	}
}
@Test
public boolean SalePopularLocations() {
	By ApartmentDhaka=By.xpath("//a[@title='Apartments for sale in Dhaka' and @class='_78d325fa ']");
	driver.findElement(ApartmentDhaka).click();
	if(driver.getCurrentUrl().contains("https://www.bproperty.com/en/dhaka/apartments-for-sale/")) {
		driver.close();
		return true;
	}
	else {
		driver.close();
		return false;
	}
}
@Test
public void VerifyRecentSearch() {
	By filter = By.xpath("//span[@class='fontCompensation' and text()='Rent']");
	driver.findElement(filter).click();
	By BuyMenu = By.xpath("//button[@aria-label='Buy' and @class='_933a9a61 FilterDesign2022 _234b4f07' and text()='Buy']");
	driver.findElement(BuyMenu).click();
	By Done= By.xpath("//button[@class='_29a3713c' and @aria-label='Close']");
	driver.findElement(Done).click();
	By SearchFilter= By.xpath("//ul[@aria-label='Location filter']");
	driver.findElement(SearchFilter).click();
	driver.findElement(SearchFilter).sendKeys("Pallabi");
	By Pallabi= By.xpath("");
}
@Test
public void VerifyTopBtn() {
    By btn = By.xpath("//span[@aria-label='Scroll to top']");
    JavascriptExecutor js =(JavascriptExecutor)driver;
    js.executeScript("window.scroll(0,2000)");
    driver.findElement(btn).click();
    Long zer=0L;
    Long scrollPosition1 = (Long) js.executeScript("return window.pageYOffset;");
    assertEquals(zer, scrollPosition1);
    driver.close();
		 
}
@Test
public void verifyAboutus() {
	By aboutUs= By.xpath("//a[@title='ABOUT US']");
	driver.findElement(aboutUs).click();
	String AboutUsUrl = driver.getCurrentUrl();
	String aboutUsDirected="https://www.bproperty.com/en/about/aboutus.html";
	assertEquals("https://www.bproperty.com/en/about/aboutus.html",AboutUsUrl);
	driver.close();
}
@Test
public void verifyContactus() {
	By contactUs= By.xpath("//a[@title='CONTACT US']");
	driver.findElement(contactUs).click();
	String contactUsUrl = driver.getCurrentUrl();
	String contactUsDirected="https://www.bproperty.com/en/about/aboutus.html";
	assertEquals("https://www.bproperty.com/en/contactus.html",contactUsUrl);
	driver.close();
}
@Test
public void verifyCareers() {
	By careers= By.xpath("//a[@title='CAREERS']");
	driver.findElement(careers).click();
	String careerUrl = driver.getCurrentUrl();
	assertEquals("https://www.bproperty.com/en/about/career.html",careerUrl);
	driver.close();
}
@Test
public void verifyTerms() {
	By terms= By.xpath("//a[@href='/en/terms.html']");
	driver.findElement(terms).click();
	String termsUrl = driver.getCurrentUrl();
	assertEquals("https://www.bproperty.com/en/terms.html",termsUrl);
	driver.close();
}
@Test
public boolean verifyChat() {
	By findChat=By.xpath("//span[@class='cc-xkyq cc-qvio']");
	driver.findElement(findChat).click();
	By chat= By.xpath("//div[@class='cc-1ta8']");
    if(driver.findElement(chat).isDisplayed()) {
    	driver.close();
    	return true;
    }
    else {
    	driver.close();
    	return false;
    }
	
}

@Test
public void VerifyFacebook() {
By findFacebook= By.xpath("//a[@title='Follow us on Facebook']");	
driver.findElement(findFacebook).click();
String facebookUrl=driver.getCurrentUrl();
assertEquals("https://www.facebook.com/bpropertybd/?fref=ts&em=1", facebookUrl);
driver.close();

}
@Test
public void VerifyTwitter() {
By findTwitter= By.xpath("//a[@title='Follow us on Twitter']");	
driver.findElement(findTwitter).click();
String TwitterUrl=driver.getCurrentUrl();
assertEquals("https://twitter.com/bproperty_com?lang=en", TwitterUrl);
driver.close();
}

@Test
public void VerifyPinterest() {
By findPinterest= By.xpath("//a[@title='Follow us on Pinterest']");	
driver.findElement(findPinterest).click();
String PinterestUrl=driver.getCurrentUrl();
assertEquals("https://www.pinterest.com/bpropertycom/", PinterestUrl);
driver.close();
}

@Test
public void VerifyInstagram() {
By findInstagram= By.xpath("//a[@title='Follow us on Instagram']");	
driver.findElement(findInstagram).click();
String instagramUrl=driver.getCurrentUrl();
assertEquals("https://www.instagram.com/bproperty_bd/?hl=en", instagramUrl);
driver.close();
}

@Test
public void VerifyYoutube() {
By findYoutube= By.xpath("//a[@title='Follow us on YouTube']");	
driver.findElement(findYoutube).click();
String youtubeUrl=driver.getCurrentUrl();
assertEquals("https://www.youtube.com/channel/UCcOkDaPhf_RYgs6OSZj7sLw", youtubeUrl);
driver.close();
}
@Test
public void VerifyDefaultPurpose() {
By findBtn= By.xpath("//a[@aria-label='Find button']");
driver.findElement(findBtn).click();
driver.manage().timeouts().pageLoadTimeout(500, TimeUnit.SECONDS);
String pageUrl= driver.getCurrentUrl();
assertEquals("https://sl:getin1@stage2.bproperty.com/en/bangladesh/properties-for-rent/",pageUrl);
driver.close();
}
}

