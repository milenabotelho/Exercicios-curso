package estruturarepetitiva_while;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida. Para cada leitura de senha
		//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
		//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta � o valor 2002.
		
		int senha ;
		
		System.out.println("Informe a senha:");
		senha = sc.nextInt();
		
		while (senha == 2002) {
			System.out.println("Acesso permitido");
			
		}
		 
		
		System.out.println("Acesso negado");      
		sc.close();
	}
	
	
}
