package com.loiane.cursojava.aula44.labs01;

public class Circulo extends Figura2D {
	private double raio;

	public Circulo(String nome, double raio) {
		super(nome);
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * (raio * raio);

	}

}
