package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_42_Alturas_cap_06_Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i, menor16 = 0;
		double somaAlt = 0, mediaAlt, pMenor16;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		N = sc.nextInt();
		
		
		String[] nome = new String[N];
		int[] idade = new int[N];
		double[] altura = new double[N];
		
		System.out.println();
		
		for (i = 0; i < N; i++) {
			System.out.printf("Dados da %da pessoa: \n", i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();	
		
			somaAlt = somaAlt + altura[i];
		
			if (idade[i] < 16) {
				menor16++;
				
			}
		
		}
		
		mediaAlt = somaAlt/N;
		System.out.printf("\nAltura média: %.2f\n", mediaAlt);
		pMenor16 = (double)menor16/N*100;
		System.out.printf("Pessoas com menos de 16 anos: %.1f\n", pMenor16);
		
		for (i = 0; i < N; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		
		sc.close();
	}
}
