package com.loiane.cursojava.aula43.labs01.Ajustando;

import java.util.Scanner;

public class Testa {

	public static void main(String[] args) {

		int numConta;
		Scanner scan = new Scanner(System.in);
		int opcaoMenu;

		do {

			System.out.println(
					"O que você quer fazer? \n1 - Criar contas \n2 - Visualizar as contas cadastradas \n3 - Sacar um valor \n4 - Depositar um valor \n5 - Projetar um novo saldo a partir de um rendimento \n9 - Sair");
			opcaoMenu = scan.nextInt();
			scan.nextLine();

			switch (opcaoMenu) {
			case 1:
				System.out.println(
						"Qual conta você quer instanciar? \n1 - Conta Poupança \n2 - Conta Especial \n3 - Sair do cadastro de contas");
				int opcaoConta;
				opcaoConta = scan.nextInt();
				scan.nextLine();

				if (opcaoConta == 1) {
					System.out.println("Entre com seu nome e saldo inicial");
					String nome = scan.nextLine();
					double saldo = scan.nextDouble();

					ContaPoupanca conta = new ContaPoupanca(nome, saldo);
					ControleContas.setConta(conta);
				} else if (opcaoConta == 2) {
					System.out.println("Entre com seu nome e saldo inicial");
					String nome = scan.nextLine();
					double saldo = scan.nextDouble();

					ContaEspecial conta = new ContaEspecial(nome, saldo);
					ControleContas.setConta(conta);
				} else if (opcaoConta == 3) {
					System.out.println("Saindo do cadastro de contas e voltando ao menu inicial\n");
				} else {
					System.out.println("Opção inválida, tente novamente\n");
				}

				break;
			case 2:
				ControleContas.status();
				break;
			case 3:
				System.out.println("Qual o numero da conta você quer sacar?");
				numConta = scan.nextInt();
				scan.nextLine();

				System.out.println(ControleContas.localizarSacar(numConta));
				break;
			case 4:
				System.out.println("Qual o numero da conta você quer depositar?");
				numConta = scan.nextInt();
				scan.nextLine();
				System.out.println(ControleContas.localizarDepositar(numConta));
				break;
			case 5:
				System.out.println(
						"Qual o numero da conta que você quer projetar quanto será o saldo, após X meses na poupança?");
				numConta = scan.nextInt();
				scan.nextLine();
				System.out.println(ControleContas.localizarProjetarPoupanca(numConta));
				break;
			case 9:
				System.out.println("Encerrando programa");
				break;

			default:
				System.out.println("Opção inválida, tente novamente\n");
				break;
			}

		} while (opcaoMenu != 9);
	}

}
