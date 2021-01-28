//Ler dois números M e N (máximo = 10), e depois ler uma matriz MxN de números inteiros, conforme
//exemplo. Em seguida, mostrar na tela somente os números negativos da matriz.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_54_NegativosMatriz_cap_07_Matrizes {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int M, N, i, j;
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		M = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		N = sc.nextInt();
		
		int[][] matriz = new int[M][N];
		
		for (i=0; i<M; i++) {
			for (j=0; j<N; j++) {
				System.out.printf("Elemento [%d][%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Valores Negativos: ");
		
		for (i=0; i<M; i++) {
			for (j=0; j<N; j++) {
				if (matriz[i][j] < 0) {
					System.out.printf("%d\n", matriz[i][j]);
				}
			}
		}
		
		
		sc.close();
	}
}
