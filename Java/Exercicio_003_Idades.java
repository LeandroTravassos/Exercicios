// Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os
// nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo. 

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_003_Idades {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);   //--------------------------->   Define padrão americano, passando a usar ponto no lugar da vírgula.
	String nome1, nome2;
	int idade1, idade2;
	double media;
	
	System.out.print("Digite o nome da 1° pessoa : ");
	nome1 = sc.nextLine();
	System.out.print("Digite a idade da 1° pessoa: ");
	idade1 = sc.nextInt();
	sc.nextLine(); //--------------------------------------------->   Scanner para limpar o buffer do teclado
	System.out.print("Digite o nome da 2° pessoa : ");
	nome2 = sc.nextLine();
	System.out.print("Digite a idade da 2° pessoa: ");
	idade2 = sc.nextInt();
	
	media = ((idade1 + idade2) / 2.0);
	
	System.out.println("_______________________________");
	System.out.println();
	System.out.println("Dados da primeira pessoa: ");
	System.out.println("Nome: " + nome1);
	System.out.println("Idade: " + idade1);
	System.out.println();
	System.out.println("Dados da segunda pessoa: ");
	System.out.println("Nome: " + nome2);
	System.out.println("Idade: " + idade2);
	System.out.println();
	
	System.out.printf("A idade média de %s e %s é de %.1f anos! %n", nome1, nome2, media);
	
	sc.close();
	
	}
}
