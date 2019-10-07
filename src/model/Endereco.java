package model;

public class Endereco {

	private String rua;
	private String cep;
	private int numero;
	private String complemento;
	
	public Endereco(String rua,String cep,int numero,String complemento) {
		this.rua = rua;
		this.cep = cep;
		this.numero = numero;
		this.complemento = complemento;
	}

	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


}
