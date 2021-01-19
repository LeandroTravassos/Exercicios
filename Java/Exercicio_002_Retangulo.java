// Fazer um programa para ler as medidas da base e altura de um ret�ngulo. Em seguida, mostrar o valor
// da �rea, per�metro e diagonal deste ret�ngulo, com quatro casas decimais, conforme exemplos.

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_002_Retangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);	//Altera o padr�o de local para US, com isso passa a ser usado ponto onde antes era v�rgula.
		
		double B, H, A, P, D;
		
		System.out.print("Digite o valor da base do ret�ngulo: ");
		B = sc.nextDouble();
		System.out.print("Digite o valor da altura do ret�ngulo: ");
		H = sc.nextDouble();
		
		A = B * H ;
		P = 2 * (B + H);
		D = (Math.sqrt(Math.pow(B, 2) + Math.pow(H, 2))); 			//Math.sqrt(x) � o operador matem�tico de raiz quadrada
																	//Math.pow(x, y) � o operador matem�tico de pot�ncia (x elevado a y)
		System.out.println("Base do ret�ngulo: " + B);
		System.out.println("Altura do ret�ngulo: " + H);
		System.out.printf("�rea = %.4f %n", A);							//%.2f - pega o argumento e imprime com 2 casas depois da v�rgula.
		System.out.printf("Per�metro = %.4f %n", P);
		System.out.printf("Diagonal = %.4f %n", D);					//%n - passa para a pr�xima linha (equivalente ao println()).
				
		
		sc.close();
		
	}
	
}
