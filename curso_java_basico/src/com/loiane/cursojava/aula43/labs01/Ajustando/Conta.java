package com.loiane.cursojava.aula43.labs01.Ajustando;

import java.util.Random;

public abstract class Conta {

	private String nomeCliente;
	private int numConta;
	private double saldo;
	private String tipoConta;

	// Construtor
	public Conta(String nomeCliente, double saldo) {
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
		this.numConta = numContaAleatorio();
	}

	// Getters & Setters
	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;

	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	// Métodos
	public String sacar(double valor) {
		if (this.saldo - valor >= 0) {
			this.saldo -= valor;
			return "Saque realizado com sucesso.Seu novo saldo é de: R$ " + this.saldo;
		} else {
			return "Não há valor disponível para fazer esse saque. Valor total: " + saldo;
		}
	}

	public String depostiar(double valor) {
		this.saldo += valor;
		return "Deposito realizado com sucesso. O novo saldo é de: R$" + this.getSaldo();
	}

	public int numContaAleatorio() {
		Random random = new Random(System.currentTimeMillis()); 
		return random.nextInt(10000) + 1;
	} 

	@Override
	public String toString() {
		return "Conta [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + ",tipo="
				+ tipoConta + "]";
	}


}
