//Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto,
//mandou digitar um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de
//venda das mesmas. Fazer um programa que leia tais dados e determine e escreva quantas mercadorias
//proporcionaram:

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_51_Comerciante_cap_06_Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i, menor10 = 0, entre10e20 = 0, maior20 = 0;
		double percentual, totalCompra = 0, totalVenda = 0, lucro;
		
		System.out.print("Serao digitados dados de quantos produtos? ");
		N = sc.nextInt();
		
		String[] nomeProduto = new String[N];
		double[] pCompra = new double[N];
		double[] pVenda = new double[N];
		
		for (i=0; i<N; i++) {
			System.out.printf("Produto %d: \n", i+1);
			
			System.out.print("Nome: ");
			sc.nextLine();
			nomeProduto[i] = sc.next();
			
			System.out.print("Preco de compra: ");
			pCompra[i] = sc.nextDouble();
			
			System.out.print("Preco de venda: ");
			pVenda[i] = sc.nextDouble();
			
			totalCompra = totalCompra + pCompra[i];
			totalVenda = totalVenda + pVenda[i];
			percentual = (pVenda[i]-pCompra[i]) * 100 / pCompra[i];
			
			if (percentual<10) {
				menor10++;
			} else if (percentual >= 10 && percentual <=20 ) {
						entre10e20++;
					} else {
						maior20++;
						}	
		}
		
		lucro = totalVenda-totalCompra;
		
		System.out.printf("\nRELATÓRIO: \n");
		System.out.printf("Lucro abaixo de 10%%: %d\n", menor10);
		System.out.printf("Lucro entre 10%% e 20%%: %d\n", entre10e20);
		System.out.printf("Lucro acima de 20%%: %d\n", maior20);
		System.out.printf("Valor total de compra: %.2f\n", totalCompra);
		System.out.printf("Valor total de venda: %.2f\n", totalVenda);
		System.out.printf("Lucro total: %.2f\n", lucro);
		
		sc.close();
	}
}
