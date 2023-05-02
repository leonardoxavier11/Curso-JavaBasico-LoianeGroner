package com.loiane.cursojava.aula44.labs01.Melhorando;

public class Quadrado extends Figura2D {
	private int lado;

	public Quadrado(String nome, int lado) {
		super(nome);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return lado * lado;
	}

}
