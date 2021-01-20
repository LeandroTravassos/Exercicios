//Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números
//impares entre eles.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_32_SomaImpares_cap_05_Est_Repetitiva {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int X, Y, troca, i, soma = 0;
		
		System.out.println("Digite dois números inteiros:");
		X = sc.nextInt();
		Y = sc.nextInt();
		
		if (X>Y) {
			troca = X;
			X = Y;
			Y = troca;
		}
		
		
		for (i = X+1; i < Y; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.printf("Soma dos impares = %d %n", soma);
		
		sc.close();
	}
}
