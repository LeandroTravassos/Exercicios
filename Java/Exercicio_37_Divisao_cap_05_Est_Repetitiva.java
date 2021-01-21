//Escreva um algoritmo que leia dois números e imprima o resultado da divisão do primeiro pelo
//segundo. Caso não for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_37_Divisao_cap_05_Est_Repetitiva {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double a, b, divisao;
		
		System.out.print("Quantos casos você vai digitar? ");
		n = sc.nextInt();
		
		for (i=1 ; i<=n ; i++) {
			System.out.print("Entre com o numerador: ");
			a = sc.nextDouble();
			System.out.print("Entre com o denominador: ");
			b = sc.nextDouble();
			
			if (b == 0) {
				System.out.println("Divisão impossível!");
			}
			else {
			divisao = a/b;
			System.out.printf("Divisão = %.2f\n", divisao);
			}
		}
		
		sc.close();
	}
}
