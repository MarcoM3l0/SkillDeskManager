package controller;

import java.util.ArrayList;

import model.Emprestimo;
import model.Usuario;

class AlterarUsuario {

	void alterarUsuario(String[] comando, ArrayList<Usuario> user, ArrayList<Emprestimo> emprestimoAtual, ArrayList<Emprestimo> emprestimoHistorico) {
		String codigoAtualUsuario = comando[1];
		String codigoNovoUsuario = comando[3];
		String tipoUsuario = comando[4];
		String nome = comando[5];
		
		int quantidadeEmprestimos = 0;
		
		try {
			
			for(Usuario usuario : user) {
				if(usuario.getCodigo().equals(codigoAtualUsuario)) {
					
					usuario.setCodigo(codigoNovoUsuario);
					usuario.setNome(nome);
					usuario.setTipoUsuario(tipoUsuario);
					
					switch (tipoUsuario) {
						case "alu":
							usuario.setTempoEmprestimo(5);
							usuario.setLimiteEmprestimos(3);
							break;
						case "pos":
							usuario.setTempoEmprestimo(10);
							usuario.setLimiteEmprestimos(4);
							break;
						case "tec":
							usuario.setTempoEmprestimo(14);
							usuario.setLimiteEmprestimos(5);
							break;
						case "pro":
							usuario.setTempoEmprestimo(21);
							usuario.setLimiteEmprestimos(Integer.MAX_VALUE);
							break;
						default:
			                throw new IllegalArgumentException("Tipo de usuário inválido!");
					}
					
					for(Emprestimo empAtual : emprestimoAtual) {
						if(empAtual.getCodigoUser().equals(codigoAtualUsuario)) {
							empAtual.setCodigoUser(codigoNovoUsuario);
							quantidadeEmprestimos++;
						}
					}
					
					quantidadeEmprestimos = usuario.getLimiteEmprestimos() - quantidadeEmprestimos;
					
					if(quantidadeEmprestimos < 0)
						usuario.setLimiteEmprestimos(0);
					else
						usuario.setLimiteEmprestimos(quantidadeEmprestimos);
					
					for(Emprestimo empHistorico : emprestimoHistorico) {
						if(empHistorico.getCodigoUser().equals(codigoAtualUsuario)) {
							empHistorico.setCodigoUser(codigoNovoUsuario);
							
						}
					}
					
					System.out.println("\nUsuário cadastrado com sucesso!");
					return;
					
				}
				System.err.println("\nUsuário " + codigoAtualUsuario + " não encontrado!");
				return;
			}
			
		} catch (Exception  e){
			System.err.println("\nErro ao cadastra: " + e);
		}
	}
	
}
