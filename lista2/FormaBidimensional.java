package pck.lista2;

public class FormaBidimensional extends Forma{

	public FormaBidimensional(String Nome, double X, double Y) {
		super(Nome, X, Y);
	}
	
	public double calculaArea() {
		double area;
		area = this.getEixoX() * this.getEixoY();
		return area;
	}
}
