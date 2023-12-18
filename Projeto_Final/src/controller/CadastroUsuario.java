package controller;

import java.util.ArrayList;

import model.Usuario;

class CadastroUsuario {

	void cadastroUsuario(String[] comando, ArrayList<Usuario> user) {
		try {
			
			if(user.size() > 0) {
				
				for(Usuario usuario : user) {
					if(usuario.getCodigo().equals(comando[1])) {
						System.out.println("Já tem usuário cadastrado no sistemas com esse código: " + usuario.getCodigo());
						return;
					}
				}
				
			}
			
			Usuario usuario = new Usuario(comando[1], comando[4], comando[3], false);
			
			user.add(usuario);
			System.out.println("\nUsuário cadastrado com sucesso!");
		} catch (Exception  e){
			System.err.println("\nErro ao cadastra: " + e);
		}
	}
	
}
