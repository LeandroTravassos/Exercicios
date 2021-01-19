package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_28_ValidacaoDeNota_cap_05_Est_Repetitiva {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n1, n2, media;
		
		System.out.print("Digite a primeira nota: ");
		n1 = sc.nextDouble();
		while (n1 < 0 || n1 > 10) {
		 System.out.print("Valor inv�lido! Digite novamente: ");
		 n1 = sc.nextDouble();
		}
		
		System.out.print("Digite a segunda nota: ");
		n2 = sc.nextDouble();
		while (n2 < 0 || n2 > 10) {
		System.out.print("Valor inv�lido! Digite novamente: ");
		n2 = sc.nextDouble();
		}
		
		media = (n1+n2)/2;
		System.out.printf("M�dia = %.2f", media);
		
		sc.close();
	}
}
