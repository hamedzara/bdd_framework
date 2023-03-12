package tek.sdet.framework.utilities;

import net.datafaker.Faker;

public class DataGeneratorUtility {

	public static String data(String input) {
		Faker faker = new Faker();
		
		String output = "";
		
		
		
//		Personal Information
		if(input.equals("firstName")) {
			output = faker.name().firstName();
		}
		else if(input.equals("lastName")) {
			output = faker.name().lastName();
		}
		else if(input.equals("fullName")) {
			output = faker.name().fullName(); 
		}
		else if(input.equals("email")) {
			output = faker.expression("#{letterify '???????@tekschool.us'}");
		}
		else if(input.equals("phoneNumber")) {
			output = faker.phoneNumber().cellPhone();
		}
		
		
	
		
		
//		Address Information
		else if(input.equals("address")) {
			output = faker.address().streetAddress();
		}
		else if(input.equals("city")) {
			output = faker.address().city();
		}
		else if(input.equals("state")) {
			output = faker.address().state();
		}
		else if(input.equals("zipcode")) {
			output = faker.address().zipCode();
		}
		
		
//		Banking Information
		else if(input.equals("nameOnCard")) {
			output = faker.name().fullName();
		}
		else if(input.equals("cardNumber")) {
			output = faker.expression("#{numerify '################'}");
		}
		else if(input.equals("expirationMinth")) {
			output = faker.expression("#{numerify '#'}");
		}
		else if(input.equals("expirationYear")) {
			output = faker.expression("#{numerify '20##'}");
		}
		else if(input.equals("securityCode")) {
			output = faker.expression("#{numerify '###'}");
		}
		
		
		
		
//		other
		else {
			output = faker.expression("#{numerify '################'}");
		}
		
		
		return output;
		
		
	}
}
