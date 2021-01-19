package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_19_Lanchonete_cap_04_Condicionais {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codProduto, qtd;
		double total = 0;
		
		System.out.println(" _____________________________________________ ");
		System.out.println("|  Código do Produto   |   Preço do Produto   |");
		System.out.println("|----------------------|----------------------|");
		System.out.println("|__________1___________|________R$ 5.00_______|");
		System.out.println("|__________2___________|________R$ 3.50_______|");
		System.out.println("|__________3___________|________R$ 4.80_______|");
		System.out.println("|__________4___________|________R$ 8.90_______|");
		System.out.println("|__________5___________|________R$ 7.32_______|");
		System.out.println("|______________________|______________________|");
		System.out.println();
		
		System.out.print("Codigo do produto comprado: ");
		codProduto = sc.nextInt();
		
		System.out.print("Quantidade comprada: ");
		qtd = sc.nextInt();
		
		switch (codProduto) {
			
			case 1:
				total = qtd * 5.00;
				break;
			case 2:
				total = qtd * 3.50;
				break;
			case 3:
				total = qtd * 4.80;
				break;
			case 4:
				total = qtd * 8.90;
				break;
			case 5:
				total = qtd * 7.32;
				break;
			
			default:
				System.out.println("Código inválido!");
				break;
		} 
		
			
				System.out.printf("Valor a pagar: R$%.2f %n", total);
		
		
		sc.close();
	}
}
