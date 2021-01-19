package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_17_Dardo_cap_04_Condicionais {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double d1, d2, d3;
		
		System.out.println("Digite as três distâncias: ");
		d1 = sc.nextDouble();
		d2 = sc.nextDouble();
		d3 = sc.nextDouble();
		
		if (d1 > d2 && d1 > d3) {
				System.out.printf("MAIOR DISTÂNCIA = %.2f %n", d1);
			} else 
				if (d2 > d3) {
					System.out.printf("MAIOR DISTÂNCIA = %.2f %n", d2);
				} else 
						System.out.printf("MAIOR DISTÂNCIA = %.2f %n", d3);
		
		sc.close();
	}
}
