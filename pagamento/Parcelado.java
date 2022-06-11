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
	
}
