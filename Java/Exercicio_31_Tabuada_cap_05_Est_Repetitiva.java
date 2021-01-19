package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_31_Tabuada_cap_05_Est_Repetitiva {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, resultado;
		
		System.out.print("Deseja a tabuada para qual valor? ");
		n = sc.nextInt();
		
		for (i = 1; i<=10; i++) {
			resultado = n*i;
			System.out.printf("%d x %d = %d %n", n, i, resultado);
			
			}

		sc.close();
	}	
}