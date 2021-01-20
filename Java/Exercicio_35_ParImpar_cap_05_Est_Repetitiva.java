//Leia um valor inteiro N. Este valor será a quantidade de números inteiros que serão lidos em seguida.
//Para cada valor lido, mostre uma mensagem dizendo se este valor lido é PAR ou IMPAR, e também
//se é POSITIVO ou NEGATIVO. No caso do valor ser igual a zero (0), seu programa deverá imprimir
//apenas NULO.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_35_ParImpar_cap_05_Est_Repetitiva {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, x, i;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		for (i=1; i<=n; i++) {
			
			System.out.print("Digite um número: ");
			x = sc.nextInt();
			
			if (x==0) {
				System.out.println("Nulo");
				System.out.println();
			} 
			
			if (x>0 && x%2==0) {
				System.out.println("Par Positivo");
				System.out.println();
			}
			
			if (x>0 && x%2!=0) {
				System.out.println("Ímpar Positivo");
				System.out.println();
			}
			
			if (x<0 && Math.abs(x)%2==0) {
				System.out.println("Par Negativo");
				System.out.println();
			} 
			
			if (x<0 && Math.abs(x)%2!=0) {
				System.out.println("Ímpar Negativo");
				System.out.println();
			}
		}
		
		sc.close();
	}
}
