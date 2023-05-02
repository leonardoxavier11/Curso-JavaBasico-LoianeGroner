package com.loiane.cursojava.aula44.labs01.Melhorando;

public class testa {

	public static void main(String[] args) {

//		Instanciando FiguraGeometrica para utilizar o ArrayList
		FiguraGeometrica figuras = new FiguraGeometrica("Figuras");

//		Figuras 2D

		Quadrado f1 = new Quadrado("Quadrado", 2);
		Circulo f2 = new Circulo("Circulo", 2);
		Triangulo f3 = new Triangulo("Triangulo", 3, 2);

		figuras.setFiguras(f1);
		figuras.setFiguras(f2);
		figuras.setFiguras(f3);

//		Figuras 3D

		Cubo f4 = new Cubo("Cubo", 3);
		Cilindro f5 = new Cilindro("Cilindro", 3, 2);
		Piramide f6 = new Piramide("Piramide", 3, 2, 4, 4, f1);

		figuras.setFiguras(f4);
		figuras.setFiguras(f5);
		figuras.setFiguras(f6);

//		Retorno do ArrayList
		figuras.getFiguras();
	}

}
