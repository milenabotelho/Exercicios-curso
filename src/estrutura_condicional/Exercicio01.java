package estrutura_condicional;

import java.util.Scanner;

public class Exercicio01 {
	
//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.//
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Informe um n�mero:");
		numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.println("O numero informado � negativo: "+numero);
			
		}else {
			System.out.println("O numero  � positivo : "+numero);
			
		}
		sc.close();
	}

}
