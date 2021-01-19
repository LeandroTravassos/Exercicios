// Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
// O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
// e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve
// mostrar o valor do troco a ser devolvido ao cliente.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_005_Troco {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double preco, quantidade, valor, troco;
		
		System.out.print("Digite o preço unitário do produto: ");	
		preco = sc.nextDouble();
		System.out.print("Digite a quantidade do produto: ");
		quantidade = sc.nextDouble();
		System.out.print("Digite o valor pago pelo cliente: ");
		valor = sc.nextDouble();
		
		troco = (valor - preco * quantidade);
		
		System.out.println();
		System.out.println("___________________________________________");
		System.out.println();
		System.out.printf("Preço unitário do produto: %.2f %n", preco);
		System.out.printf("Quantidade comprada: %.0f %n", quantidade);
		System.out.printf("Dinheiro recebido: %.2f %n", valor);
		System.out.printf("Troco: %.2f %n", troco);
		
		sc.close();
	}
}
