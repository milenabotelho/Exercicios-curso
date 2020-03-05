package estrutura_condicional;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
	//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
		//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
	//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
		
		
		Scanner sc = new Scanner(System.in);
		int valor;
		
		System.out.println("Informe um valor:");
		valor = sc.nextInt();
		
		if(valor <= 25) {
			System.out.println("intervalo entre [0,25]");
		}
		else if( valor <= 50.0) {
			System.out.println("Intervalo entre:[25,50]");
			
		}
		else if(valor <=75 ) {
			System.out.println("Intervalo entre: [50,75]");
			
		}
		else if(valor <=100) {
			System.out.println("Intervalo entre: [75,100]");
			
		}
		else if(valor < 0.0 || valor > 100.0) {
			System.out.println("Fora do intervalo");
			
			
		}
		sc.close();
      
	}

}
