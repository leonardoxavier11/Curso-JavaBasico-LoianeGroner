package com.loiane.cursojava.aula43.labs01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ControleContas {

	private static Set<Conta> contas = new HashSet<Conta>();
//	private static List<ContaEspecial> contasEspeciais = new ArrayList<ContaEspecial>();
//	private static List<ContaPoupanca> contasPoupancas = new ArrayList<ContaPoupanca>();

//	public List<ContaEspecial> getContasEspeciais() {
//		return contasEspeciais;
//	}
//
//	static public void setContasEspeciais(ContaEspecial contasEspeciais) {
//		ControleContas.contasEspeciais.add(contasEspeciais);
//	}
//
//	public List<ContaPoupanca> getContasPoupancas() {
//		return contasPoupancas;
//	}
//
//	static public void setContasPoupancas(ContaPoupanca contasPoupancas) {
//		ControleContas.contasPoupancas.add(contasPoupancas);
//	}
//
//	
//	public static String status() { // Método igual ao toString, porém é static
//		return "ControleContas \n[contasEspeciais=" + contasEspeciais + "], \n[contasPoupancas=" + contasPoupancas
//				+ "]\n";
//	}

//	public List<Conta> getContas() {
//		return contas;
//	}

	public static void setConta(Conta contas) {
		ControleContas.contas.add(contas);
	}

	public static void status() {
		for (Conta conta : contas) {
			System.out.println(conta);
		}
	}

	public static String localizarSacar(int numContaProcurado) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Quanto você quer sacar?");
			double valor = scan.nextDouble(); // Adicionar verificação para saque maior que 0.0
			scan.nextLine();
			for (Conta conta : contas) {
				if (conta.getNumConta() == (numContaProcurado)) {
					System.out.println("Conta encontrada: " + conta);
//				System.out.println(conta.sacar(valor)); // chama o método sacar na conta encontrada
					return conta.sacar(valor); // chama o método sacar na conta encontrada
//				return null 
				}
			}
			scan.close();
		}
		return "Conta não encontrada";
	}

	public static String localizarDepositar(int numContaProcurado) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Quanto você quer depositar?");
			double valor = scan.nextDouble();
			for (Conta conta : contas) {
				if (conta.getNumConta() == (numContaProcurado)) {
					System.out.println("Conta encontrada: " + conta);
					return conta.depostiar(valor);
				}
			}
		}
		return "Conta não encontrada";
	}

	public static String localizarProjetarPoupanca(int numContaProcurado) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Quantos meses você quer projetar?");
			int meses = scan.nextInt();
			scan.nextLine();
			for (Conta conta : contas) {
				if (conta.getNumConta() == (numContaProcurado)) {
					System.out.println("Conta encontrada: " + conta);

					if (conta instanceof ContaPoupanca) {
						ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
						contaPoupanca.calcularNovoSaldoAposMeses(meses);
						return "O novo saldo após o rendimento é de: R$ " + conta.getSaldo();
					} else {
						return "Conta não é tipo poupança";
					}
					// Fazendo o casting da variável para classe
					// ContaPoupanca, conseguimos acessar o método
					// especifico dessa classe
//				conta.calcularNovoSaldoAposMeses(meses); 

				}
			}
			scan.close();
		}
		return "Conta não encontrada";
	}

}
