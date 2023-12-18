package model;

public class Usuario {
	private String codigo;  
	private String nome;
	private String tipoUsuario;
	private int tempoEmprestimo;
	private int limiteEmprestimos;
	private boolean livroAtraso;
	
	public Usuario(String codigo, String nome, String tipoUsuario, boolean livroAtraso) {
		setCodigo(codigo);
		setNome(nome);
		setTipoUsuario(tipoUsuario);
		
		switch (tipoUsuario) {
			case "alu":
				setTempoEmprestimo(5);
				setLimiteEmprestimos(3);
				break;
			case "pos":
				setTempoEmprestimo(10);
				setLimiteEmprestimos(4);
				break;
			case "tec":
				setTempoEmprestimo(14);
				setLimiteEmprestimos(5);
				break;
			case "pro":
				setTempoEmprestimo(21);
				setLimiteEmprestimos(Integer.MAX_VALUE);
				break;
			default:
                throw new IllegalArgumentException("Tipo de usuário inválido!");
		}
		setLivroAtraso(livroAtraso);
	}
	
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public int getTempoEmprestimo() {
		return tempoEmprestimo;
	}

	public void setTempoEmprestimo(int tempoEmprestimo) {
		this.tempoEmprestimo = tempoEmprestimo;
	}

	public int getLimiteEmprestimos() {
		return limiteEmprestimos;
	}

	public void setLimiteEmprestimos(int limiteEmprestimos) {
		this.limiteEmprestimos = limiteEmprestimos;
	}
	
	public boolean getLivroAtraso() {
		return livroAtraso;
	}


	public void setLivroAtraso(boolean livroAtraso) {
		this.livroAtraso = livroAtraso;
	}


	public boolean equals(Object obj) {
		boolean retorno = false;
		
		if(obj != null && obj instanceof Usuario) {
			Usuario user = (Usuario) obj;
			
			if(getCodigo() == user.getCodigo())
				retorno = true;
			
		}
		
		return retorno;
	}
	
	
	
}
