package model;

import controller.Acervo;

public interface iFuncionalidades {
	
	public void cadastroUsuario(String[] comando); // Realiza o cadastro de um usuário no sistema.
	public void excluirUsuario(String comando); // Realiza a exclusão  de um usuário no sistema.
	public void alterarUsuario(String[] comando); // Realiza a alteração de um usuário no sistema.
	public void emprestimoLivro(String[] comando, Acervo acervo); // Realiza o processo de empréstimo de livros.
	public void devolucaoLivro(String[] comando, Acervo acervo); // Realiza o processo de devolução de livros.
	
}
