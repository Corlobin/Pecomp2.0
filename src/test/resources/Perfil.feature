Feature: Eu como usu�rio quero acessar o sistema para manter os meus dados atualizados

Scenario: Usuario deseja abrir seu box de opcoes de usuario
	Given Eu estou logado no site
	When Eu clico em minha foto de perfil
	Then Um box com opcoes para o usuario aparece	