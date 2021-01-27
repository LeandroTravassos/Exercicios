//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//de homens.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_50_DadosPessoas_cap_06_Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i, totHomens = 0, totMulheres = 0;
		double maior, menor, somaAlturas = 0, media;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		N = sc.nextInt();
		
		double[] altura = new double[N];
		char[] genero = new char[N];
		
		for (i=0; i<N; i++) {
			System.out.printf("Altura da %d° pessoa: ", (i+1));
			altura[i] = sc.nextDouble();
			System.out.printf("Gênero da %d° pessoa: ", (i+1));
			genero[i] = sc.next().charAt(0);
		}
		
		menor = altura[0];
		maior = altura[0];
		
		for (i=0; i<N; i++) {
			
			if(altura[i]<menor) {
				menor = altura[i];
			}	
			
			if(altura[i]>maior) {
				maior = altura[i];
			} 
			
			if(genero[i] == 'F') {
				somaAlturas = somaAlturas + altura[i];
				totMulheres++;
			} 
			
			if(genero[i] == 'M') {
				totHomens++;
			}
		}

		media = somaAlturas/totMulheres;
		
		System.out.printf("Menor altura = %.2f\n", menor);
		System.out.printf("Maior altura = %.2f\n", maior);
		System.out.printf("Media das alturas das mulheres = %.2f\n", media);
		System.out.printf("Numero de homens = %d\n", totHomens);
		
		sc.close();
	}
}
