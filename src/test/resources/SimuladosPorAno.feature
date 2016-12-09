Feature: Eu como usu�rio quero realizar simulados por ano no site para avaliar o meu desempenho em uma prova espec�fica
	
Scenario: Usuario acessa pagina de Simulados agrupados por ano navegando pelo menu 
	Given Eu estou logado no site
	When Eu clico no item de Menu Simulado - Por ano
	Then Eu sou redirecionado para pagina de simulados agrupados por ano