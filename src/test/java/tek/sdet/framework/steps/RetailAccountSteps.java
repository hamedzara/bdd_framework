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
import tek.sdet.framework.utilities.DataGeneratorUtility;

public class RetailAccountSteps extends CommonUtility{

	POMFactory factory = new POMFactory();
	
//	Retail Account Scenarios
	
	
//	Scenario 1: Passed
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
	    click(factory.homePage().accountBtn);
	    logger.info("User Clicked on account button");
	}
	
	@And("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearMethod(factory.accountPage().accountNameField);
	    sendText(factory.accountPage().accountNameField, DataGeneratorUtility.data(nameValue));
	    											  // In here I am using Data faker to generate a name value for me
	    											  // By providing the value 'fullName' in our scenario parameter
	    											  // Which is a trigger for our data faker generator to catch and generate
	    											  // You can check the code in DataGeneratorUtility class
	    clearMethod(factory.accountPage().accountPhoneField);
	    sendText(factory.accountPage().accountPhoneField, DataGeneratorUtility.data(phoneValue));
	    logger.info("User updated name: " + nameValue + " / and updated phone: " + phoneValue);
	    
	    
	}
	
	@And("User click on Update button")
	public void userClickOnUpdateButton() {
	    click(factory.accountPage().accountProfileUpdateBtn);
	    logger.info("User clicked on update bottun");
	}
	
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().accountUpdateAlertMsg);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().accountUpdateAlertMsg));
		logger.info("User profile is updated successfuly");
		
	    
	}
	
	
	
//	Scenario 2: Passed
	
	@And("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
	    List<Map<String, String>> passwordUpdateInformation = dataTable.asMaps(String.class, String.class);
	    sendText(factory.accountPage().accountPreviousPassField, passwordUpdateInformation.get(0).get("previousPassword"));
	    sendText(factory.accountPage().accountNewPassField, passwordUpdateInformation.get(0).get("newPassword"));
	    sendText(factory.accountPage().accountConfirmPassField, passwordUpdateInformation.get(0).get("confirmPassword"));
	    logger.info("User passed the new info");
		
	}
	
	@And("User click on Change Password button")
	public void userClickOnChangePasswordButton() {
		click(factory.accountPage().accountChangePassBtn);
		logger.info("User clicked on tchange account button");
	    
	}
	
	@Then("a message should be displayed ‘Password Updated Successfully’")
	public void aMessageShouldBeDisplayedPasswordUpdatedSuccessfully() {
		waitTillPresence(factory.accountPage().accountPasswordUpdateMsg);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().accountPasswordUpdateMsg));
		logger.info("Password is updated successfuly");
		
	    
	}
	
	
//	Scenario 3: Passed
	
	
	@And("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
	    click(factory.accountPage().accountAddPaymentmethod);
	    logger.info("User clicked on add payment method");
	}
	
	@And("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> addPaymentInfo = dataTable.asMaps(String.class, String.class);
		clearMethod(factory.accountPage().accountCardNumberField);
		sendText(factory.accountPage().accountCardNumberField, DataGeneratorUtility.data(addPaymentInfo.get(0).get("cardNumber")));
		
		clearMethod(factory.accountPage().accountNameOnCardField);
		sendText(factory.accountPage().accountNameOnCardField, DataGeneratorUtility.data(addPaymentInfo.get(0).get("nameOnCard")));
															// Whenever I use DataGeneratorUtility class, it means I am using data faker
		
		sendText(factory.accountPage().accountExpirationMonthField, addPaymentInfo.get(0).get("expirationMonth"));
		sendText(factory.accountPage().accountExpirationYearField, addPaymentInfo.get(0).get("expirationYear"));
		
		clearMethod(factory.accountPage().accountSecurityCodeField);
		sendText(factory.accountPage().accountSecurityCodeField, DataGeneratorUtility.data(addPaymentInfo.get(0).get("securityCode")));
		logger.info("User filled the account information");
	}
	
	
	@And("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
	    click(factory.accountPage().accountAddCardBtn);
	    logger.info("User Clicked on add card button");
	}
	
	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		waitTillPresence(factory.accountPage().accountCardAddedMsg);
	    Assert.assertTrue(isElementDisplayed(factory.accountPage().accountCardAddedMsg));
	    logger.info("User has added a Payment Method Successfuly");
	    
	}
	
	
	
	
//	Scenario 4: Passed
	
	
	@And("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
	    List<WebElement> paymentCardsList = factory.accountPage().accountCardsList;
	    for(WebElement card : paymentCardsList) {
	    	click(card);
	    	break;
	    }
	    click(factory.accountPage().accountCardEditBtn);
	    logger.info("User clicked chose the card and clicked on edit");
	}
	
	@And("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
	    List<Map<String, String>> updatingCardInformation = dataTable.asMaps(String.class, String.class);
	    clearMethod(factory.accountPage().accountCardNumberField);
	    sendText(factory.accountPage().accountCardNumberField, DataGeneratorUtility.data(updatingCardInformation.get(0).get("cardNumber")));
	    clearMethod(factory.accountPage().accountNameOnCardField);
	    sendText(factory.accountPage().accountNameOnCardField, DataGeneratorUtility.data(updatingCardInformation.get(0).get("nameOnCard")));
	    sendText(factory.accountPage().accountExpirationMonthField, updatingCardInformation.get(0).get("expirationMonth"));
	    sendText(factory.accountPage().accountExpirationYearField, updatingCardInformation.get(0).get("expirationYear"));
	    clearMethod(factory.accountPage().accountSecurityCodeField);
	    sendText(factory.accountPage().accountSecurityCodeField, DataGeneratorUtility.data(updatingCardInformation.get(0).get("securityCode")));
	    logger.info("User edited and updated the payment information");
	}
	
	@And("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
	    click(factory.accountPage().accountUpdateCardBtn);
	    logger.info("User clicked on update card button");
	}
	
	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
	    waitTillPresence(factory.accountPage().accountCardInfoUpdateMsg);
	    Assert.assertTrue(isElementDisplayed(factory.accountPage().accountCardInfoUpdateMsg));
	    logger.info("User payment method is updated successfuly");
	    
	}
	
	
	
	
