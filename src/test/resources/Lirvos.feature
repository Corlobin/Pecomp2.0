Feature: Eu como usu�rio quero ter acesso a livros no site e acess�-los online para leitura do conte�do
	
Scenario: Usuario acessa pagina de Conteudos de Livros navegando pelo menu 
	Given Eu estou logado no site
	When Eu clico no item de Menu Conteudos - Livros
	Then Eu sou redirecionado para pagina de Livros
