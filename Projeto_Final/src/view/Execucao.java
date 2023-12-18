package view;

import java.util.Scanner;

import controller.Acervo;
import controller.Main;


public class Execucao {
	
	private static Acervo acervo;

	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			Main executar = new Main();
			acervo = new Acervo();
			
			if (acervo != null) {
			    acervo.preencher();
			    
			    do {
					
					exibirMenu();
					
					executar.VerificarDataEmprestimo();
					
					if(!executar.execucao(scanner.nextLine(), acervo))
						break;
					
				}while(true);
			    
			} else {
			    System.out.println("A instância de Acervo está nula.");
			}
		}
		System.out.println("\nSaindo do sistemas Biblioteca. Até logo! :D");
	}
	
	private static void exibirMenu() {
        System.out.println("\n================================= Menu de Opções =================================");
        System.out.println(" Cadastrar novo usuário - usu|código do usuário|add|tipo usuário|nome");
        System.out.println(" Alterar usuário        - usu|código atual ''  |alt|código novo|tipo usuário|nome");
        System.out.println(" Excluir usuário        - usu|exc|código do usuário");
        System.out.println(" Realizar empréstimo    - emp|código do usuário|código do livro");
        System.out.println(" Realizar devolução     - dev|código do usuário|código do livro");
        System.out.println(" Consultar              - liv|*, liv|código do livro, usu|código do usuário");
        System.out.println(" Sair do programa       - sai");
    }

}
