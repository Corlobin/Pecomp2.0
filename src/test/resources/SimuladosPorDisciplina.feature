
Feature: Eu como usu�rio quero realizar simulados por disciplina no site para melhorar o meu desempenho em determinada mat�ria
	
Scenario: Usuario acessa pagina de Simulados agrupados por disciplina navegando pelo menu 
	Given Eu estou logado no site
	When Eu clico no item de Menu Simulado - Por disciplina
	Then Eu sou redirecionado para pagina de simulados agrupados por disciplina