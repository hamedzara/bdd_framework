package tek.sdet.framework.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {
	 
	POMFactory factory = new POMFactory();
	
	
	
//	Scenario 1: passed
	
	
	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String categoryValue) {
	    click(factory.homePage().allDepartmentsDropDown);
	    List<WebElement> categoryList = factory.homePage().categorySelection;
	    for(WebElement categories : categoryList) {
	    	if(categories.getText().equals(categoryValue)) {
	    		click(categories);
	    		break;
	    	}
	    }
	    			    		
	    logger.info("User changed the category to: " + categoryValue);
	}
	
	@When("User search for an item {string}")
	public void userSearchForAnItem(String productValue) {
	    click(factory.homePage().searchBar);
	    sendText(factory.homePage().searchBar, productValue);
	    logger.info("User searched for the item: " + productValue);
	}
	
	@When("User click on Search icon")
	public void userClickOnSearchIcon() {
	    click(factory.homePage().searchButton);
	    logger.info("User clicked on search button");
	}
	
	@When("User click on item")
	public void userClickOnItem() {
	    click(factory.orderPage().productOrderValue);
	    logger.info("User clicked on item");
	}
	
	@When("User select quantity {string}")
	public void userSelectQuantity(String quantity) {
	    selectByValue(factory.orderPage().productQuantityValue, quantity);
	}
	
	@When("User click add to Cart button")
	public void userClickAddToCartButton() {
	    click(factory.homePage().AddCartBtnProduct);
	    logger.info("User clicked add to Cart button");
	}

	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String cartQuantity) {
	    Assert.assertEquals(factory.homePage().cartQuantityIcon.getText(), cartQuantity);
	    logger.info("User cart icon quantity changed to: " + cartQuantity);
	}
		
	
	
	
	
//	Scenario 2: Passed
	
	
	@And("User click on Cart option")
	public void userClickOnCartOption() {
	    click(factory.homePage().cartIcon);
	    logger.info("User clicked on cart Icon");
	}
	
	@And("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
	    click(factory.homePage().checkoutButton);
	    logger.info("User clicked on checkout button");
	}
	
	@And("User click Add a new address link for shipping address")
	public void userClickAddANewAddressLinkForShippingAddress() {
	    click(factory.homePage().addNewAddressLink);
	    logger.info("User clicked on add new address button");
	}
	
	@Then("User fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
	    List<Map<String, String>> orderNewAddressInfo = dataTable.asMaps(String.class, String.class);
	    sendText(factory.orderPage().orderAddressCountry, orderNewAddressInfo.get(0).get("country"));
	    clearMethod(factory.orderPage().orderAddressFullName);
	    sendText(factory.orderPage().orderAddressFullName, orderNewAddressInfo.get(0).get("fullName"));
	    clearMethod(factory.orderPage().orderAddressPhoneNumber);
	    sendText(factory.orderPage().orderAddressPhoneNumber, orderNewAddressInfo.get(0).get("phoneNumber"));
	    clearMethod(factory.orderPage().orderAddressStreet);
	    sendText(factory.orderPage().orderAddressStreet, orderNewAddressInfo.get(0).get("streetAddress"));
	    clearMethod(factory.orderPage().orderAddressApt);
	    sendText(factory.orderPage().orderAddressApt, orderNewAddressInfo.get(0).get("apt"));
	    clearMethod(factory.orderPage().orderAddressCity);
	    sendText(factory.orderPage().orderAddressCity, orderNewAddressInfo.get(0).get("city"));
	    waitTillClickable(factory.orderPage().orderAddressState);
	    click(factory.orderPage().orderAddressState);
	    selectByValue(factory.orderPage().orderAddressState, orderNewAddressInfo.get(0).get("state"));
	    clearMethod(factory.orderPage().orderAddressZipcode);
	    sendText(factory.orderPage().orderAddressZipcode, orderNewAddressInfo.get(0).get("zipCode"));
	    logger.info("User filled new address from information");
	    
	}
	
	@And("User click Add a credit card or Debit Card for Payment method")
	public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
	    click(factory.orderPage().addPaymentLink);
	    logger.info("User Clicked on add a payment mehtod");
	}
	
	@And("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
	    click(factory.orderPage().placeOrderBtn);
	    logger.info("User clicked on place order button");
	}
	
	@Then("a message should be displayed ‘Order Placed, Thanks’")
	public void aMessageShouldBeDisplayedOrderPlacedThanks() {
	    waitTillPresence(factory.orderPage().orderPlacedMsg);
	    Assert.assertTrue(isElementDisplayed(factory.orderPage().orderPlacedMsg));
	    logger.info("User order has been placed");
	}
	
	
	
	
//	Scenario 3: Passed
	
	
	@When("User click on the item")
	public void userClickOnTheItem() {
	    click(factory.orderPage().productValue2);
	    logger.info("User Clicked on the item");
	}
	
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String orderPlacement) {
		waitTillPresence(factory.orderPage().orderPlacedMsg);
	    Assert.assertTrue(isElementDisplayed(factory.orderPage().orderPlacedMsg));
	    logger.info("User " + orderPlacement);
	}
	
	
//	Scenario 4: Passed/ but if we run it as a single scenario, needs work with going through list of orders and canceling the order.
	
	
	@When("User click on Orders section")
	public void userClickOnOrdersSection() {
	    click(factory.orderPage().ordersSectionBtn);
	    logger.info("User Clicked on orders section");
	}
	
	@When("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		WebElement alreadyCanceled = factory.orderPage().orderCancelationText;
	    List<WebElement> orderlist = factory.orderPage().showOrderList;
	    for(WebElement order : orderlist) {
	    	if(order.equals(true)) {
//	    		click(order);
	    		break;
	    	} else {
	    	continue;
	    	}
	    
	    }
	}
	
	@When("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
	    click(factory.orderPage().orderCancelBtn);
	    logger.info("User clicked on Cancel order button");
	}
	
	@When("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String cancelationReason) {
	    selectByVisibleText(factory.orderPage().orderCancelReason, cancelationReason);
	}
	
	@When("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
	    click(factory.orderPage().orderCancelAffirmation);
	}
	
	
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String cancelText) {
		waitTillPresence(factory.orderPage().orderCancelationText);
	    Assert.assertTrue(isElementDisplayed(factory.orderPage().orderCancelationText));
	    logger.info("User Cancelation message:" + cancelText);
	    
	}
	
	
	

}
