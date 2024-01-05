package model;

public class Pessoa {
	
	private int codPessoa;
	private String nomeCompleto;
	private String endereco;
	private String email;
	private String telefone;
	
	
	public Pessoa(int codPessoa, String nomeCompleto, String endereco, String email, String telefone) {
		setCodPessoa(codPessoa);
		setNomeCompleto(nomeCompleto);
		setEndereco(endereco);
		setEmail(email);
		setTelefone(telefone);
	}
	
	public int getCodPessoa() {
		return codPessoa;
	}
	public void setCodPessoa(int codPessoa) {
		this.codPessoa = codPessoa;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public boolean equals(Object obj) {
		boolean retorno = false;
		
		if(obj != null && obj instanceof Pessoa ) {
			
			Pessoa pessoa = (Pessoa) obj;
			
			if(getCodPessoa() == pessoa.getCodPessoa())
				retorno = true;
		}
		
		return retorno;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Código pessoa: "+ getCodPessoa() + "\nNome:" + getNomeCompleto() + "\nEndereço:" 
				+ getEndereco() +"\nEmail:" + getEmail() +"\nTelefone:" + getTelefone();
	}
	
	
	
}
