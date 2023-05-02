package com.loiane.cursojava.aula44.labs01;

public class testa {

	public static void main(String[] args) {

		FiguraGeometrica figuras = new FiguraGeometrica("Figuras");

//		Figuras 2D

		Quadrado f1 = new Quadrado("Quadrado", 2);
		f1.setResultado(f1.calcularArea());
		figuras.setFiguras(f1);

		Circulo f2 = new Circulo("Circulo", 2);
		f2.setResultado(f2.calcularArea());
		figuras.setFiguras(f2);

		Triangulo f3 = new Triangulo("Triangulo", 3, 2);
		f3.setResultado(f3.calcularArea());
		figuras.setFiguras(f3);

//		"Figuras 3D

		Cubo f4 = new Cubo("Cubo", 3);
		f4.setResultado(f4.calcularArea());
		f4.setResultadoVolume(f4.calcularVolume());
		figuras.setFiguras(f4);

		Cilindro f5 = new Cilindro("Cilindro", 3, 2);
		f5.setResultado(f5.calcularArea());
		f5.setResultadoVolume(f5.calcularVolume());
		figuras.setFiguras(f5);

		Piramide f6 = new Piramide("Piramide", 3, 2, 4, 4, f1);
		f6.setResultado(f6.calcularArea());
		f6.setResultadoVolume(f6.calcularVolume());
		figuras.setFiguras(f6);

		figuras.getFiguras();
	}

}
