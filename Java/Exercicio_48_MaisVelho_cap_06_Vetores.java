//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_48_MaisVelho_cap_06_Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i, maiorIdade = 0;
		String maisVelho = null;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		N = sc.nextInt();
		
		String[] nome = new String[N];
		int[] idade = new int[N];
		
		for (i=0; i<N; i++) {
			System.out.printf("Dados da %d° pessoa: \n", (i+1));
			
			System.out.print("Nome: ");
			nome[i] = sc.next();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		
			if (idade[i]>maiorIdade) {
				maiorIdade = idade[i];
				maisVelho = nome[i];
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s\n", maisVelho);		
		
		sc.close();
	}
}