package model;

public class Livro {
	private String codigo;
    private String titulo;
    private String editora;
	private String autores;
    private String edicao;
    private String anoPublicacao;
    private int quantidade;
	private String status;
    

	public Livro(String codigo, String titulo, String editora, String autores, String edicao, String anoPublicacao,
			int quantidade, String status) {
		setCodigo(codigo);
		setTitulo(titulo);
		setEditora(editora);
		setAutores(autores);
		setEdicao(edicao);
		setAnoPublicacao(anoPublicacao);
		setQuantidade(quantidade);
		setStatus(status);
	}
	

	public Livro(String codigo, String titulo) {
		setCodigo(codigo);
		setTitulo(titulo);
	}




	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutores() {
		return autores;
	}
	public void setAutores(String autores) {
		this.autores = autores;
	}
	public String getEdicao() {
		return edicao;
	}
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	public String getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(String anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "\nTítulo = " + titulo + "\nCódigo = " + codigo + "\nEditora = " + editora + "\nAutores = " + autores
				+ "\nEdição = " + edicao + "\nAnoPublicacao= " + anoPublicacao + "\nDisponibilidade = " + status;
	}

	
	
}
