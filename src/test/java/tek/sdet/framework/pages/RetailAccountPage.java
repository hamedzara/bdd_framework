package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath ="//a[@id='accountLink']")
	public WebElement accountBtn;
	
	@FindBy(xpath = "//img[@id='profileImage']")
	public WebElement profileImage;
	
	@FindBy(css = "#nameInput")
	public WebElement accountNameField;
	
	@FindBy(xpath = "//input[@id='personalPhoneInput']")
	public WebElement accountPhoneField;
	
	@FindBy(id="emailInput")
	public WebElement accountEmailField;
	
	@FindBy(xpath = "//input[@id='previousPasswordInput']")
	public WebElement accountPreviousPassField;
	
	@FindBy(id="newPasswordInput")
	public WebElement accountNewPassField;
	
	@FindBy(id="confirmPasswordInput")
	public WebElement accountConfirmPassField;
	
	@FindBy(id="personalUpdateBtn")
	public WebElement accountProfileUpdateBtn;
	
	@FindBy(id="personalCancelBtn")
	public WebElement accountCancelBtn;
	
	@FindBy(xpath="//button[@id='credentialsSubmitBtn']")
	public WebElement accountChangePassBtn;
	
	@FindBy(xpath="//h1[contains(text(),'tester1010@tekschool.us')]")
	public WebElement accountEmailDisplay;
	
	@FindBy(xpath="//h1[contains(text(),'hamed')]")
	public WebElement accountNameDisplay;
	
	@FindBy(xpath = "//div[contains(text(),'Personal Information Updated Successfully')]")
	public WebElement accountUpdateAlertMsg;
	
	@FindBy(xpath="//div[contains(text(),'Password Updated Successfully')]")
	public WebElement accountPasswordUpdateMsg;
	
	@FindBy(xpath="//p[contains(text(),'Add a payment method')]")
	public WebElement accountAddPaymentmethod;
	
	@FindBy(css="#cardNumberInput")
	public WebElement accountCardNumberField;
	
	@FindBy(id="nameOnCardInput")
	public WebElement accountNameOnCardField;
	
	@FindBy(xpath="//select[@id='expirationMonthInput']")
	public WebElement accountExpirationMonthField;
	
	@FindBy(xpath="//select[@id='expirationYearInput']")
	public WebElement accountExpirationYearField;
	
	@FindBy(id="securityCodeInput")
	public WebElement accountSecurityCodeField;
	
	@FindBy(css ="#paymentSubmitBtn")
	public WebElement accountAddCardBtn;
	
	@FindBy(xpath="//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement accountCardAddedMsg;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
	public WebElement accountCardsAndAccountBtn;
	
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	public WebElement accountCardEditBtn;
	
	@FindBy(css ="#paymentSubmitBtn")
	public WebElement accountUpdateCardBtn;
	
	@FindBy(css = "div.main-container div.bg-gray-100 div.account div:nth-child(2) div.account__payment div.account__payments div.account__payments-wrapper > div.account__payment-selected.account__payment-item")
	public WebElement accountCardInfoUpdateMsg;
	
	@FindBy(xpath = "//button[contains(text(),'remove')]")
	public WebElement accountCardRemoveBtn;
	
	@FindBy(xpath="//p[contains(text(),'Add Address')]")
	public WebElement accountAddAddressBtn;
	
	@FindBy(id="countryDropdown")
	public WebElement accountAddressCountry;
	
	@FindBy(id="fullNameInput")
	public WebElement accountAddressFullName;
	
	@FindBy(css="#phoneNumberInput")
	public WebElement accountAddressPhoneNumber;
	
	@FindBy(id="streetInput")
	public WebElement accountStreetAddress;
	
	@FindBy(id="apartmentInput")
	public WebElement accountAptAddress;
	
	@FindBy(xpath="//input[@id='cityInput']")
	public WebElement accountCityAddress;
	
	@FindBy(xpath="//select[@class='account__address-new-dropdown'][@name='state']")
	public WebElement accountStateAddress;
	
	@FindBy(id="zipCodeInput")
	public WebElement accountZipCodeAddress;
	
	@FindBy(xpath="//button[contains(text(),'Add Your Address')]")
	public WebElement accountAddressInfoAddBtn;
	
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	public WebElement accountAddressEditBtn;
	
	@FindBy(id="addressBtn")
	public WebElement accountAddressEditUpdateBtn;
	
	@FindBy(xpath="//div[contains(text(),'Address Added Successfully')]")
	public WebElement accountAddressAddedSuccessfulyMsg;
	
	@FindBy(xpath="//div[contains(text(),'Address Updated Successfully')]")
	public WebElement accountAddressUpdatedSuccessfulyMsg;
	
	@FindBy(xpath="//button[contains(text(),'Remove')]")
	public WebElement accountAddressRemoveBtn;
	
	
	

}
