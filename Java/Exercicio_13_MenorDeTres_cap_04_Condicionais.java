package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_13_MenorDeTres_cap_04_Condicionais {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		
		
		System.out.print("Primeiro valor: ");
		n1 = sc.nextInt();
		System.out.print("Segundo valor: ");
		n2 = sc.nextInt();
		System.out.print("Terceiro valor: ");
		n3 = sc.nextInt();
		
		if ((n1 < n2) && (n1 < n3)) {
			System.out.print("Menor = " + n1);
		}
			else if (n2 < n3) {
				System.out.print("Menor = " + n2);
			}
				else  {
					System.out.print("Menor = " + n3);
		}
		
		
		sc.close();
	}
}
