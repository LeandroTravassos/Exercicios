package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_45_SomaVetores_cap_06_Vetores {
	public static void main(String[] agrs) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i;
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		N = sc.nextInt();
		
		int[] vetorA = new int[N];
		int[] vetorB = new int[N];
		int[] vetorC = new int[N];
		
		System.out.println("Digite os valores do vetor A: ");
		
		for (i=0; i<N; i++) {
			vetorA[i] = sc.nextInt();			
		}
		
		System.out.println("Digite os valores do vetor B: ");
		
		for (i=0; i<N; i++) {
			vetorB[i] = sc.nextInt();
			vetorC[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.println("VETOR RESULTANTE: ");
		
		for (i=0; i<N; i++) {
			System.out.printf("%d\n", vetorC[i]);
		}
		
		sc.close();
	}
}
