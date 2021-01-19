package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_22_TempoDeJogo_cap_04_Condicionais {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, tempoJogo;
		
		System.out.print("Hora inicial: ");
		horaInicial = sc.nextInt();
		System.out.print("Hora final: ");
		horaFinal = sc.nextInt();
		
		if (horaFinal <= horaInicial) {
			tempoJogo = 24-horaInicial+horaFinal;
		}	else {
				tempoJogo = horaFinal-horaInicial;
			}
		
		System.out.printf("O jogo durou %d hora(s)", tempoJogo);
		
		sc.close();
	}
}
