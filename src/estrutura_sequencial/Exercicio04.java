package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio04 {
	//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
	//hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
	//decimais.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float codigo,horas,vhora,valor;
		
		System.out.println("Informe o codigo do funcionario: ");
		codigo =sc.nextFloat();
		System.out.println("Qual o numero de  horas trabalhadas :");
		horas = sc.nextFloat();
		System.out.println("Qual o valor que recebe por hora trabalhada:");
		vhora= sc.nextFloat();
		
		valor = horas * vhora;
		
		System.out.println(" O numero do funcionario �:"+codigo);
		System.out.println("O valor do sal�rio � R$:"+valor);
		
		sc.close();
		

	}

}
