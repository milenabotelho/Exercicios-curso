package estrutura_condicional;

import java.util.Scanner;

public class Exercicio02 {

	//Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.//
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		 System.out.println("Informe um n�mero: ");
		 numero = sc.nextInt();
		 
		 if(numero % 2 == 0) {
			 System.out.println("O numero � par : "+numero);
		 }else {
			 System.out.println("O numero � impar : "+numero);
			 
		 }
	sc.close();	 
	}

}
