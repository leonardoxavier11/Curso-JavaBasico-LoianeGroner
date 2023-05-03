package com.loiane.cursojava.aula43.labs01;

import java.util.Scanner;

public class Testa01 {

	public static void main(String[] args) {

//		ControleContas controle = new ControleContas();

		try (Scanner scan = new Scanner(System.in)) {
			String opcaoMenu = null;

			do {
				System.out.println(
						"O que você quer fazer? \n1 - Criar contas \n2 - Visualizar as contas cadastradas \n3 - Sacar um valor \n4 - Depositar um valor \n5 - Projetar um novo saldo a partir de um rendimento \n9 - Sair");
				if (scan.hasNextInt()) {
					opcaoMenu = scan.nextLine();
//					scan.nextLine();

					String numConta;

					switch (opcaoMenu) {
					case "1":
						String opcao;
						do {

							System.out.println(
									"Qual conta você quer instanciar? \n1 - Conta Poupança \n2 - Conta Especial \n3 - Sair do cadastro de contas");
							opcao = scan.nextLine();

							if (opcao.equals("1")) {
								System.out.println("Entre com seu nome e saldo inicial");
								String nome = scan.nextLine();
								double saldo = scan.nextDouble();
								scan.nextLine();

								ContaPoupanca conta = new ContaPoupanca(nome, saldo);
								ControleContas.setConta(conta);
							} else if (opcao.equals("2")) {
								System.out.println("Entre com seu nome e saldo inicial");
								String nome = scan.nextLine();
								double saldo = scan.nextDouble();
								scan.nextLine();

								ContaEspecial conta = new ContaEspecial(nome, saldo);
								ControleContas.setConta(conta);
							} else if (opcao.equals("3")) {
								System.out.println("Saindo do cadastro de contas e voltando ao menu inicial\n");
							} else {
								System.out.println("Opção inválida, tente novamente\n");
							}

						} while (!opcao.equals("3"));
						break;
					case "2":
						ControleContas.status();
						break;
					case "3":
						System.out.println("Qual o numero da conta você quer sacar?");
						numConta = scan.nextLine();
						int s = Integer.parseInt(numConta);
						System.out.println(ControleContas.localizarSacar(s));
						break;
					case "4":
						System.out.println("Qual o numero da conta você quer depositar?");
						numConta = scan.nextLine();
						int a = Integer.parseInt(numConta);
						System.out.println(ControleContas.localizarDepositar(a));
						break;
					case "5":
						System.out.println(
								"Qual o numero da conta que você quer projetar quanto será o saldo, após X meses na poupança?");
						numConta = scan.nextLine();
						int b = Integer.parseInt(numConta);
						System.out.println(ControleContas.localizarProjetarPoupanca(b));
						break;
					case "9":
						System.out.println("Encerrando programa");
						break;
					default:
						System.out.println("Opção inválida, tente novamente\n");
						break;
					}
				} else if (scan.hasNextLine()) {
					System.out.println("Entrada Inválida\n");
					scan.skip(".*\n"); // consome a nova linha deixada pelo nextLine()
				} else {
					System.out.println("Erro de entrada");
					scan.skip(".*\n");
				}
			} while (!opcaoMenu.equals("9"));
		}
	}

}
