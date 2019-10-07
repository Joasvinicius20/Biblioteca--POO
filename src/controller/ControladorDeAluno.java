package controller;

import java.util.ArrayList;

import model.Aluno;
import model.Endereco;
import model.Instrutor;

public class ControladorDeAluno {
	//tipo de dados para listas
	private ArrayList<Aluno> alunos;

	public ControladorDeAluno() {
		alunos = new ArrayList<>();
	}

	public void adcionarAluno(Aluno aluno){
		alunos.add(aluno);
		System.out.println(aluno.getNome() + " Cadastrado(a) com sucesso!");

	}

	public void buscaraluno(String cpf) {

		for(int i = 0; i < alunos.size(); i++ ) {
			if(alunos.get(i).getCpf().equals(cpf)) {
				System.out.println(alunos.get(i).getNome() + " numero da matrícula: " + alunos.get(i).getNumMatricula());
			}
		}

	}

	public void listarAluno(){
		System.out.println("Lista de Alunos cadastrados: ");
		if(alunos.size() == 0) {
			System.out.println("Nenhum Alunos foi cadastrado.");
		}else {
		for (Aluno aluno : alunos) {
			System.out.println("Nome: " + aluno.getNome());
		} 
			
	}
}

	
	public void atualizarCadastroAluno(String antigoNome,String novoNome, String email,String celular,Endereco endereco) {
		for(int i = 0; i < alunos.size(); i++) {
			if(alunos.get(i).getNome().equals(antigoNome)) {
				alunos.get(i).setNome(novoNome);
				alunos.get(i).setEmail(email);
				alunos.get(i).setCelular(celular);
				alunos.get(i).setEndereco(endereco);
			}
			
		}

	}

	public void deletarAluno(String cpf) {
		for(int i = 0; i < alunos.size(); i++ ) {
			if(alunos.get(i).getCpf().equals(cpf)) {
				alunos.remove(i);
				System.out.println("O Aluno foi removido");
			}else {
				System.out.println("Aluno não encontrado");
			}
		}

	}


}
