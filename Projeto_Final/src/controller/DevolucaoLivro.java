package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

import model.Emprestimo;
import model.Livro;
import model.Usuario;

class DevolucaoLivro {
	
	void devolucaoLivro(String[] comando, Acervo acervo, ArrayList<Usuario> user, ArrayList<Emprestimo> emprestimoAtual, ArrayList<Emprestimo> emprestimoHistorico) {

		for(Usuario usuario : user) {
			String codigoUsuario = comando[1];
			
			if(usuario.getCodigo().equals(codigoUsuario)) {
				
				String codigoLivro = comando[2];
				
				for(Emprestimo emp : emprestimoAtual) {
					if(emp.getCodigo().equals(codigoLivro)) {
						
						LocalDate dataDevolucao = LocalDate.now();
						
						
						Emprestimo devolucao = new Emprestimo(emp.getCodigo(), emp.getTitulo(), usuario.getCodigo(), emp.getDataEmprestimo(), dataDevolucao, "Finalizado");
						emprestimoHistorico.add(devolucao);
						
						Iterator<Emprestimo> iterator = emprestimoAtual.iterator();
						
						while (iterator.hasNext()) {
				            Emprestimo emprestimo = iterator.next();
				            if (emprestimo.getCodigo().equals(codigoLivro)) {
				                iterator.remove(); 
				            }
				        }
						
						for(Livro livro: acervo.getLivro()) {
							if(livro.getCodigo().equals(codigoLivro)) {
								livro.setQuantidade(livro.getQuantidade() + 1);
								if(livro.getStatus() == "Indisponível")
									livro.setStatus("Disponível");
								
								System.out.println("\nLivro devolvido!!\n" + "Para: " + usuario.getNome() + "\nLivro: " + livro.getTitulo());
								return;
							}
						}
						
						
						
					}
				}
				System.out.println("\nNão há empréstimo em aberto do livro " + codigoLivro + ", para o usuário " + usuario.getCodigo());
				return;
			}
			
		}
		System.err.println("\nUsuário não encontrado!");
	}
}
