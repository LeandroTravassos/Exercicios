// Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma
// casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida,
// o programa deve mostrar o valor da �rea do terreno, bem como o valor do pre�o do terreno, ambos com
// duas casas decimais, conforme exemplo.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_001_Terreno {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, valorMetro, area, precoTerreno;
		
		System.out.print("Digite a largura do terreno: ");
		largura = sc.nextDouble();
		System.out.print("Digite o comprimento do terreno: ");
		comprimento = sc.nextDouble();
		System.out.print("Digite o valor do metro quadrado: ");
		valorMetro = sc.nextDouble();
		
		area = (largura * comprimento);
		precoTerreno = (area * valorMetro);
		
		System.out.println("________________________________");
		System.out.println();
		System.out.printf("Largura do terreno: %.1f %n", largura);
		System.out.printf("Comprimento do terreno: %.1f %n", comprimento);
		System.out.printf("Valor do metro quadrado: R$%.2f %n", valorMetro);
		System.out.printf("Area do terreno: %.2f %n", area);
		System.out.printf("Pre�o do terreno: R$%.2f %n", precoTerreno);
		
		sc.close();
	}
	
}
