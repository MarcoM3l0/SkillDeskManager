package model;

import java.time.LocalDate;

public class Emprestimo extends Livro {
	
	private String codigoUser;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;
	private String statusEmprestimo;
	
	
	public Emprestimo(String codigo, String titulo, String codigoUser, LocalDate dataEmprestimo,
			LocalDate dataDevolucao, String statusEmprestimo) {
		super(codigo, titulo);
		setCodigoUser(codigoUser);
		setDataEmprestimo(dataEmprestimo);
		setDataDevolucao(dataDevolucao);
		setStatusEmprestimo(statusEmprestimo);
	}
	

	public String getCodigoUser() {
		return codigoUser;
	}

	public void setCodigoUser(String codigoUser) {
		this.codigoUser = codigoUser;
	}

	public LocalDate  getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(LocalDate  dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public LocalDate  getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public String getStatusEmprestimo() {
		return statusEmprestimo;
	}


	public void setStatusEmprestimo(String statusEmprestimo) {
		this.statusEmprestimo = statusEmprestimo;
	}


	@Override
	public boolean equals(Object obj) {
		boolean retorno = false;
		
		if(obj != null && obj instanceof Emprestimo) {
			Emprestimo livro = (Emprestimo) obj;
			
			if(getCodigo() == livro.getCodigo())
				retorno = true;
		}
		
		return retorno;
	}
	
}
