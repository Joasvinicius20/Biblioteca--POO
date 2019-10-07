package model;

public abstract class Pessoa {

	private String nome;
	private String cpf;
	private String email;
	private String sexo;
	private String celular;
	private Endereco endereco;

	public Pessoa(String nome,String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public Pessoa(String nome,String cpf,String email,String sexo,String celular,Endereco endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.sexo = sexo;
		this.celular = celular;
		this.endereco = endereco;  // agregação
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getSexo() {
		return sexo;
	}


}
