package com.loiane.cursojava.aula44.labs01;

public abstract class Figura3D extends FiguraGeometrica implements DimensaoVolumetrica, DimensaoSuperficial {

	private double resultadoVolume;

	public Figura3D(String nome) {
		super(nome);
	}

	public double getResultadoVolume() {
		return resultadoVolume;
	}

	public void setResultadoVolume(double resultadoVolume) {
		this.resultadoVolume = resultadoVolume;
	}

	
}
