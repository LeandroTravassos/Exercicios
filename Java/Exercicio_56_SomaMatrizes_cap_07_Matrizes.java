//Fazer um programa para ler duas matrizes de números inteiros A e B, contendo de M linhas e N colunas
//cada (M e N máximo = 10). Depois, gerar uma terceira matriz C onde cada elemento desta é a soma
//dos elementos correspondentes das matrizes originais. Imprimir na tela a matriz gerada.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_56_SomaMatrizes_cap_07_Matrizes {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M, N, i, j;
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		M = sc.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		N = sc.nextInt();
		
		int[][] matA = new int[M][N];
		int[][] matB = new int[M][N];
		int[][] matC = new int[M][N];
		
		System.out.println("Digite os valores da matriz A: ");
		
		for (i=0; i<M; i++) {
			for (j=0; j<N; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matA[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite os valores da matriz B: ");
		
		for (i=0; i<M; i++) {
			for (j=0; j<N; j++) {
				System.out.printf("Elemento [%d,%d]: ", i, j);
				matB[i][j] = sc.nextInt();
			}
		}
		
		for (i=0; i<M; i++) {
			for (j=0; j<N; j++) {
				matC[i][j] = matA[i][j] + matB[i][j];
			}
		}
		
		System.out.println("Matriz Soma: ");
		
		for (i=0; i<M; i++) {
			for (j=0; j<N; j++) {
				System.out.printf("%d ", matC[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
