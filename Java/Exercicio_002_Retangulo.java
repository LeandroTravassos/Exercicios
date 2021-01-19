// Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor
// da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_002_Retangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);	//Altera o padrão de local para US, com isso passa a ser usado ponto onde antes era vírgula.
		
		double B, H, A, P, D;
		
		System.out.print("Digite o valor da base do retângulo: ");
		B = sc.nextDouble();
		System.out.print("Digite o valor da altura do retângulo: ");
		H = sc.nextDouble();
		
		A = B * H ;
		P = 2 * (B + H);
		D = (Math.sqrt(Math.pow(B, 2) + Math.pow(H, 2))); 			//Math.sqrt(x) é o operador matemático de raiz quadrada
																	//Math.pow(x, y) é o operador matemático de potência (x elevado a y)
		System.out.println("Base do retângulo: " + B);
		System.out.println("Altura do retângulo: " + H);
		System.out.printf("Área = %.4f %n", A);							//%.2f - pega o argumento e imprime com 2 casas depois da vírgula.
		System.out.printf("Perímetro = %.4f %n", P);
		System.out.printf("Diagonal = %.4f %n", D);					//%n - passa para a próxima linha (equivalente ao println()).
				
		
		sc.close();
		
	}
	
}
