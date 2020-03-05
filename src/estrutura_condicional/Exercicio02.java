package estrutura_condicional;

import java.util.Scanner;

public class Exercicio02 {

	//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.//
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		 System.out.println("Informe um número: ");
		 numero = sc.nextInt();
		 
		 if(numero % 2 == 0) {
			 System.out.println("O numero é par : "+numero);
		 }else {
			 System.out.println("O numero é impar : "+numero);
			 
		 }
	sc.close();	 
	}

}
