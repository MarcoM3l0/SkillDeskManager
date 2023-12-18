package model;

import controller.Acervo;

public interface iConsulta {
	
	public void todosLivros(Acervo acervo); // Deve ser usado para recuperar as informações de todos os livros no sistema.
	public void livroDetalhada(String codigoLivro, Acervo acervo); // Obtém informações detalhadas de um livro conforme especificações.
	public void usuarioDetalhada(String codigoUsuario); // Obtém detalhes do usuário conforme especificações

}
