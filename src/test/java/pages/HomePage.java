package pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

public class HomePage extends FluentWebDriverPage{
	private By locatorBlocoNome = By.className("fullname");
	
	public HomePage(WebDriverProvider driverProvider){
		super(driverProvider);
	}
	public String getFullName (){
		return b(locatorBlocoNome).getText().toString();
	}
	
	
}
