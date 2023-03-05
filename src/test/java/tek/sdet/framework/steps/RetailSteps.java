package tek.sdet.framework.steps;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;
import tek.sdet.framework.base.BaseSetup;

public class RetailSteps extends CommonUtility {
	
	private POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		
		Assert.assertEquals(actualTitle, expectedTitle); // we use assert to verify our elements are similar or not.
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		
		logger.info("User is on retail website");
		logger.info("Actual Title: " + actualTitle + " = Expected Title: " + expectedTitle);
		
	}
	
	@When("User search for {string} product")
	public void userSearchForProduct(String productValue) {
		sendText(factory.homePage().searchBar, productValue);
		click(factory.homePage().searchButton);
		logger.info("User searched for Product " + productValue);
		
	}
	
	@Then("The product should be displayed")
	public void productShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemonProduct));
		logger.info("The Product is displayed on home page");
		
		
	}
	
	
//	Scenario 1: Passed
	
	
	@When("User click on All section")
	public void userClickOnAllSection() {
	    click(factory.homePage().allIcon);
	    logger.info("User clicked on All section");
	}
	
	@Then("below options are present in Shop by Department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
	    List<List<String>> expectedSideBar = dataTable.asLists(String.class);
	    
	    List<WebElement> actualSideBar = factory.homePage().sideBarElement;
	    
	    for(int i = 0; i<expectedSideBar.get(0).size(); i++) {
	    	Assert.assertEquals(actualSideBar.get(i).getText(), expectedSideBar.get(0).get(i));
	    }
	}
	
	
//	Scenario 2: 
	
	
	
	
	
	
	
	
	
}
