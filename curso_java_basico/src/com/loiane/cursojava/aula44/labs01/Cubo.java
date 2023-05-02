package com.loiane.cursojava.aula44.labs01;

public class Cubo extends Figura3D {
	private int lado;

	public Cubo(String nome, int lado) {
		super(nome);
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		return 6 * (lado * lado);
	}

	@Override
	public double calcularVolume() {
		return Math.pow(lado, 3);
	}
}
