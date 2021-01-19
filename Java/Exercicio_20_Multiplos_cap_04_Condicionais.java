package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_20_Multiplos_cap_04_Condicionais {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Digite dois números inteiros: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		if ((n1%n2 == 0) || (n2%n1 == 0)) {
			System.out.print("São múltiplos");
		} else {
			System.out.println("Não são múltiplos");
		}
		
		sc.close();
	}
}
