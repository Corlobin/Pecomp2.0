Feature: Eu como usu�rio quero ter acesso a videos no site e acess�-los online para entender melhor os conte�dos
	
Scenario: Usuario acessa pagina de Conteudos de Videos navegando pelo menu 
	Given Eu estou logado no site
	When Eu clico no item de Menu Conteudos - Videos
	Then Eu sou redirecionado para pagina de Videos
	