package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio03 {
	
	//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto
	//de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).//

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 int A,B,C,D;
		 
		 System.out.println("Informe o valor de A:");
		 A = sc.nextInt();
		 System.out.println("Informe o valor de B:");
		 B = sc.nextInt();
		 System.out.println("Informe o valor de C:");
		 C = sc.nextInt();
		 System.out.println("Informe o valor de D:");
		 D = sc.nextInt();
		 
		 int diferenca = (A *B - C* D );
		 
		 System.out.println(" A diferen�a entre o produto de A e B por C e D � :"+ diferenca);
		 
		 sc.close();
		 
	}

}
