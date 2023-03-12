package tek.sdet.framework.pages;

import java.util.List;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {
	
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	@FindBy(xpath="//p[contains(text(),'Kasa Outdoor Smart Plug')]")
	public WebElement product1Value;
	
	@FindBy(xpath="//p[contains(text(),'Apex Legends - 1,000 Apex Coins')]")
	public WebElement productValue2;
	
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
	
	@FindBy(xpath = "//select[@class='account__address-new-dropdown' and @name='state']")
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
	
	@FindBy(id="orderLink")
	public WebElement ordersSectionBtn;
	
	@FindBy(xpath = "//div[@class='order']")
	public List <WebElement> orderList;
	
	@FindBy(xpath= "(//p[contains(text(),'Show Details')])")
	public List<WebElement> showDetailList;
	
	@FindBy(xpath ="(//div[@class='cart__item'])")
	public List<WebElement> orderCartItems;
	
	@FindBy(xpath ="(//span[contains(text(),'Delete')])")
	public List<WebElement> orderCartItemsDeleteBtn;
	
	@FindBy(xpath = "//h1[contains(text(),'Your Shopping Cart is Empty')]")
	public WebElement orderCartListEmptyMsg;
	
	@FindBy(id="checkAll")
	public WebElement orderCheckAllBtn;
	
	@FindBy(xpath="//button[@id='cancelBtn']")
	public WebElement orderCancelBtn;
	
	@FindBy(xpath = "//select[@id='reasonInput']")
	public WebElement orderCancelReason;
	
	@FindBy(id="orderSubmitBtn")
	public WebElement orderCancelAffirmation;
	
	@FindBy(xpath = "//p[contains(text(),'Your Order Has Been Cancelled')]")
	public WebElement orderCancelationMsg;
	
	@FindBy(xpath ="//p[contains(text(),'Cancelled')]")
	public WebElement orderCancelationText;
	
	@FindBy(id="returnBtn")
	public WebElement orderReturnBtn;
	
	@FindBy(id="reasonInput")
	public WebElement orderReturnReason;
	
	@FindBy(id="dropOffInput")
	public WebElement orderDropOff;
	
	@FindBy(css ="#orderSubmitBtn")
	public WebElement orderReturnOrderBtn;
	
	@FindBy(xpath="//p[contains(text(),'Return was successfull')]")
	public WebElement orderReturnSuccessfulMsg;
	
	@FindBy(css="#reviewBtn")
	public WebElement orderReviewBtn;
	
	@FindBy(id="headlineInput")
	public WebElement orderReviewHeadlineField;
	
	@FindBy(id="descriptionInput")
	public WebElement orderReviewDescriptoinField;
	
	@FindBy(id="reviewSubmitBtn")
	public WebElement orderAddReviewBtn;
	
	@FindBy(xpath="//div[contains(text(),'Your review was added successfully')]")
	public WebElement orderReviewAddedMsg;
	
	
	

}
