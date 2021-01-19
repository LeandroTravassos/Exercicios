package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_010_Duracao {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempo, horas, minutos, segundos;
		
		System.out.print("Digite a duração em segundos: ");
		tempo = sc.nextInt();
		
		horas = tempo / 3600 ;
		minutos = ((tempo % 3600) / 60);
		segundos = (tempo - (horas*3600) - (minutos*60));
		
		
		System.out.print(horas + ":" + minutos + ":" + segundos);
		
		
		sc.close();
	}	
}
