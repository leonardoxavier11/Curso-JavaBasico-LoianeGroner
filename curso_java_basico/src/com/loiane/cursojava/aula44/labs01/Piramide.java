package com.loiane.cursojava.aula44.labs01;

public class Piramide extends Figura3D {
	private double altura;
	private double arestaBase;
	private double apotama;
	private int qntArestas;

	private Figura2D base;

	public Piramide(String nome, double altura, double arestaBase, double apotama, int qntArestas, Figura2D base) {
		super(nome);
		this.altura = altura;
		this.arestaBase = arestaBase;
		this.apotama = apotama;
		this.qntArestas = qntArestas;
		this.base = base;
	}

	@Override
	public double calcularVolume() {
		return (base.calcularArea() * altura) / 3;
	}

	@Override
	public double calcularArea() {
		return qntArestas * (arestaBase * apotama) / 2;
	}

}
