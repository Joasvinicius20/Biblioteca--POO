package controller;

import java.util.ArrayList;

import model.Endereco;
import model.Instrutor;

public class ControladorDeInstrutor {


	private ArrayList<Instrutor> instrutores;

	public ControladorDeInstrutor() {
		instrutores = new ArrayList<>();
	}

	public void adcionarInstrutor(Instrutor instrutor){
		instrutores.add(instrutor);
		System.out.println(instrutor.getNome() + " Cadastrado(a) com sucesso!");
	}

	public void buscarInstrutor(String cpf) {
		
		for(int i = 0; i < instrutores.size(); i++ ) {
			if(instrutores.get(i).getCpf().equals(cpf)) {
				System.out.println("nome:" + instrutores.get(i).getNome());
			}
		}
	}
	public void listarInstrutor(){
		System.out.println("Lista de Instrutores cadastrados: ");
		if(instrutores.size() == 0) {
			System.out.println("Nenhum instrutor foi cadastrado.");
		}else {
		for (Instrutor instrutor : instrutores) {
			System.out.println("Nome: " + instrutor.getNome());
		}
		}
	}

	public void atualizarCadastroInstrutor(String antigoNome,String novoNome, String email,String celular,Endereco endereco,String cargo,String cargaHoraria) {
		for(int i = 0; i < instrutores.size(); i++) {
			if(instrutores.get(i).getNome().equals(antigoNome)) {
				instrutores.get(i).setNome(novoNome);
				instrutores.get(i).setEmail(email);
				instrutores.get(i).setCelular(celular);
				instrutores.get(i).setEndereco(endereco);
				instrutores.get(i).setCargo(cargo);
				}
				
		}
		
		
	}

	public void deletarInstrutor(String cpf) {
		for(int i = 0; i < instrutores.size(); i++ ) {
			if(instrutores.get(i).getCpf().equals(cpf)) {
				instrutores.remove(i);
				System.out.println("O instrutor foi removido");
			}else {
				System.out.println("instrutor não encontrado");

			}
		}
	}

}
