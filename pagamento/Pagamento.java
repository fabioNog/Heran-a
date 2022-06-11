package pck.pagamento;

import java.util.Scanner;

public class Pagamento {
	private double valor;
	
	public Pagamento(double valor) {
		setValor(valor);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int numParcelas() {
		
		int parcela;
		System.out.println("Digite a quantidade de parcelas");
		
		Scanner p = new Scanner(System.in);
		parcela = p.nextInt();
		return parcela;
	}
	
}
