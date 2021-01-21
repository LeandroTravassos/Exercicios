package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_39_Experiencias_cap_05_Est_Repetitiva {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, coelhos = 0, ratos = 0, sapos = 0, qtdCobaias, total, i;
		char tipoCobaia;
		double pCoelhos, pRatos, pSapos;
		
		System.out.print("Quantos casos de teste serão digitados? ");
		n = sc.nextInt();
		
		for (i=1; i<=n; i++) {
			System.out.print("Quantidade de cobaias: ");
			qtdCobaias = sc.nextInt();
			System.out.print("Tipo de cobaia: ");
			tipoCobaia = sc.next().charAt(0);
			
			if (tipoCobaia == 'C') {
				coelhos = coelhos + qtdCobaias;				
			} 
			else if (tipoCobaia == 'R') {
				ratos = ratos + qtdCobaias;				
			}
			else {
				sapos = sapos + qtdCobaias;				
			}
		}
		
		total = coelhos+ratos+sapos;
		pCoelhos = (double) coelhos*100/total;
		pRatos = (double) ratos*100/total;
		pSapos = (double) sapos*100/total;
		
		System.out.println();
		System.out.println("Relatório Final: ");
		System.out.printf("Total: %d Cobaias %n", total);
		System.out.printf("Total de coelhos: %d\n", coelhos);
		System.out.printf("Total de ratos: %d\n", ratos);
		System.out.printf("Total de sapos: %d\n", sapos);
		System.out.printf("Percentual de coelhos: %.2f\n", pCoelhos);
		System.out.printf("Percentual de ratos: %.2f\n", pRatos);
		System.out.printf("Percentual de sapos: %.2f\n", pSapos);		
		
		sc.close();
	}
}
