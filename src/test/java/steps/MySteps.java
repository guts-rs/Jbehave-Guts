package steps;
import org.jbehave.core.annotations.*;
import static org.junit.Assert.*;
import pages.HomePage;
import pages.LoginPage;
import pages.Pages;
public class MySteps{
	private LoginPage login;
	private HomePage home;
	
	public MySteps(Pages pages) {
		login = pages.newLoginPage();
		home = pages.newHomePage();
	}
	@Then("devo visualizar minha home page")
	public void thenDevoVisualizarMinhaHomePage(){
		 //TODO 
	}
	@Then("devo estar logado no twitter")
	@Pending
	public void thenDevoEstarLogadoNoTwitter(){
		 assertEquals("GUTS-RS Dojo",home.getFullName());
	}
	@When("clicar em login")
	public void whenClicarEmLogin(){
		 login.entrar();
	}
	@Given("acessei a pagina de login do Twitter")
	public void givenAcesseiAPaginaDeLoginDoTwitter(){
		login.go();
	}
	@Given("inseri um usuário e senha validos")

	public void givenInseriUmUsuárioESenhaValidos(){
		 login.escreveUsername("gutsrsdojo");
		 login.escreveSenha("testingdojo");
	}
}