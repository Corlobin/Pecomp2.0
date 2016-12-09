Feature: Eu como usu�rio quero ter acesso a apostilas no site e acess�-los online para leitura resumida do conte�do	
	
Scenario: Usuario acessa pagina de Conteudos de Apstilas navegando pelo menu 
	Given Eu estou logado no site
	When Eu clico no item de Menu Conteudos - Apostilas
	Then Eu sou redirecionado para pagina de Apostilas
