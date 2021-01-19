package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_24_Coordenadas_cap_05_Est_Repetitiva {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite dois números: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != y) {
			if (x < y) {
				System.out.println("Crescente!");				
			} else {
				System.out.println("Decrescente!");
			}
			
			System.out.println("Digite outros dois números: ");
			x = sc.nextInt();
			y = sc.nextInt();	
		} 
		
		System.out.print("Fim do Programa!");
		
		sc.close();
	}
}
