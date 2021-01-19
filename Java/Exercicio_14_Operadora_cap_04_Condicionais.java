package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_14_Operadora_cap_04_Condicionais {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double valorTotal = 0;
		
		System.out.print("Digite a quantidade de minutos: ");
		minutos = sc.nextInt();
		
		if (minutos <= 100) {
		System.out.println("Valor a pagar: R$ 50,00");
		} else 
			if (minutos > 100) {
			valorTotal = (50.00 + ((minutos - 100)*2.00));
			System.out.printf("Valor a pagar: R$ %.2f %n", valorTotal);
			}
		
		sc.close();
	}
}
