package controller;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import model.Emprestimo;
import model.Livro;
import model.Usuario;
import model.iConsulta;
import model.iFuncionalidades;


public class Main implements iFuncionalidades, iConsulta {
	
	ArrayList<Usuario> user = new ArrayList<Usuario>();
	ArrayList<Emprestimo> emprestimoAtual = new ArrayList<Emprestimo>();
	ArrayList<Emprestimo> emprestimoHistorico = new ArrayList<Emprestimo>();
	
	
	public boolean execucao(String comandoUsuario, Acervo acervo) {
		
		boolean retorno = true;
		
		String[] comando = comandoUsuario.split("\\|");
		
		switch (comando[0]) {
		
			case "usu":
				if(Arrays.asList(comando).contains("add"))
					cadastroUsuario(comando);
				
				else if(Arrays.asList(comando).contains("alt"))
					alterarUsuario(comando);
				
				else if(Arrays.asList(comando).contains("exc"))
					excluirUsuario(comando[2]);
				
				else
					usuarioDetalhada(comando[1]);
				break;
				
				
			case "emp":
				if(comando.length == 3)
					emprestimoLivro(comando, acervo);
				else if(comando.length < 3)
					System.err.println("Erro: Está faltando dados! ");
				else
					System.err.println("Erro: Tem dados demais. ");
				break;
				
				
			case "dev":
				if(comando.length == 3)
					devolucaoLivro(comando, acervo);
				else if(comando.length < 3)
					System.err.println("Erro: Está faltando dados! ");
				else
					System.err.println("Erro: Tem dados demais. ");
				break;
				
				
			case "liv":
				if(comando.length == 2) {
					
					switch (comando[1]) {
						case "*":
							todosLivros(acervo);
							break;
						default:
							livroDetalhada(comando[1], acervo);
							break;
					}
				}
				else if(comando.length < 3)
					System.err.println("Erro: Está faltando dados! ");
				else
					System.err.println("Erro: Tem dados demais. ");
				break;
				
				
			case "sai":
				retorno = false;
				break;
		}
		
		return retorno;
	}


	public void cadastroUsuario(String[] comando) {
		
		CadastroUsuario cadastro = new CadastroUsuario();
		cadastro.cadastroUsuario(comando, user);
		
	}

	@Override
	public void alterarUsuario(String[] comando) {

		AlterarUsuario alterar = new AlterarUsuario();
		alterar.alterarUsuario(comando, user, emprestimoAtual, emprestimoHistorico);
		
	}
	
	@Override
	public void excluirUsuario(String comando) {
		
		ExcluirUsuario excluir = new ExcluirUsuario();
		excluir.excluirUsuario(comando, user, emprestimoAtual, emprestimoHistorico);
		
	}


	@Override
	public void emprestimoLivro(String[] comando, Acervo acervo) {
		
		EmprestimoLivro emprestimo = new EmprestimoLivro();
		emprestimo.emprestimoLivro(comando, acervo, user, emprestimoAtual);
		
	}

	@Override
	public void devolucaoLivro(String[] comando, Acervo acervo) {
		
		DevolucaoLivro devolucao = new DevolucaoLivro();
		devolucao.devolucaoLivro(comando, acervo, user, emprestimoAtual, emprestimoHistorico);
		
	}
	
	@Override
	public void todosLivros(Acervo acervo) {
		
		System.out.println("\nConsulta de todos os livros cadastrados:");
		for(Livro livros : acervo.getLivro()) {
			System.out.println(livros);
		}
	}

	@Override
	public void livroDetalhada(String codigoLivro, Acervo acervo) {
		
		for(Livro livro : acervo.getLivro()) {
			if(livro.getCodigo().equals(codigoLivro)) {
				System.out.println(livro);
				return;
			}
			
		}
		System.out.println("\nLivro não encontrado!");
		
	}

	@Override
	public void usuarioDetalhada(String codigo) {
		
		UsuarioDetalhada usuario = new UsuarioDetalhada();
		usuario.usuarioDetalhada(codigo, user, emprestimoAtual, emprestimoHistorico);
		
	}
	
	public void VerificarDataEmprestimo() {
		
		LocalDate dataAtual = LocalDate.now();
		
		if(emprestimoAtual.size() > 0) {
			
			for(Usuario usuario : user) {
				
				for(Emprestimo emp : emprestimoAtual) {
					if(emp.getDataDevolucao().isBefore(dataAtual)) {
						
						usuario.setLivroAtraso(true);
						
					}
				}
			}
		}
	}
	
} 
