package pck.pagamento;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
								
		
		int valor = 1;
		
		while(valor == 1) {
			
			System.out.println("=================================================");
			System.out.println("Digite 0 para sair do programa");
			System.out.println("Digite 1 para Realizar um pagamento  vista ");
			System.out.println("Digite 2 para Realizar um pagamento  A Prazo ");
			System.out.println("=================================================");
			Scanner sc = new Scanner(System.in);
			int opcao = sc.nextInt();
			
			switch (opcao) {
		      case 1:
		    	  		    	  
				// ========== Calculando o valor a vista =========
		    	//Capturando o valor do produto
		    	  
		        System.out.println("Digite o preço do produto: ");
		        Scanner v1 = new Scanner(System.in);
				double  preco = v1.nextDouble();
				
		    	//Capturando o valor do desconto
		        System.out.println("Digite o valor do desconto: ");
		        Scanner desc1 = new Scanner(System.in);
				double desconto = desc1.nextInt();
				
		    	//Capturando os Segundos
		        AVista vista = new AVista(preco,desconto);
		        
		        vista.exibirValorAVista();
		        
								
		        break;
		      case 2:
		    	// ========== Calculando o valor a vista =========
			    	//Capturando o valor do produto
			    	  
			        System.out.println("Digite o preço do produto: ");
			        Scanner v2 = new Scanner(System.in);
					double  preco2 = v2.nextDouble();
					
			    	//Capturando o valor do desconto
			        System.out.println("Digite em quantas parcelas serão divididas o preço: ");
			        Scanner parcelas = new Scanner(System.in);
					double qtParcelas = parcelas.nextDouble();
					
					System.out.println("Digite o valor do juros simples aplicado: ");
			        Scanner j2 = new Scanner(System.in);
					double jurosSimples = j2.nextDouble();
					
			    	//Capturando os Segundos
			        Parcelado aPrazo = new Parcelado(preco2,qtParcelas,jurosSimples);
			        
			        aPrazo.exibirValorParcelado();
		    	  
		        break;
		      case 0:
		    	 
		        valor = opcao;
		        break;
		    }
		}
		System.out.println("Você finalizou sua compra");
		//Parcelado p1 = new Pagamento(...);
		/* 
		 * Não é possivel converter um parcelado em pagamento, mais o contrario é verdadeiro	
		 * Todo objeto Parcelado é também um objeto Pagamento, mais o contrário é falso 	*/
		
	}
}
