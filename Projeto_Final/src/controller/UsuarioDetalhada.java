package controller;

import java.util.ArrayList;

import model.Emprestimo;
import model.Usuario;

class UsuarioDetalhada {
	void usuarioDetalhada(String codigo, ArrayList<Usuario> user, ArrayList<Emprestimo> emprestimoAtual, ArrayList<Emprestimo> emprestimoHistorico) {

		for(Usuario usuario : user) {
			if(usuario.getCodigo().equals(codigo)) {
				
				System.out.println("\ncódigo do usuário: " + usuario.getCodigo() +
						  "\nNome: " + usuario.getNome() + 
						  "\nTipo de usuário: " + usuario.getTipoUsuario());
				
				if(emprestimoAtual.size() > 0) {
					System.out.println("\nLista de livros emprestados:");
					
					for(Emprestimo emp: emprestimoAtual) {
						if(emp.getCodigoUser().equals(codigo)) {
							System.out.println("Título: " + emp.getTitulo() + 
												"\nData do emprestimo: " + emp.getDataEmprestimo() + 
												"\nStatus do emprestimo: " + emp.getStatusEmprestimo() +
												"\nData para devolução: " + emp.getDataDevolucao());
							System.out.println("");
						}
					}
					
				}
				
				if(emprestimoHistorico.size() > 0) {
					System.out.println("\nHistorico de livros emprestados:");
					
					for(Emprestimo emp: emprestimoHistorico) {
						if(emp.getCodigoUser().equals(codigo)) {
							System.out.println("Título: " + emp.getTitulo() + 
												"\nData do emprestimo: " + emp.getDataEmprestimo() + 
												"\nStatus do emprestimo: " + emp.getStatusEmprestimo() +
												"\nData do devolução: " + emp.getDataDevolucao());
						}
					}
				}
				
				if(emprestimoAtual.size() == 0 && emprestimoHistorico.size() == 0)
					System.out.println("Não há empréstimos correntes, ou nunca fez um empréstimo.");
				
				return;
			}
		}
		System.err.println("Usuário " + codigo + " não encontrado!");
	}
}
