package pck.lista2;

public class Forma {
	private String nome;
	private double eixoX;
	private double eixoY;
	
	public Forma(String Nome,double X,double Y) {
		setNome(Nome);
		setEixoX(X);
		setEixoY(Y);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getEixoX() {
		return eixoX;
	}

	public void setEixoX(double eixoX) {
		this.eixoX = eixoX;
	}

	public double getEixoY() {
		return eixoY;
	}

	public void setEixoY(double eixoY) {
		this.eixoY = eixoY;
	}
	
}
