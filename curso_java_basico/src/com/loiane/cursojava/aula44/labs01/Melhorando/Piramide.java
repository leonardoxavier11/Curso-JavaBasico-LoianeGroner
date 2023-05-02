package com.loiane.cursojava.aula44.labs01.Melhorando;

public class Piramide extends Figura3D {
	private double altura;
	private double arestaBase;
	private double apotama;
	private int qntArestas;

	private Figura2D base; // -> Toda Piramide tem uma figura2D como base

	public Piramide(String nome, double altura, double arestaBase, double apotama, int qntArestas, Figura2D base) {
		super(nome);
		this.altura = altura;
		this.arestaBase = arestaBase;
		this.apotama = apotama;
		this.qntArestas = qntArestas;
		this.base = base;
	}

	@Override
	public double calcularArea() {
		if (base != null) {
			double areaLateral = qntArestas * ((arestaBase * apotama) / 2);
			double areaBase = base.calcularArea();
			double areaTotal = areaLateral + areaBase;
			return areaTotal;
		}
		return 0;
	}

	@Override
	public double calcularVolume() {
		if (base != null) {
			return (base.calcularArea() * altura) / 3;
		}
		return 0;
	}
}
