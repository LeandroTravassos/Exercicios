package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_21_Aumento_cap_04_Condicionais {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, novoSalario, aumento;
		int percentual;
		
		System.out.print("Digite o salário da pessoa: ");
		salario = sc.nextDouble();
		
		if (salario <= 1000.00) {			
			percentual = 20;
						
		}	else if (salario <= 3000.00) {				
				percentual = 15; 
								
			}	else if (salario <= 8000.00) {					
					percentual = 10;
		
				} else {
					percentual = 5;
					
				}		
		
					aumento = salario*percentual/100;
					novoSalario = salario+aumento; 
				System.out.printf("Novo salário = R$ %.2f %n", novoSalario);
				System.out.printf("Aumento = R$ %.2f %n", aumento);
				System.out.printf("Porcentagem = %s %%", percentual);			
		
		sc.close();
	}
}
