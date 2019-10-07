package model;

import java.util.Random;

public class Aluno extends Pessoa{

	private int numMatricula;
	Random random = new Random();



	public Aluno(String nome,String cpf) {
		super(nome,cpf);
		this.numMatricula = random.nextInt(1000000);
	}

	public Aluno(String nome,String cpf,String email,String sexo,String celular,Endereco endereco) {
		super(nome,cpf,email,sexo,celular,endereco);
		this.numMatricula = random.nextInt(10000);
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public String getNome() {
		return "Aluno: " + super.getNome();
	}




}
