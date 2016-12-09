import br.ifes.pecomp.bean.LoginBean;
import br.ifes.pecomp.entity.Pessoa;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ApostilaBDD {
	
	private LoginBean loginBean = new LoginBean();
	@Given("^Eu estou logado no site$")
	public void euEstouLogadoNoSite() throws Throwable {
		
		
	}

	@When("^Eu clico no item de Menu Conteudos - Apostilas$")
	public void euClicoNoItemDeMenuConteudosApostilas() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^Eu sou redirecionado para pagina de Apostilas$")
	public void euSouRedirecionadoParaPaginaDeApostilas() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Given("^Eu estou na pagina de Apostilas$")
	public void euEstouNaPaginaDeApostilas() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
		
}