package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Cliente;
import model.Pessoa;

class IncluirCliente {
	
	private Scanner scanner;

	public int incluirCliente(ArrayList<Pessoa> pessoa, int altoIncremente) {
		
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
		
		System.out.println("--Código do plano de atendimento--\n|    1 - service desk local      |\n|    2 - service desk virtual    |\n----------------------------------");
		System.out.print("Digite: ");
		int codPlaAten = scanner.nextInt();

		System.out.print("Como conheceu a empresa: ");
		String comoConheceoEmpresa = scanner.next();
		
		Cliente cliente = new Cliente(codPessoa, nomeCompleto, endereco, email, telefone, codPlaAten, comoConheceoEmpresa);
		
		pessoa.add(cliente);
		
		System.out.println("\nCliente cadastrado com sucesso!\n");
		
		return codPessoa;
	
	}

}
