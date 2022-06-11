package pck.heranca;

public class Poligono {
	
	private double lados[];
	
	public Poligono(double[] lados) {
		setLados(lados);
	}
	
	public double[] getLados() {
		return lados;
	}

	public void setLados(double[] lados) {
		this.lados = lados;
	}
	
	public double calcularPerimetro() {
		double perimetro=0;
		for(int i=0;i < this.lados.length; i++) {
			perimetro = perimetro + this.lados[i];
		}
		return perimetro;
	}
	
	public void exibirLados() {
		for(int i=0;i < this.lados.length; i++) {
			System.out.println("Lado " + this.lados[i]); 
		}
	}
}
