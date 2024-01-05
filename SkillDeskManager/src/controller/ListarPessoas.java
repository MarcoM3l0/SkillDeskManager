package controller;

import java.util.ArrayList;

import model.Pessoa;

class ListarPessoas {

	public void listarPessoas(ArrayList<Pessoa> pessoa) {
		
		for(Pessoa pessoas: pessoa) {
			System.out.println(pessoas + "\n");
		}
	}

}
