package model;

public final class Atendente extends Pessoa{
	
	private int areaAtendSuporte;
	private String servAtendimento;
	
	
	public Atendente(int codPessoa, String nomeCompleto, String endereco, String email, String telefone,
			int areaAtendSuporte, String servAtendimento) {
		super(codPessoa, nomeCompleto, endereco, email, telefone);
		this.areaAtendSuporte = areaAtendSuporte;
		this.servAtendimento = servAtendimento;
	}
	
	
	public int getAreaAtendSuporte() {
		return areaAtendSuporte;
	}
	public void setAreaAtendSuporte(int areaAtendSuporte) {
		this.areaAtendSuporte = areaAtendSuporte;
	}
	public String getServAtendimento() {
		return servAtendimento;
	}
	public void setServAtendimento(String servAtendimento) {
		this.servAtendimento = servAtendimento;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nServiço de atendimento: " + getServAtendimento();
	}
}
