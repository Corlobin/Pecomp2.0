/** Copyright PECOMP to Antonio Ricardo Alexandre Brasil and Hanna Tatila de Sousa
*   All rights reserved
**/

package br.ifes.pecomp.test.login;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.internal.Locatable;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*
 * Eu entro no site
 * Eu quero logar
 * Eu coloco meu nome Antonio e minha idade 23
 * Eu sou direcionado para a pagina de login
 */

public class LoginStep {

	public static WebDriver driver;
	public String tituloLogin = "Sistema";
	public String tituloInicio= "Notícias";
	
	@Given("^Usuario entra no site$")
	public void usuarioEntraNoSite() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ricardo\\Documents\\Pecomp-master\\chromedriver.exe");
		driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://localhost:8080/Pecomp/index.jsf");
	}
	
	@When("^Usuario esta na pagina de login$")
	public void usuarioEstaNaPaginaDeLogin() throws Throwable {
		
		//Escrevendo no campo de email
		WebElement element = driver.findElement(By.name("formulario:email"));
		element.sendKeys("anribrasil@gmail.com");

		element = driver.findElement(By.name("formulario:senha"));
		element.sendKeys("123");

		assertThat(driver.getTitle(), is(tituloLogin));
		
		
	}

	@When("^clica no botao de Entrar$")
	public void clicaNoBotaoDeEntrar() throws Throwable {
		Locatable hoverItem = (Locatable) driver.findElement(By.name("formulario:entrar"));
		Mouse mouse = ((HasInputDevices) driver).getMouse();
		mouse.mouseMove(hoverItem.getCoordinates());
		mouse.click(hoverItem.getCoordinates());
		
		Thread.sleep(10000);
	}

	@Then("^Usuario redirecionado para pagina de noticias$")
	public void usuarioRedirecionadoParaPaginaDeNoticias() throws Throwable {
		assertThat(driver.getTitle(), is(tituloInicio));
	}

}
