package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Pessoa;

class ExcluirPessoa {
	private Scanner scanner = new Scanner(System.in);
	
	public void excluirPessoa(ArrayList<Pessoa> pessoas) {
		System.out.print("Digite o código de pessoa: ");
		int codPessoa = scanner.nextInt();
		
		Pessoa pessoa = new Pessoa(codPessoa, null, null, null, null);
		
		boolean removeu = pessoas.remove(pessoa);
		
		if(removeu) {
			System.out.println("Removido com Sucesso!\n");
		}else {
			System.out.println("Não foi encontrado uma pessoa com esse códgio!\n");
		}
	}
	
}
