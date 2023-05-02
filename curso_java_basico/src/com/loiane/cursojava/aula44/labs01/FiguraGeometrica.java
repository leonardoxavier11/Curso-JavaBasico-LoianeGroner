package com.loiane.cursojava.aula44.labs01;

import java.util.ArrayList;
import java.util.List;

public class FiguraGeometrica {

	private String nome;
	private String cor;
	private double resultado;
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

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public void getFiguras() {
		for (FiguraGeometrica figuraGeometrica : figuras) {
			if (figuraGeometrica instanceof Figura2D) {
				System.out.println(figuraGeometrica.getNome() + ": " + figuraGeometrica.getResultado());
			} else if (figuraGeometrica instanceof Figura3D) {
				Figura3D figura3D = (Figura3D) figuraGeometrica;
				System.out.println(figura3D.getNome() + ": " + figura3D.getResultado() + " Volume: "
						+ figura3D.getResultadoVolume());
			}

		}
	}

	public void setFiguras(FiguraGeometrica figura) {
		figuras.add(figura);
	}

}
