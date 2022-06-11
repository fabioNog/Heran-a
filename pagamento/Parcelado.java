package pck.pagamento;

public class Parcelado extends Pagamento{
	
	private int numParcelas;
	private int jurosParcela;

	public Parcelado(double valor,int numParcelas,int jurosParcela) {
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

	public int getNumParcelas() {
		return numParcelas;
	}

	public void setNumParcelas(int numParcelas) {
		this.numParcelas = numParcelas;
	}

	public int getJurosParcela() {
		return jurosParcela;
	}

	public void setJurosParcela(int jurosParcela) {
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
