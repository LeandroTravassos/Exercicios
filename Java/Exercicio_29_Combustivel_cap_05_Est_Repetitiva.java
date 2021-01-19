package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_29_Combustivel_cap_05_Est_Repetitiva {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, A = 0, G = 0, D = 0;
		
		System.out.print("Informe um código (1, 2, 3) ou 4 para parar: ");
		n = sc.nextInt();
		
		while (n != 4) {
			if (n == 1) {
			A++;
			} else 
			if (n == 2) {
			G++;	
			} else 
			if (n == 3) {
			D++;	
			} 
			System.out.print("Informe um código (1, 2, 3) ou 4 para parar: ");
			n = sc.nextInt();
			
		}
		
		System.out.printf("Muito Obrigado! %n");
		System.out.printf("Álcool: %d %n", A);
		System.out.printf("Gasolina: %d %n", G);
		System.out.printf("Diesel: %d %n", D);
		
		sc.close();
	}
}
