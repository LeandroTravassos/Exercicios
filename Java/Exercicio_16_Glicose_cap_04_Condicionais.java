package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_16_Glicose_cap_04_Condicionais {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double glicose;
		
		System.out.print("Digite a medida de glicose: ");
		glicose = sc.nextDouble();
		
		if (glicose <= 100) {
			System.out.print("Classifica��o : Normal");
		} else 
			if (glicose > 100 && glicose <= 140) {
				System.out.print("Classifica��o : Elevado");
				} else {
					System.out.print("Classifica��o : Diabetes");
				}

		
		sc.close();
	}
}
