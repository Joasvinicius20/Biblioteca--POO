package execucao;

import java.util.Random;
import java.util.Scanner;
import controller.ControladorDeAluno;
import controller.ControladorDeInstrutor;
import model.Pessoa;
import model.Aluno;
import model.Endereco;
import model.Instrutor;

public class Principal {

	public static void main(String[] args) {

		//ler objeto tipo scanner serve para ler dados do teclado
		Scanner ler = new Scanner(System.in); 


		// variaveis locais
		int opcao;

		Aluno aluno;
		Endereco endereco;
		Pessoa pessoa;
		Instrutor instrutor;

		String antigoNome;
		String nome;
		String cpf;
		String email;
		String sexo;
		String celular;
		String rua;
		String cep;
		int numero;
		String complemento;
		String cargo;
		String cargaHoraria;
		int escolha;

		//Pessoa p = new Instrutor("a", "a"); // polimofismo de tipo uma super classe pode  instanciar uma sub class
		//Instrutor i = new Pessoa("a", "b");  // uma sub class não pode instanciar super class
		//objetos
		ControladorDeAluno controladorDeAluno = new ControladorDeAluno();
		ControladorDeInstrutor controladorDeInstrutor = new ControladorDeInstrutor();

		do {
			System.out.println(" ------------------------------------------------");
			System.out.println(" |             SEJA BEM VINDO!                  |");
			System.out.println(" |         FAÇA SEU CADASTRO AQUI!              |");
			System.out.println(" |                                              |");
			System.out.println(" |--------- 1.CADASTRO ALUNO	        --------|");
			System.out.println(" |--------- 2.CADASTRO INSTRUTOR        --------|");
			System.out.println(" |--------- 3.Buscar Cadastro pelo CPF  --------|");
			System.out.println(" |--------- 4.Deletar Cadastro          --------|");
			System.out.println(" |--------- 5.Atualizar Cadastro        --------|");
			System.out.println(" |--------- 6.Listar Cadastro           --------|");
			System.out.println(" |--------- 7.sair                      --------|");
			System.out.println(" |                                              |");
			System.out.println(" |------ Escolha a opção desejada acima --------|\n");
			opcao = ler.nextInt();
			ler.nextLine();

			switch (opcao) {
			case 1:

				System.out.println("Digite seu nome:");
				nome = ler.nextLine();
				System.out.println("Digite seu cpf:");
				cpf = ler.nextLine();
				System.out.println("Digite seu email:");
				email = ler.nextLine();
				System.out.println("Digite seu sexo:");
				sexo = ler.nextLine();
				System.out.println("Digite seu celular:");
				celular = ler.nextLine();
				System.out.println("Digite sua rua:");
				rua = ler.nextLine();
				System.out.println("Digite o cep:");
				cep = ler.nextLine();
				System.out.println("Digite o numero:");
				numero = ler.nextInt();
				ler.nextLine();
				System.out.println("Digite o complemento:");
				complemento = ler.nextLine();

				endereco = new Endereco(rua,cep,numero,complemento);
				aluno = new Aluno(nome, cpf, email, sexo, celular, endereco);
				controladorDeAluno.adcionarAluno(aluno);
				System.out.println("\n");

				break;
			case 2:

				System.out.println("Digite seu nome:");
				nome = ler.nextLine();
				System.out.println("Digite seu cpf:");
				cpf = ler.nextLine();
				System.out.println("Digite seu email:");
				email = ler.nextLine();
				System.out.println("Digite seu sexo:");
				sexo = ler.nextLine();
				System.out.println("Digite seu celular:");
				celular = ler.nextLine();
				System.out.println("Digite sua rua:");
				rua = ler.nextLine();
				System.out.println("Digite o cep:");
				cep = ler.nextLine();
				System.out.println("Digite o numero:");
				numero = ler.nextInt();
				ler.nextLine();
				System.out.println("Digite o complemento:");
				complemento = ler.nextLine();
				System.out.println("Digite seu cargo:");
				cargo = ler.nextLine();
				System.out.println("Digite sua carga horária");
				cargaHoraria = ler.nextLine();

				endereco = new Endereco(rua,cep,numero,complemento);
				instrutor = new Instrutor(nome, cpf, email, sexo, celular, endereco, cargo, cargaHoraria);
				controladorDeInstrutor.adcionarInstrutor(instrutor);

				System.out.println("\n");

				break;
			case 3:
				System.out.println("Você selecionou a opção Buscar Cadastro pelo CPF!");
				System.out.println("qual Cadastro você deseja buscar? \n");
				System.out.println("1.Buscar Cadastro Instrutor");
				System.out.println("2.Buscar Cadastro Aluno");

				escolha = ler.nextInt();
				ler.nextLine();

				if(escolha == 1) {
					System.out.println("Digite o CPF do Instrutor desejado! \n" );
					cpf = ler.nextLine();
					controladorDeInstrutor.buscarInstrutor(cpf);

				}if(escolha == 2) {
					System.out.println("Digite o CPF do Aluno desejado! \n" );
					cpf = ler.nextLine();
					controladorDeAluno.buscaraluno(cpf);
				}
				break;


			case 4:
				System.out.println("Você selecionou a opção Deletar Cadastro !");
				System.out.println("qual Cadastro você deseja deletar? \n");
				System.out.println("1.Deletar Cadastro Aluno");
				System.out.println("2.Deletar Cadastro Instrutor");

				escolha = ler.nextInt();
				ler.nextLine();

				if(escolha == 1) {
					System.out.println("Digite o CPF do Aluno que você deseja deletar!" );
					cpf = ler.nextLine();
					controladorDeAluno.deletarAluno(cpf);

				}if(escolha == 2) {
					System.out.println("Digite o CPF do Instrutor que você deseja deletar!" );
					cpf = ler.nextLine();

					controladorDeInstrutor.deletarInstrutor(cpf);
				} 	
				break;

			case 5:
				System.out.println("Você selecionou a opção Atualizar Cadastro !");
				System.out.println("qual Cadastro você deseja atualizar? \n");
				System.out.println("1.Atualizar Cadastro Aluno");
				System.out.println("2.Atualizar Cadastro Instrutor");

				escolha = ler.nextInt();

				if(escolha == 1) {
					System.out.println("Digite o nome do Aluno que você deseja atualizar!" );
					antigoNome = ler.nextLine();
					ler.nextLine();
					System.out.println("Digite um novo novo Nome!");
					nome = ler.nextLine();
					System.out.println("Digite um novo novo Email!");
					email = ler.nextLine();
					System.out.println("Digite um novo novo Celular!");
					celular = ler.nextLine();
					System.out.println("Digite uma nova  rua:");
					rua = ler.nextLine();
					System.out.println("Digite um novo cep:");
					cep = ler.nextLine();
					System.out.println("Digite um novo numero:");
					numero = ler.nextInt();
					ler.nextLine();
					System.out.println("Digite um novo complemento:");
					complemento = ler.nextLine();

					endereco = new Endereco(rua,cep,numero,complemento);
					controladorDeAluno.atualizarCadastroAluno(antigoNome, nome, email, celular, endereco);

				}if(escolha == 2) {
					System.out.println("Digite o nome do Instrutor  que você deseja atualizar!" );
					antigoNome = ler.nextLine();
					ler.nextLine();
					System.out.println("Digite um novo novo Nome!");
					nome = ler.nextLine();
					System.out.println("Digite um novo novo Email!");
					email = ler.nextLine();
					System.out.println("Digite um novo novo Celular!");
					celular = ler.nextLine();
					System.out.println("Digite uma nova  rua:");
					rua = ler.nextLine();
					System.out.println("Digite um novo cep:");
					cep = ler.nextLine();
					System.out.println("Digite um novo numero:");
					numero = ler.nextInt();
					ler.nextLine();
					System.out.println("Digite um novo complemento:");
					complemento = ler.nextLine();
					System.out.println("Digite um novo novo cargo!");
					cargo = ler.nextLine();
					System.out.println("Digite uma nova Carga Horaria!");
					cargaHoraria = ler.nextLine();

					endereco = new Endereco(rua,cep,numero,complemento);
					controladorDeInstrutor.atualizarCadastroInstrutor(antigoNome, nome, email, celular, endereco, cargo, cargaHoraria);
					System.out.println("\n");
				}
				break;
			case 6:
				System.out.println("Você selecionou a opção Listar Cadastro !");
				System.out.println("qual Cadastro você deseja listar? \n");
				System.out.println("1.Listar Cadastro Instrutor");
				System.out.println("2.Listar Cadastro Aluno");
				
				escolha = ler.nextInt();
				
				if(escolha == 1) {
				
					controladorDeInstrutor.listarInstrutor();
				}if(escolha == 2) {
				
					controladorDeAluno.listarAluno();
				}
				break;
			
			}


		}	while(opcao !=7);	


	}

}


