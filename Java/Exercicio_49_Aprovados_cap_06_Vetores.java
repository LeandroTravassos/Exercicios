//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1� e 2� semestres. Cada uma dessas informa��es deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja m�dia das notas seja maior ou
//igual a 6.0 (seis).

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_49_Aprovados_cap_06_Vetores {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, i;
		double media;
		
		System.out.print("Quantos alunos serao digitados? ");
		N = sc.nextInt();
		
		String[] nome = new String[N];
		double[] nota1 = new double[N];
		double[] nota2 = new double[N];
		
		for (i=0; i<N; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %d� aluno: \n", (i+1));
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();			
		}
		
		System.out.println("Alunos aprovados: ");
		
		for (i=0; i<N; i++) {
			
			media = (nota1[i]+nota2[i])/2;
			
			if (media >= 6) {
				System.out.printf("%s\n", nome[i]);
			}
		}
		
		sc.close();
	}
}
