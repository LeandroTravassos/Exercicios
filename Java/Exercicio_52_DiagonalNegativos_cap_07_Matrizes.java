//Fazer um programa para ler um número inteiro N (máximo = 10) e uma matriz quadrada de ordem N
//contendo números inteiros. Em seguida, mostrar a diagonal principal e a quantidade de valores
//negativos da matriz.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_52_DiagonalNegativos_cap_07_Matrizes {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i, j, qtdNegativos;
		
		System.out.print("Qual a ordem da matriz? ");
		N = sc.nextInt();
		
		int[][] matriz = new int[N][N];
		
		for (i=0; i<N; i++) {
			for (j=0; j<N; j++) {
				System.out.printf("Elemento[%d,%d] ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal Principal: ");
		
		for (i = 0; i<N; i++) {
			for (j = 0; j<N; j++) {
				if(i == j) {
				System.out.printf("%d ", matriz[i][j]);
				}
			}
		}
		
		qtdNegativos = 0;
				
		for (i=0; i<N; i++) {
			for(j=0; j<N; j++) {
				if (matriz[i][j] < 0) {
					qtdNegativos++;
				}
			}
		}
		
		System.out.printf("\nQUANTIDADE DE NEGATIVOS = %d\n", qtdNegativos);
		
		sc.close();
	}
}
