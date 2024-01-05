package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Tecnico;
import model.Pessoa;

class IncluirTecnico {

	private Scanner scanner;

	public int incluirTecnico(ArrayList<Pessoa> pessoa, int altoIncremente) {
		
		scanner = new Scanner(System.in); 
			
		int codPessoa = altoIncremente + 1;
		
		System.out.println("Codigo de pessoa: " + codPessoa);
		
		System.out.print("Nome completo: ");
		String nomeCompleto = scanner.next();
		
		System.out.print("Endereço: ");
		String endereco = scanner.next();

		System.out.print("Email: ");
		String email = scanner.next();
		
		System.out.print("Telefone: ");
		String telefone = scanner.next();

		System.out.println("\n--Regime de contratação--\n|         1 - CLT       |\n|         2 - PJ        |\n-------------------------");
		System.out.print("Digite: ");
		int regimeContratacao = scanner.nextInt();

		System.out.print("Certificações: ");
		String certificacoes = scanner.next();
		
		Tecnico tecnico = new Tecnico(codPessoa, nomeCompleto, endereco, email, telefone, regimeContratacao, certificacoes);
		
		pessoa.add(tecnico);
		
		System.out.println("\nTécnico cadastrado com sucesso!\n");
		
		return codPessoa;
		
	}
	
}
