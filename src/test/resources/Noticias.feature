Feature: Eu como usu�rio quero ter acesso a noticias relacionadas a area de computacao
	
Scenario: Usuario acessa pagina de noticias navegando pelo menu 
	Given Eu estou logado no site
	When Eu clico no item de Menu Inicio
	Then Eu sou redirecionado para pagina de noticias