package tek.sdet.framework.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeHeadless implements Browser {

	@Override
	public WebDriver openBrowser(String url) {
		WebDriverManager.chromedriver().setup();
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
//		WebDriver driver = new ChromeDriver(options);
		
		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(ops);
		driver.get(url);
		return driver;
	}

}
