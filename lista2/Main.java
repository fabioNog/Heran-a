package pck.lista2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Digite o valor do raio");
		
		Scanner r = new Scanner(System.in);
		
		double raio =  r.nextDouble();
		System.out.println("Digite o valor do eixo X");
		double x = r.nextDouble();
		System.out.println("Digite o valor do eixo Y");
		double y = r.nextDouble();
		System.out.println("Digite o valor do eixo Z");
		double z = r.nextDouble();
		Circulo C = new Circulo("Circulo",raio,raio);
		Triangulo T = new Triangulo("Triangulo",x,y);
		Cubo Cb = new Cubo("Triangulo",x,y,z);
		System.out.println("O valor da area do circulo é: " + C.calculaArea());
		System.out.println("O valor da area é Triagulo é: " + T.calculaArea());
		System.out.println("O valor da area é Cubo é: " + Cb.calculaVolume());
	}

}

