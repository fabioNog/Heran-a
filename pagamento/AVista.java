package pck.pagamento;

public class AVista extends Pagamento{
	private double desconto;
	
	public AVista(double valor,double desconto) {
		super(valor);
		if(desconto > 0 && desconto <= 100) {
			this.setDesconto(desconto);
		}
		else {
			System.out.println("Valor invalido do desconto");
		}
		
	}

	public double getDesconto() {
		return this.desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public void exibirValorAVista() {
		double valorAVista = 0;
		double valorDoDesconto = this.getDesconto()/100;		
		valorAVista = this.getValor() - (this.getValor() * valorDoDesconto);
		System.out.println("O valor final a vista com desconto é: " + valorAVista);
	}
}
