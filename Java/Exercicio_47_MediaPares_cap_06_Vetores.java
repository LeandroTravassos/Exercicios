package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_47_MediaPares_cap_06_Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i, qtdPares = 0;
		double somaPares = 0, media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		N = sc.nextInt();
		
		int[] vetor = new int[N];
		
		for (i=0; i<N; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
			if (vetor[i] % 2 == 0) {
	 			somaPares = somaPares + vetor[i];
				qtdPares++;
			}
		}
		
		if (qtdPares == 0) {
			System.out.println("NENHUM NUMERO PAR");
		} else {
			media = (double) somaPares/qtdPares;
			System.out.printf("MEDIA DOS PARES = %.1f\n", media);
		}
		
		sc.close();
	}
}
