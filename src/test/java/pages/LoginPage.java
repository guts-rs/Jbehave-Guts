package pages;

import org.jbehave.web.selenium.FluentWebDriverPage;
import org.jbehave.web.selenium.WebDriverProvider;
import org.openqa.selenium.By;

public class LoginPage extends FluentWebDriverPage{
	By locatorUsername = By.id("signin-email");
	By locatorSenha = By.id("signin-password");
	By locatorBtnEntrar= By.xpath("(//button[@type='submit'])[3]");
	
	public LoginPage(WebDriverProvider driverProvider) {
		super(driverProvider);
	}
	public LoginPage go(){
		get("https://twitter.com/");
		return this;
	}

	public LoginPage escreveUsername(String user){
		input(locatorUsername).sendKeys(user);
		return this;
	}
	public LoginPage escreveSenha(String senha){
		input(locatorSenha).sendKeys(senha);
		return this;
	}
	public LoginPage entrar(){
		button(locatorBtnEntrar).click();
		return this;
	}

	
}
