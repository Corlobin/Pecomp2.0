Feature: Eu como usuario quero fazer o login para ter acesso aos conte�dos

Scenario: Acessar o formulario de login com dados validos
	Given Um usuario anonimo
	When Eu envio dados validos
	Then Eu sou redirecionado para pagina inicial do site
	And Meu nome aparece no box do usuario enquanto estou logado