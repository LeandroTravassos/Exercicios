//Ler uma matriz quadrada de ordem N (máximo = 10), contendo números reais. Em seguida, fazer as
//seguintes ações:
//a) calcular e imprimir a soma de todos os elementos positivos da matriz.
//b) fazer a leitura do índice de uma linha da matriz e, daí, imprimir todos os elementos desta linha.
//c) fazer a leitura do índice de uma coluna da matriz e, daí, imprimir todos os elementos desta coluna.
//d) imprimir os elementos da diagonal principal da matriz.
//e) alterar a matriz elevando ao quadrado todos os números negativos da mesma. Em seguida imprimir
//   a matriz alterada.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_58_MatrizGeral_cap_07_Matrizes {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i, j, linha, coluna;
		double somaPositivos;
		
		System.out.print("Qual a ordem da matriz? ");
		N = sc.nextInt();
		
		double[][] matriz = new double[N][N];
		double[][] matrizAlt = new double[N][N];
		
		for (i=0; i<N; i++) {
			for (j=0; j<N; j++) {
				System.out.printf("Elemento [%d][%d]: ", i, j);
				matriz[i][j] = sc.nextDouble();
			}
		}
		
		somaPositivos = 0;
		
		for (i=0; i<N; i++) {
			for (j=0; j<N; j++) {
				if (matriz[i][j] > 0) {
					somaPositivos = somaPositivos + matriz[i][j];
				}
			}
		}
		
		System.out.printf("\nSOMA DOS POSITIVOS: %.1f\n\n", somaPositivos);
		
		System.out.print("Escolha uma linha: ");
		linha = sc.nextInt();
		
		System.out.print("Linha escolhida: ");
		for (j=0; j<N; j++) {
			System.out.printf("%.1f ", matriz[linha][j]);
		}
		
		System.out.println();
		System.out.println();
		System.out.print("Escolha uma coluna: ");
		coluna = sc.nextInt();
		
		System.out.print("Coluna escolhida: ");
		for (i=0; i<N; i++) {
			System.out.printf("%.1f ", matriz[i][coluna]);
		}	
		System.out.println();
		System.out.println();
		System.out.print("Diagonal Principal: ");
		for (i=0; i<N; i++) {
			for (j=0; j<N; j++) {
				if (i == j) {
					System.out.printf("%.1f ", matriz[i][j]);
				}
			}
		}
		
		System.out.println();
		System.out.println();
		
		for (i=0; i<N; i++) {
			for (j=0; j<N; j++) {
				if(matriz[i][j]<0) {
					matrizAlt[i][j] = Math.pow(matriz[i][j], 2);
				} else {
					matrizAlt[i][j] = matriz[i][j];
					}
			}
		}
		System.out.println("Matriz Alterada: ");
		for (i=0; i<N; i++) {
			for (j=0; j<N; j++) {
				System.out.printf("%.1f ", matrizAlt[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}
