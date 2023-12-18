package controller;

import java.util.ArrayList;
import java.util.Iterator;

import model.Emprestimo;
import model.Usuario;

class ExcluirUsuario {
	
	void excluirUsuario(String comando, ArrayList<Usuario> user, ArrayList<Emprestimo> emprestimoAtual, ArrayList<Emprestimo> emprestimoHistorico) {
		
		Iterator<Usuario> iteratorUsuario = user.iterator();
		Iterator<Emprestimo> iteratorAtual = emprestimoAtual.iterator();
		Iterator<Emprestimo> iteratorHistorico = emprestimoHistorico.iterator();
		
		if(user.size() > 0) {
			
			while(iteratorUsuario.hasNext()) {
				Usuario usuarioI = iteratorUsuario.next();
				if(usuarioI.getCodigo().equals(comando))
					iteratorUsuario.remove();
			}
					
			if(emprestimoAtual.size() > 0) {
						
				while(iteratorAtual.hasNext()) {
					
					Emprestimo empAtualI = iteratorAtual.next();
					if(empAtualI.getCodigoUser().equals(comando))
						iteratorAtual.remove();
					
				}
									
			}
					
			if(emprestimoHistorico.size() > 0) {
						
				while(iteratorAtual.hasNext()) {
					
					Emprestimo empHistoricoI = iteratorAtual.next();
					if(empHistoricoI.getCodigoUser().equals(comando))
						iteratorHistorico.remove();
					
				}
				
			}
				
			
			
			System.out.println("O usuário " + comando + " foi removido do sistema, \njuntamente com todos os registros de empréstimos associados.");
			
		}else
			System.out.println("\nNão há usuário cadastrado!");
	}
	
}
