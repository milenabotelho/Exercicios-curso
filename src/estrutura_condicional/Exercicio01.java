package estrutura_condicional;

import java.util.Scanner;

public class Exercicio01 {
	
//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.//
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um número:");
		numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.println("O numero informado é negativo: "+numero);
			
		}else {
			System.out.println("O numero  é positivo : "+numero);
			
		}
		sc.close();
	}

}
