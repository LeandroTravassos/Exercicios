package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_53_SomaLinhas_cap_07_Matrizes {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M, N, i, j;
		double soma;
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		M = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		N = sc.nextInt();
		
		double[][] matriz = new double[M][N];
		
		for (i=0; i<M; i++) {
			System.out.printf("Digite os elementos da %d° linha: \n", i+1);
			for (j=0; j<N; j++) {
				matriz[i][j] = sc.nextDouble();
			}
		}
		
		System.out.println("Vetor Gerado: ");
		
		for (i=0; i<M; i++) {
			soma = 0;
			
			for (j=0; j<N; j++) {
				soma = soma + matriz[i][j];
			}
			
			System.out.printf("%.1f\n", soma);
		}
		
		sc.close();
	}
}
