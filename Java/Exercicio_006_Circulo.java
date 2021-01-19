//Fazer um programa para ler o valor do raio de um círculo e calcular a área do círculo automáticamente a partir do valor do raio.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_006_Circulo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double r, areaCirculo;
		
		System.out.print("Digite o valor do raio do circulo: ");
		r = sc.nextDouble();
		
		areaCirculo = ( Math.PI * ( Math.pow(r, 2)));
		
		
		System.out.printf("Area %.3f %n", areaCirculo);
		
		
		sc.close();
	}
}
