package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_46_AbaixoDaMedia_cap_06_Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i;
		double soma = 0, media;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		N = sc.nextInt();
		
		double[] vetor = new double[N];
		
		for (i=0; i<N; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			soma = soma + vetor[i];
		}
		
		media = soma/N;
		
		System.out.printf("\nMEDIA DO VETOR = %.3f\n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for (i=0; i<N; i++) {
			if (vetor[i]<media) {
			System.out.printf("%.1f\n", vetor[i]);
			}
		}
		
		sc.close();
	}
}
