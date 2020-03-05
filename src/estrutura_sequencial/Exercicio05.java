package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		Scanner sc = new Scanner(System.in);
		
		float codigo1,n1,valor1,codigo2,n2,valor2, soma;
		
		System.out.println("Informe o codigo da peça 1:");
		codigo1 =sc.nextFloat();
		System.out.println("Informe o numero da peça 1:");
		n1 = sc.nextFloat();
		System.out.println("Informe o valor unitario de cada peça 1");
		valor1 = sc.nextFloat();
		System.out.println("Informe o codigo da peça 2:");
		codigo2 =sc.nextFloat();
		System.out.println("Informe o numero da peça 2:");
		n2 = sc.nextFloat();
		System.out.println("Informe o valor unitario de cada peça 2");
		valor2 = sc.nextFloat();
		
		soma = valor1 * n1 + valor2 * n2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", soma);
		
		sc.close();
		
		
		
	}

}
