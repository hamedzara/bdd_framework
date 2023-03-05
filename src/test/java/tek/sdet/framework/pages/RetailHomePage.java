package tek.sdet.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup {
	

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
//		We are implementing page factory class to initialize the UI elements
//		using initElements method of the page factory class
	}

	
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id="hamburgerBtn")
	public WebElement allIcon;
	
	@FindBy(xpath="//a[@id='signinLink']")
	public WebElement signInIcon;
	
	@FindBy(id="searchBtn")
	public WebElement searchButton;
	
	@FindBy(id="cartBtn")
	public WebElement cartButton;

	@FindBy(id = "searchInput")
	public WebElement searchBar;
	
	@FindBy(xpath="//img[@alt='Trading Card Binder for Pokemon']")
	public WebElement pokemonProduct;
	
	@FindBy(xpath ="//a[@id='accountLink']")
	public WebElement accountBtn;
	
	@FindBy(xpath="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarElement;
	
	
	
}
