package model;

// herança
public class Instrutor extends Pessoa {

	private String cargo;
	private String cargaHoraria;

	//sobrecarga
	public Instrutor(String nome,String cpf) {
		super(nome,cpf);
	}


	public Instrutor(String nome,String cpf,String email,String sexo,String celular,Endereco endereco,String cargo,String cargaHoraria) {
		super(nome,cpf,email,sexo,celular,endereco);// chamando construtor da classe pai
		this.cargo = cargo;
		this.cargaHoraria = cargaHoraria;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCargaHoraria() {
		return cargaHoraria;
	}

	public String getNome() {
		return "Instrutor: " + super.getNome();
	}
}