//	Scenario 5: Passed
	
	
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		
		List<WebElement> cardsList = factory.accountPage().accountCardsList;
		logger.info("This is users current card count: " + cardsList.size());
			for(WebElement cards : cardsList) {
				waitTillClickable(cards);
				click(cards);
			}
			
		click(factory.accountPage().accountCardRemoveBtn);
	    logger.info("User clicked on remove card button");
	}
	
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		List<WebElement> accountCardList = factory.accountPage().accountCardsList;

					
		logger.info("This is Users card count after removal: " + accountCardList.size());
			
		
		logger.info("User payment details is removed");
	}
	
	
	
//	Scenario 6: Passed
	
	
	
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
	    click(factory.accountPage().accountAddAddressBtn);
	    logger.info("User clicked on Add Address button");
	}
	
	@And("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
	    List<Map<String, String>> newAddressTable = dataTable.asMaps(String.class, String.class);
	    click(factory.accountPage().accountAddressCountry);
	    selectByValue(factory.accountPage().accountAddressCountry, newAddressTable.get(0).get("country"));
	    
	    click(factory.accountPage().accountAddressFullName);
	    clearMethod(factory.accountPage().accountAddressFullName);
	    sendText(factory.accountPage().accountAddressFullName, DataGeneratorUtility.data(newAddressTable.get(0).get("fullName")));

	    click(factory.accountPage().accountAddressPhoneNumber);
	    clearMethod(factory.accountPage().accountAddressPhoneNumber);
	    sendText(factory.accountPage().accountAddressPhoneNumber, DataGeneratorUtility.data(newAddressTable.get(0).get("phoneNumber")));

	    click(factory.accountPage().accountStreetAddress);
	    clearMethod(factory.accountPage().accountStreetAddress);
	    sendText(factory.accountPage().accountStreetAddress, DataGeneratorUtility.data(newAddressTable.get(0).get("streetAddress")));

	    click(factory.accountPage().accountAptAddress);
	    clearMethod(factory.accountPage().accountAptAddress);
	    sendText(factory.accountPage().accountAptAddress, newAddressTable.get(0).get("apt"));

	    click(factory.accountPage().accountCityAddress);
	    clearMethod(factory.accountPage().accountCityAddress);
	    sendText(factory.accountPage().accountCityAddress, DataGeneratorUtility.data(newAddressTable.get(0).get("city")));

	    click(factory.accountPage().accountStateAddress);
	    sendText(factory.accountPage().accountStateAddress, newAddressTable.get(0).get("state"));
	    
	    click(factory.accountPage().accountZipCodeAddress);
	    clearMethod(factory.accountPage().accountZipCodeAddress);
	    sendText(factory.accountPage().accountZipCodeAddress, DataGeneratorUtility.data(newAddressTable.get(0).get("zipCode")));
	    logger.info("User filled the address info");
	    
	}
	
	@And("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
	    click(factory.accountPage().accountAddressInfoAddBtn);
	    logger.info("User clicked on add address button");
	}
	
	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		waitTillClickable(factory.accountPage().accountAddressAddedSuccessfulyMsg);
	    Assert.assertTrue(isElementDisplayed(factory.accountPage().accountAddressAddedSuccessfulyMsg));
	    logger.info("User Successfuly added Address");
	    
	}
	
	
	
//	Scenario 7: Failed (wont clear the field input)
	
	
	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		List<WebElement> adressList = factory.accountPage().accountAddressList;
		for(WebElement address : adressList) {
			click(factory.accountPage().accountAddressEditBtn);
			break;
		}
	    logger.info("User clicked on address edit button");
	}
	
	
	
	
	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
	    click(factory.accountPage().accountAddressEditUpdateBtn);
	    logger.info("User clicked on update button");
	}
	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
	    waitTillPresence(factory.accountPage().accountAddressUpdatedSuccessfulyMsg);
	    Assert.assertTrue(isElementDisplayed(factory.accountPage().accountAddressUpdatedSuccessfulyMsg));
	    logger.info("User Address Updated Successfuly");
	}
	
	

	
//	Scenario 8: Passed
	
	
	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		List<WebElement> adressList = factory.accountPage().accountAddressList;
		for(WebElement address : adressList) {			
			click(factory.accountPage().accountAddressRemoveBtn);
			break;
		}
		
	    logger.info("User clicked on address remove button");
	}
	
	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
	    logger.info("User removed Address Details");
	}
	
	
	
	
	
	
}
