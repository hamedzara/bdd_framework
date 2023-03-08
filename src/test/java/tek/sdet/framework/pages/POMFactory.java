package tek.sdet.framework.pages;

import tek.sdet.framework.base.BaseSetup;

public class POMFactory extends BaseSetup {
	
//	Every time we call on POMFactory in other classes, we initialize all our classes here in POMFactory.
//	thats the POMFactory job, to initialize our classes, when we create objects of it in other classes.
//	To encapsulate access to page object models
//	helps you to prevent from creating multiple objects of these classes
	
//	Declaring elements	
	private RetailHomePage homePage;
	private RetailSignInPage signInPage;
	private RetailAccountPage accountPage;
	private RetailOrderPage orderPage;
	
//	Initializing the elements in the constructors
//	default constructor
	public POMFactory(){
		this.homePage = new RetailHomePage();
		this.signInPage = new RetailSignInPage();
		this.accountPage = new RetailAccountPage();
		this.orderPage = new RetailOrderPage();
		
	}
	
	
	
	
//	Other methods
//	that returns object of our class.
	public RetailHomePage homePage() {
		return this.homePage;
	}
	
	public RetailSignInPage signInPage() {
		return this.signInPage;
	}
	
	public RetailAccountPage accountPage() {
		return this.accountPage;
	}
	
	public RetailOrderPage orderPage() {
		return this.orderPage;
	}

}
