package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_25_MediaIdades_cap_05_Est_Repetitiva {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade, n = 0;
		double mediaIdades, somaIdades = 0;
		
		System.out.println("Digite as idades: ");
		idade = sc.nextInt();
		
		if (idade<0) {
			System.out.println("Impossível calcular!");
		} else {
			while (idade >= 0) {
				n++;
				somaIdades = somaIdades + idade;
				idade = sc.nextInt();
			}
			
			mediaIdades = somaIdades/n;
			System.out.printf("Média = %.2f ", mediaIdades);
		
		}
		
		
		sc.close();
	}
}
