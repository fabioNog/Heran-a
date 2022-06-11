package pck.pagamento;

public class AVista extends Pagamento{
	private int desconto;
	
	public AVista(double valor,int desconto) {
		super(valor);
		if(desconto > 0 && desconto <= 100) {
			this.setDesconto(desconto);
		}
		else {
			System.out.println("Valor invalido do desconto");
		}
		
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}
	
	public void exibirValorAVista() {
		double valorAVista = this.getValor() + (this.getValor()*this.getDesconto());
		System.out.println("O valor final a vista com desconto é: " + valorAVista);
	}
}
