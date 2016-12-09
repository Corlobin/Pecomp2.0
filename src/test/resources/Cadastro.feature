Feature: Eu como usu�rio quero ter um cadastro no site para poder ter acesso aos conte�dos
	
Scenario: Redirecionamento para pagina de cadastro
	Given Um usuario anonimo
	When Eu estou na pagina de login
	And clico no botao de Registrar
	Then Eu sou redirecionado para pagina de cadastro
