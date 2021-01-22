package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_40_Negativos_cap_06_Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();
		
		int[] vetor = new int[10];
		
		for (i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for (i = 0; i < N; i++) {
			if (vetor[i] < 0) {
				System.out.printf("%d %n", vetor[i]);
			}
		}
		sc.close();
	}
}
