package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		//mostre:
		//a) a área do triângulo retângulo que tem A por base e C por altura.
		//b) a área do círculo de raio C. (pi = 3.14159)
		//c) a área do trapézio que tem A e B por bases e C por altura.
		//d) a área do quadrado que tem lado B.
		//e) a área do retângulo que tem lados A e B.
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		double A,B,C, triangulo, circulo,trapezio,quadrado,retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf(" A área do triangulo é %.3f%n",triangulo);
		System.out.printf(" A área do circulo é %.3f%n",circulo);
		System.out.printf(" A área do trapezio é %.3f%n",trapezio);
		System.out.printf(" A área do quadrado é %.3f%n",quadrado);
		System.out.printf(" A área do retangulo é %.3f%n",retangulo);
		sc.close();
	}

}
