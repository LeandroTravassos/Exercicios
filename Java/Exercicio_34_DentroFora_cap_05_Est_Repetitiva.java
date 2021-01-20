package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_34_DentroFora_cap_05_Est_Repetitiva {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, x, dentro = 0, fora = 0, i;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		for (i=1;i<=n;i++) {
			System.out.print("Digite um número: ");
			x = sc.nextInt();
			
			if (x>=10 && x<=20) {
				dentro++;
			} else {
				fora++;
			}
		}
		
		System.out.printf("%d Dentro %n", dentro);
		System.out.printf("%d Fora %n", fora);
		
		sc.close();
	}
}
