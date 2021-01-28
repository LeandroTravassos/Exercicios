//Ler um inteiro N e uma matriz quadrada de ordem N (máximo = 10). Mostrar qual o maior elemento
//de cada linha. Suponha não haver empates.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_55_CadaLinha_cap_07_Matrizes {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i, j, maiorElemento;
		
		System.out.print("Qual a ordem da matriz? ");
		N = sc.nextInt();
		
		int[][] matriz = new int[N][N];
		
		for (i=0; i<N; i++) {
			for (j=0; j<N; j++) {
				System.out.printf("Elemento [%d][%d]: ", i, j);
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
		
		for (i=0; i<N; i++) {
			maiorElemento = matriz[i][0];
			for (j=1; j<N; j++) {
				if (matriz[i][j] > maiorElemento) {
					maiorElemento = matriz[i][j];
				}
			}
			System.out.printf("%d\n", maiorElemento);
		}
		sc.close();
	}
}
