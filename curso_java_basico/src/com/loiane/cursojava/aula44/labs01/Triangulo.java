package com.loiane.cursojava.aula44.labs01;

public class Triangulo extends Figura2D {
	private double base;
	private double altura;

	public Triangulo(String nome, double base, double altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (base * altura) / 2;

	}

}
