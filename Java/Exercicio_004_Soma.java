// Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes
// n�meros.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_004_Soma {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int x, y, soma;
		
		
		System.out.print("Digite o valor de X: ");
		x = sc.nextInt();
		System.out.print("Digite o valor de Y: ");
		y = sc.nextInt();
		
		soma = (x + y);
		
		System.out.printf("O resultado da soma de %s e %s � %s.", x, y, soma);
		
		sc.close();
	}
	
}
