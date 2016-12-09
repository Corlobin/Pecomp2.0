import br.ifes.pecomp.bean.LoginBean;
import br.ifes.pecomp.entity.Pessoa;
import br.ifes.pecomp.repository.PessoaRepositoryImpl;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;
public class LoginBDD {
	
	private LoginBean loginBean;
	Pessoa pessoa;
	PessoaRepositoryImpl repository;
	public LoginBDD(){
		loginBean = new LoginBean();
		repository = new PessoaRepositoryImpl();
		pessoa = new Pessoa();
		pessoa.setNome("brasil");
		pessoa.setEmail("anribrasil@gmail.com");
		pessoa.setSenha("123");
		repository.inserir(pessoa);
	}
	
	@Given("^Um usuario anonimo$")
	public void umUsuarioAnonimo() throws Throwable {
	}

	@When("^Eu envio dados validos$")
	public void euEnvioDadosValidos() throws Throwable {
		loginBean.setEmail(pessoa.getEmail());
		loginBean.setSenha(pessoa.getSenha());
		Pessoa retorno = repository.findByUsuarioAndSenha(pessoa.getEmail(), pessoa.getSenha());
		assertThat(retorno.getId(), is(pessoa.getId()));
	}
	
	
}
