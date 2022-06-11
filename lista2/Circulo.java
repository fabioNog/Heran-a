package pck.lista2;
import java.math.*;
public class Circulo extends FormaBidimensional{

	
	
	public Circulo(String Nome, double X, double Y) {
		super(Nome, X, Y);
	}
	
	public double calculaArea() {
	
		return this.getEixoX()*this.getEixoY()*Math.PI;
	}

}
