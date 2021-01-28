//Ler um inteiro N (máximo = 10) e uma matriz quadrada de ordem N
//contendo números inteiros. Mostrar a soma dos elementos acima da
//diagonal principal. Um exemplo de números acima da diagonal
//principal é mostrado ao lado (no caso as células com fundo cinza).

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_57_AcimaDiagonal_cap_07_Matrizes {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i, j, soma;
		
		System.out.print("Qual a ordem da matriz? ");
		N = sc.nextInt();
		
		int[][] matriz = new int[N][N];
		
		for (i=0; i<N; i++) {
			for (j=0; j<N; j++) {
				System.out.printf("Elemento [%d][%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}
		
		soma = 0;
		
		for (i=0; i<N; i++) {
			for (j=0; j<N; j++) {
				if (j>i) {
					soma = soma + matriz[i][j];
				}
			}
		}
		
		System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d\n", soma);
		
		sc.close();
	}
}
