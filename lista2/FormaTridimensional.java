package pck.lista2;

public class FormaTridimensional extends Forma{
	
	private double eixoZ;
	
	public FormaTridimensional(String Nome, double X, double Y, double Z) {
		super(Nome, X, Y);
		setEixoX(X);
		setEixoY(Z);
		setEixoZ(Z);
	}

	public double getEixoZ() {
		return eixoZ;
	}

	public void setEixoZ(double eixoZ) {
		this.eixoZ = eixoZ;
	}
	
	public double calculaVolume() {
		double area;
		area = this.getEixoX()*this.getEixoY()*this.getEixoZ();
		return area;
	}
	

}
