package controller;

import java.time.LocalDate;
import java.util.ArrayList;

import model.Emprestimo;
import model.Livro;
import model.Usuario;

class EmprestimoLivro {
	
	void emprestimoLivro(String[] comando, Acervo acervo, ArrayList<Usuario> user, ArrayList<Emprestimo> emprestimoAtual) {

		for(Usuario usuario : user) {
			String codigoUsuario = comando[1];
			
			if(usuario.getCodigo().equals(codigoUsuario)) {
				
				String codigoLivro = comando[2];
				
				for(Livro livro : acervo.getLivro()) {
					if(livro.getCodigo().equals(codigoLivro)) {
						
							
						if(livro.getQuantidade() > 0) {
							if(!usuario.getLivroAtraso()) {
								
								if(usuario.getLimiteEmprestimos() > 0) {
									
									if(emprestimoAtual != null && emprestimoAtual.size() > 0) {
										for(Emprestimo emp : emprestimoAtual) {
											
											if(emp.getCodigo().equals(codigoLivro) && emp.getCodigoUser().equals(codigoUsuario)) {
												System.out.println("Usuário já tem um exemplar desse lirvo.");
												return;
											}
										}
									}
									
									try {
										LocalDate  dataEmprestimo = LocalDate.now();
										LocalDate  dataDevolucao = dataEmprestimo.plusDays(usuario.getTempoEmprestimo());
										
										Emprestimo emprestar = new Emprestimo(livro.getCodigo(), livro.getTitulo(), usuario.getCodigo() , dataEmprestimo, dataDevolucao, "Curso");
										emprestimoAtual.add(emprestar);
										
										System.out.println("\nLivro emprestado!!\n" + "Para: " + usuario.getNome() + "\nLivro: " + livro.getTitulo());
										
										usuario.setLimiteEmprestimos(usuario.getLimiteEmprestimos() - 1);
										livro.setQuantidade(livro.getQuantidade() - 1);
										
										if(livro.getQuantidade() == 0) {
											livro.setStatus("Indisponível");
										}
										
										return;
										
									}catch(Exception e) {
										System.out.println("Erro!");
										return;
									}
									
								}
								System.err.println("\nUsuário já atingiu o limete máximo de emprestimos!");
								return;
							}
							System.err.println("\nUsuário está com pendências, atraso de livro. ");
							return;
						}
						System.err.println("\nNão há mais exemplares do livro " + livro.getCodigo());
						return;
					}
				}
				System.err.println("\ncodigo de livo '" + codigoLivro + "' não encontrado!");
				return;
			}
		}
		
		System.err.println("\nUsuário " + comando[1] + " não encontrado!");
	}
}
