package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_30_ParesConsecutivos_cap_05_Est_Repetitiva {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, soma;
		
		
		System.out.print("Digite um número inteiro: ");
		n = sc.nextInt();
		
		while (n != 0) {
			if (n % 2 == 0) {
				soma = n + (n+2) + (n+4) + (n+6) + (n+8);
				System.out.printf("Soma = %d %n", soma);
			} else {
				soma = (n+1) + (n+3) + (n+5) + (n+7) + (n+9);
				System.out.printf("Soma = %d %n", soma);
			}
			
			System.out.print("Digite um número inteiro: ");
			n = sc.nextInt();
		
		}
		
		sc.close();
	}
}
