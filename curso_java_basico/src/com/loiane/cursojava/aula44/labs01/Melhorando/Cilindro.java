package com.loiane.cursojava.aula44.labs01.Melhorando;

public class Cilindro extends Figura3D implements DimensaoVolumetrica {
	private double altura;
	private double raio;

	public Cilindro(String nome, double altura, double raio) {
		super(nome);
		this.altura = altura;
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return (2 * Math.PI * raio * altura) + (2 * (Math.PI * (raio * raio)));
	}

	@Override
	public double calcularVolume() {
		return Math.PI * (raio * raio) * altura;
	}

}
