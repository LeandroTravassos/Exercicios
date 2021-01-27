//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero).

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_44_MaiorPosicao_cap_06_Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i, posicao = 0;
		double atual, maior;
		
		System.out.print("Quanto numeros voce vai digitar? ");
		N = sc.nextInt();
		
		double[] numeros = new double[N];
		
		for (i=0;i<N;i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}
		
		maior = numeros[0];
		
		for (i=0;i<N;i++) {
			
			atual = numeros[i];
			
			if (atual > maior) {
				 maior = atual;
				 posicao = i;
			}
		}
		
		System.out.printf("\nMAIOR VALOR = %.1f\n", maior);
		System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posicao);
		
		sc.close();
	}
}
