//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_43_NumerosPares_cap_06_Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i, qtdPares = 0;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();
		
		int[] numeros = new int[N];
		
		for (i=0;i<N;i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
			
		}
		
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		
		for (i=0;i<N;i++) {
			if (numeros[i] % 2 == 0) {
				System.out.printf("%d  ", numeros[i]);
				qtdPares++;
			}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdPares);
		
		sc.close();
	}
}
