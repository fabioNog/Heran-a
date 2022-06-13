package pck.pagamento;

public class Parcelado extends Pagamento{
	
	private double numParcelas;
	private double jurosParcela;

	public Parcelado(double valor,double numParcelas,double jurosParcela) {
		super(valor);
		setNumParcelas(numParcelas);
		if(jurosParcela > 0 && jurosParcela <= 100) {
			setJurosParcela(jurosParcela);
		}
		else {
			System.out.println("Valor indevido da Parcela");
		}
		// TODO Auto-generated constructor stub
	}

	public double getNumParcelas() {
		return numParcelas;
	}

	public void setNumParcelas(double numParcelas) {
		this.numParcelas = numParcelas;
	}

	public double getJurosParcela() {
		return jurosParcela;
	}

	public void setJurosParcela(double jurosParcela) {
		this.jurosParcela = jurosParcela;
	}
	
	public void exibirValorParcelado() {
		double cont = 0;
		double valorParcelado = this.getValor()/this.getNumParcelas();
		double valorFinalParcela = valorParcelado + ( this.getValor() * (this.getJurosParcela()/100));
		for(int i=0 ; i < this.getNumParcelas(); i++) {
			cont = cont + valorParcelado + valorFinalParcela;
		}
		
		System.out.println("O Valor de cada parcela será de: " + valorFinalParcela);
		System.out.println("O Valor Total da compra é de : " + cont);
	}
}
