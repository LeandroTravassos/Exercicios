package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_008_Consumo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double distancia, combustivel, consumoMedio;
		
		System.out.print("Digite a distância percorrida em km: ");
		distancia = sc.nextDouble();
		System.out.print("Digite quanto combustível foi gasto: ");
		combustivel = sc.nextDouble();
		
		
		consumoMedio = distancia / combustivel;
		
		System.out.println();
		System.out.println();
		System.out.println("_______________________________________________________");
		System.out.println();
		System.out.println();
		System.out.printf("Distância percorrida: %.0f %n", distancia);
		System.out.printf("Combustivel gasto: %.1f %n", combustivel);
		System.out.printf("Consumo medio: %.3f %n", consumoMedio);
		
		
		
		sc.close();
	}
}
