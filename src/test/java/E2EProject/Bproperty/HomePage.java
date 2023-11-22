package E2EProject.Bproperty;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import PageObjects.HomePageObjects;
import PageObjects.SearchPageObjects;


@Test
public class HomePage extends base {
	public void navigate() throws Exception {
		driver = InitializeDriver();	
		// ... Get the URL
		driver.get("https://sl:getin1@stage2.bproperty.com/en/bangladesh/properties-for-rent/");
		HomePageObjects obj = new HomePageObjects(driver);
		obj.Loginf();
		obj.VerifySearchpage();
		obj.VerifyCountry();
		obj.VerifyLanguage();
		obj.SalePopularLocations();
		obj.verifyAreaunit();
		obj.VerifyTopBtn();
		obj.verifyAboutus();
		obj.verifyContactus();
		obj.verifyCareers();
		obj.verifyTerms();
		obj.verifyChat();
		obj.VerifyYoutube();
		obj.VerifyTwitter();
		obj.VerifyFacebook();
		obj.VerifyPinterest();
		obj.VerifyDefaultPurpose();
		
		

		
		
}

	
	   
}
