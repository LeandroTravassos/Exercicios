package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_41_SomaVetor_cap_06_Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i;
		double soma = 0, media;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		N = sc.nextInt();
		
		double[] vetor = new double[N];
		System.out.println();
		
		for (i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextDouble();			
		}
		
		System.out.println();
		System.out.print("Valores = ");
		
		for(i = 0; i < N; i++) {
			System.out.printf("%.1f  ", vetor[i]);
			soma = soma + vetor[i];
		}
		
		System.out.printf("%nSoma = %.2f %n", soma);
		media = soma/N;
		System.out.printf("Media = %.2f %n", media);
		
		
		sc.close();
	}
}
