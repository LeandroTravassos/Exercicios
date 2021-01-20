//Leia um valor inteiro N. Este valor ser� a quantidade de n�meros inteiros que ser�o lidos em seguida.
//Para cada valor lido, mostre uma mensagem dizendo se este valor lido � PAR ou IMPAR, e tamb�m
//se � POSITIVO ou NEGATIVO. No caso do valor ser igual a zero (0), seu programa dever� imprimir
//apenas NULO.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_35_ParImpar_cap_05_Est_Repetitiva {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, x, i;
		
		System.out.print("Quantos n�meros voc� vai digitar? ");
		n = sc.nextInt();
		
		for (i=1; i<=n; i++) {
			
			System.out.print("Digite um n�mero: ");
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
				System.out.println("�mpar Positivo");
				System.out.println();
			}
			
			if (x<0 && Math.abs(x)%2==0) {
				System.out.println("Par Negativo");
				System.out.println();
			} 
			
			if (x<0 && Math.abs(x)%2!=0) {
				System.out.println("�mpar Negativo");
				System.out.println();
			}
		}
		
		sc.close();
	}
}
