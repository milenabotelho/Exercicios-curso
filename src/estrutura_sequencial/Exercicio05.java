package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		//Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
		//c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
		
		Scanner sc = new Scanner(System.in);
		
		float codigo1,n1,valor1,codigo2,n2,valor2, soma;
		
		System.out.println("Informe o codigo da pe�a 1:");
		codigo1 =sc.nextFloat();
		System.out.println("Informe o numero da pe�a 1:");
		n1 = sc.nextFloat();
		System.out.println("Informe o valor unitario de cada pe�a 1");
		valor1 = sc.nextFloat();
		System.out.println("Informe o codigo da pe�a 2:");
		codigo2 =sc.nextFloat();
		System.out.println("Informe o numero da pe�a 2:");
		n2 = sc.nextFloat();
		System.out.println("Informe o valor unitario de cada pe�a 2");
		valor2 = sc.nextFloat();
		
		soma = valor1 * n1 + valor2 * n2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", soma);
		
		sc.close();
		
		
		
	}

}
