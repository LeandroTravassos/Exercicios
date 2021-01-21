package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_38_Fatorial_cap_05_Est_Repetitiva {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, fatorial;
		
		System.out.print("Digite o valor de N: ");
		n = sc.nextInt();
		
		fatorial = 1;
		
		for (i=n ; i>0; i--) {
				fatorial = fatorial*i;
			}
		
			System.out.printf("Fatorial = %d\n", fatorial);			
					
		sc.close();
	}
}
