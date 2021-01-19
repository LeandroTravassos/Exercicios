package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_26_SenhaFixa_cap_05_Est_Repetitiva {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha;
		
		System.out.print("Digite a senha: ");
		senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.print("Senha inválida! Tente novamente: ");
			senha = sc.nextInt();
		}
			System.out.println("Acesso permitido!");
			
		sc.close();
	}
}
