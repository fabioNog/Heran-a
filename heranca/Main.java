package pck.heranca;

import pck.Quadrilatero;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ladosDoTriangulo[] = new double [ ] {3 , 4 , 5};
		double ladosDoQuadrilatero[] = new double [] {7 , 8 , 9 , 10};
		
		Triangulo T1 = new Triangulo(ladosDoTriangulo);
		Quadrilatero Q1 = new Quadrilatero(ladosDoQuadrilatero);
		
		System.out.println("************ Triangulo ****************");
		double PT = T1.calcularPerimetro();
		System.out.println("Perimetro do Triangulo: " + PT);
		T1.exibirLados();
		System.out.println("************ Triangulo ****************");
		System.out.println("\n");
		System.out.println("************ Quadrilatero ****************");
		double PQ =Q1.calcularPerimetro();
		System.out.println("Perimetro do Quadrilatero: " + PQ);
		Q1.exibirLados();
		System.out.println("************ Quadrilatero ****************");
		
	}

}
