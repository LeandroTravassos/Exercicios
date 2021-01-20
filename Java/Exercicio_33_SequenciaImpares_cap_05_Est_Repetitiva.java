//Leia um valor inteiro X. Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X,
//se for o caso.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_33_SequenciaImpares_cap_05_Est_Repetitiva {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int x, i;
		
		System.out.print("Digite o valor de X: ");
		x = sc.nextInt();
		
		if (x > 0) {
			for (i=1; i<=x; i++) {
				if (i % 2 != 0) {
					System.out.printf("%d %n", i);
				}
			}
		}
		
		sc.close();
	}
}
