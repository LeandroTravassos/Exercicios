package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_009_Medidas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaQuadrado, areaTriangulo, areaTrapezio;
		
		System.out.print("Digite o valor da variável A: ");
		A = sc.nextDouble();
		System.out.print("Digite o valor da variável B: ");
		B = sc.nextDouble();
		System.out.print("Digite o valor da variável C: ");
		C = sc.nextDouble();
		
		areaQuadrado = A * A;
		areaTriangulo = A * B / 2;
		areaTrapezio = (A+B) * C / 2;
				
		System.out.println();
		System.out.println();
		System.out.println("______________________________________");
		System.out.println();
		System.out.println();
		
		System.out.println("Medida A = " + A);
		System.out.println("Medida A = " + B);
		System.out.println("Medida A = " + C);
		System.out.printf("Área do quadrado = %.4f %n", areaQuadrado);
		System.out.printf("Área do triângulo = %.4f %n", areaTriangulo);
		System.out.printf("Área do trapézio = %.4f %n", areaTrapezio);
		
		
		sc.close();
	}

}
