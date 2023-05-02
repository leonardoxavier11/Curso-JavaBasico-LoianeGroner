package com.loiane.cursojava.aula44.labs01.Melhorando;

import java.util.ArrayList;
import java.util.List;

public class FiguraGeometrica {

	private String nome;
	private String cor;
//	private double resultado;
	private List<FiguraGeometrica> figuras = new ArrayList<FiguraGeometrica>();

	public FiguraGeometrica(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

//	public double getResultado() {
//		return resultado;
//	}
//
//	public void setResultado(double resultado) {
//		this.resultado = resultado;
//	}

	public void getFiguras() {
		for (FiguraGeometrica figuraGeometrica : figuras) {
			System.out.println("--------------------------");
			if (figuraGeometrica instanceof Figura2D) {
				Figura2D figura2D = (Figura2D) figuraGeometrica; // Casting

				System.out.println(figura2D.getNome() + ":\nArea: " + figura2D.calcularArea());
			} else if (figuraGeometrica instanceof Figura3D) {
				Figura3D figura3D = (Figura3D) figuraGeometrica; // Casting

				System.out.println(figura3D.getNome() + ":\nArea: " + figura3D.calcularArea() + "\nVolume: "
						+ figura3D.calcularVolume());
			}

		}
	}

	public void setFiguras(FiguraGeometrica figura) {
		figuras.add(figura);
	}

}
