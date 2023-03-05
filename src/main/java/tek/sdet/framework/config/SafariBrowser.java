package tek.sdet.framework.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SafariBrowser implements Browser {

	public WebDriver openBrowser(String url) {
		WebDriverManager.safaridriver().setup();
		WebDriver driver = new SafariDriver();
		driver.get(url);
		return driver;
	}

}
