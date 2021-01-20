//Problema "media_ponderada"
//Leia um valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de
//teste consiste de 3 valores reais, para os quais você deverá calcular e mostrar a média ponderada, sendo
//que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale lembrar
//que a média ponderada é a soma de todos os valores multiplicados pelo seu respectivo peso, dividida
//pela soma dos pesos.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_36_MediaPonderada_cap_05_Est_Repetitiva {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double a, b, c, mediaP;
		
		System.out.print("Quantos casos você vai digitar? ");
		n = sc.nextInt();
		
		for (i=1 ; i<=n ; i++) {
			System.out.println("Digite três números: ");
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			mediaP = (a*2+b*3+c*5)/10;
			
			System.out.printf("Média = %.1f\n", mediaP);
		}
		
		sc.close();
	}
}
