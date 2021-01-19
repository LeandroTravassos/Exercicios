package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_007_Pagamento {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeFuncionario;
		Double valorHora, horasTrabalhadas, pagamento;
		
		System.out.print("Digite o nome do funcionário: ");
		nomeFuncionario = sc.nextLine();
		System.out.print("Digite o valor que " + nomeFuncionario + " deve receber por hora trabalhada: ");
		valorHora = sc.nextDouble();
		System.out.print("Digite quantas horas " + nomeFuncionario + " trabalhou: ");
		horasTrabalhadas = sc.nextDouble();
		
		pagamento = valorHora * horasTrabalhadas;
		
		System.out.println();
		System.out.println();
		System.out.println("_______________________________________________________");
		System.out.println();
		System.out.println();
		System.out.println("Nome: " + nomeFuncionario);
		System.out.printf("Valor por hora: %.2f %n", valorHora);
		System.out.printf("Horas trabalhadas: %.0f %n", horasTrabalhadas);
		System.out.printf("O pagamento para %s deve ser R$%.2f %n ", nomeFuncionario, pagamento); 
		
		
		sc.close();
	}
}
