package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_11_Notas_cap_04_Condicionais {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, notaFinal;
		
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		notaFinal = nota1 + nota2;
		
		System.out.printf("NOTA FINAL = %.1f %n", notaFinal);
		
		if (notaFinal < 60.00) {
			System.out.print("REPROVADO");
		}
		
		
		
		sc.close();
	}
}
