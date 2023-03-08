package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	@FindBy(xpath="//p[contains(text(),'Kasa Outdoor Smart Plug')]")
	public WebElement productOrderValue;
	
	@FindBy(xpath="//select[@class='product__select']")
	public WebElement productQuantityValue;
	
	@FindBy(xpath="//select[@id='countryDropdown']")
	public WebElement orderAddressCountry;
	
	@FindBy(css="#fullNameInput")
	public WebElement orderAddressFullName;
	
	@FindBy(id="phoneNumberInput")
	public WebElement orderAddressPhoneNumber;
	
	@FindBy(id="streetInput")
	public WebElement orderAddressStreet;
	
	@FindBy(id="apartmentInput")
	public WebElement orderAddressApt;
	
	@FindBy(xpath="//input[@id='cityInput']")
	public WebElement orderAddressCity;
	
	@FindBy(xpath="//select[@class='account__address-new-dropdown'][@name='state']")
	public WebElement orderAddressState;
	
	@FindBy(id="zipCodeInput")
	public WebElement orderAddressZipcode;
	
	@FindBy(id="addressBtn")
	public WebElement orderAddressAddBtn;
	
	@FindBy(xpath="//button[@id='addPaymentBtn']")
	public WebElement addPaymentLink;
	
	@FindBy(id="placeOrderBtn")
	public WebElement placeOrderBtn;
	
	@FindBy(xpath="//div[contains(text(),'Order Placed Successfully')]")
	public WebElement orderPlacedMsg;

}
