package view;

import java.util.Scanner;

import controller.MainController;

public class Main {

	public static void main(String[] args) {
		
		MainController main = new MainController();
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			do {
				
				exibirMenu();
				
				if(scanner.hasNextInt()) {
					
					int opcao = scanner.nextInt();
					
					if(!main.execucao(opcao))
						break;
					
				}else {
					
					System.err.println("Digite uma opção válida!");
					scanner.next();
				}
				
				
			}while(true);
			
		}catch(Exception e) {
			System.err.println("aconteceu algum erro. Erro: " + e);
		}
		
		System.out.println("\nSaindo do programa. Obrigado!");
		
	}
	
	private static void exibirMenu() {
		System.out.println("-------------------------------------");
		System.out.println("|  Digite a sua opção:              |\n|    1 – Incluir uma Cliente        |\n|    2 – Incluir um Atendente       |\n|    3 – Incluir um Técnico         |\n|    4 – Listar pessoas cadastradas |\n|    5 - Excluir pessoa             |\n|    6 - Alterar pessoa             |\n|    9 - Sair                       |");
		System.out.println("-------------------------------------");
	}

}
