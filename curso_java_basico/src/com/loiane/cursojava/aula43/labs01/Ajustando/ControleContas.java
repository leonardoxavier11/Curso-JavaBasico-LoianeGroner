package com.loiane.cursojava.aula43.labs01.Ajustando;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ControleContas {

	private static Set<Conta> contas = new HashSet<Conta>();

	public static void setConta(Conta contas) {
		ControleContas.contas.add(contas);
	}

	public static void status() {
		for (Conta conta : contas) {
			System.out.println(conta);
		}
	}

	public static String localizarSacar(int numContaProcurado) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto você quer sacar?");
		double valor = scan.nextDouble(); // Adicionar verificação para saque maior que 0.0
		scan.nextLine();

		for (Conta conta : contas) {
			if (conta.getNumConta() == (numContaProcurado)) {
				System.out.println("Conta encontrada: " + conta);
				return conta.sacar(valor);
			}
		}

		return "Conta não encontrada";
	}

	public static String localizarDepositar(int numContaProcurado) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Quanto você quer depositar?");
		double valor = scan.nextDouble();
		for (Conta conta : contas) {
			if (conta.getNumConta() == (numContaProcurado)) {
				System.out.println("Conta encontrada: " + conta);
				return conta.depostiar(valor);
			}
		}
		return "Conta não encontrada";
	}

	public static String localizarProjetarPoupanca(int numContaProcurado) {
		Scanner scan = new Scanner(System.in);
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

			}
		}
		return "Conta não encontrada";
	}

//	Aparentemente, o método localizarSacar não apresenta problemas em relação à exceção NoSuchElementException. 
//	Uma possível razão pela qual a exceção era lançada anteriormente é que o objeto Scanner estava sendo fechado implicitamente devido ao uso do bloco try-with-resources. 
//	Como o objeto Scanner foi aberto no método localizarSacar, se ele for fechado, ele também fechará a entrada padrão System.in, impedindo a leitura posterior de entrada do usuário e lançando uma exceção NoSuchElementException. 
//	Remover o bloco try-with-resources e usar um bloco try-catch-finally pode resolver o problema.

}
