package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_15_TrocoVerificado_cap_04_Condicionais {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorProduto, quantProduto, valorPago, valorTotal, troco;
		
		System.out.print("Preço unitário do produto: ");
		valorProduto = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantProduto = sc.nextDouble();
		System.out.print("Dinheiro recebido: ");
		valorPago = sc.nextDouble();
		
		valorTotal = quantProduto*valorProduto;
		
		if (valorPago < valorTotal) {
			System.out.printf("DINHEIRO INSUFICIENTE, FALTAM %.2f REAIS", (valorTotal - valorPago));
		}	else {
			troco = (valorPago - quantProduto*valorProduto);
			System.out.printf("Troco = %.2f %n", troco);
		}
		
		sc.close();
	}
}
