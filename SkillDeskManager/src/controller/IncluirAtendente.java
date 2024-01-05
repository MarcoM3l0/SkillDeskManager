package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Atendente;
import model.Pessoa;

class IncluirAtendente {
	
	private Scanner scanner;

	public int incluirAtendente(ArrayList<Pessoa> pessoa, int altoIncremente) {
		
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
		
		System.out.println("\n--Área de atendimento e suporte--\n|    1 - hardware               |\n|    2 - software               |\n|    3 - hardware e software    |\n---------------------------------");
		System.out.print("Digite: ");
		int areaAtenSup = scanner.nextInt();

		System.out.print("serviços de atendimento ao cliente: ");
		String servAtendimento = scanner.next();
		
		Atendente atendente = new Atendente(codPessoa, nomeCompleto, endereco, email, telefone, areaAtenSup, servAtendimento);
		
		pessoa.add(atendente);
		
		System.out.println("\nAtendente cadastrado com sucesso!\n");
		
		return codPessoa;
		
	}
}
