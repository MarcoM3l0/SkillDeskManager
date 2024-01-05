package controller;

import java.util.ArrayList;

import model.Pessoa;

public class MainController {

	ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
	
	private boolean retorno = true;
	private static int altoIncremente = 0;
	
	public boolean execucao(int i) {
		
		switch(i) {
			case 1:
				incluirCliente();
				break;
			case 2:
				incluirAtendente();
				break;
			case 3:
				incluirTecnico();
				break;
			case 4:
				listarPessoas();
				break;
			case 5:
				excluirPessoa();
				break;
			case 9:
				retorno = false;
				break;
			default:
				System.out.println("Digite uma opção válida!");
				break;
		}
		
		return retorno;
	}


	private void incluirCliente() {
		
		IncluirCliente cliente = new IncluirCliente();
		altoIncremente = cliente.incluirCliente(pessoa, altoIncremente);
		
	}

	private void incluirAtendente() {

		IncluirAtendente atendente = new IncluirAtendente();
		altoIncremente = atendente.incluirAtendente(pessoa, altoIncremente);
		
	}

	private void incluirTecnico() {

		IncluirTecnico tecnico = new IncluirTecnico();
		altoIncremente = tecnico.incluirTecnico(pessoa, altoIncremente);
		
	}
	
	private void listarPessoas() {
		
		ListarPessoas listar = new ListarPessoas();
		listar.listarPessoas(pessoa);
		
	}

	private void excluirPessoa() {

		ExcluirPessoa excluir = new ExcluirPessoa();
		excluir.excluirPessoa(pessoa);
		
	}
	
}
