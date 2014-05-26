package pages;

import org.jbehave.web.selenium.WebDriverProvider;

public class Pages {
	private final WebDriverProvider webDriverProvider;
	
	public Pages(WebDriverProvider driverProvider) {
		this.webDriverProvider= driverProvider;
	}
	public LoginPage newLoginPage(){
		return new LoginPage(webDriverProvider);
	}
	public HomePage newHomePage(){
		return new HomePage(webDriverProvider);
	}

}
