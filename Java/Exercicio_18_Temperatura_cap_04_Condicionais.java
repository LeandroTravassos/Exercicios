package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_18_Temperatura_cap_04_Condicionais {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
			char escala;
			double tempC, tempF;
		
			System.out.print("Você vai digitar a temperatura em qual escala (C/F) ? ");
			escala = sc.next().charAt(0);
			
			if (escala == 'C') {
				System.out.print("Digite a temperatura em Celsius: ");
				tempC = sc.nextDouble();
				
				tempF = (tempC*9/5)+32;
				System.out.printf("Temperatura equivalente em Fahrenheit: %.2f %n", tempF);	
			} else 
				if (escala == 'F') {
				System.out.print("Digite a temperatura em Fahrenheit: ");
				tempF = sc.nextDouble();
				
				tempC = (tempF-32)*5/9;
				System.out.printf("Temperatura equivalente em Celsius: %.2f %n", tempC);
				} else {
					System.out.print("Opção inválida. Reinicie o programa!");
				}
			
		sc.close();
	}
}
