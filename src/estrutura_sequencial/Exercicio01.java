package estrutura_sequencial;

import java.util.Scanner;

public class Exercicio01 {

	//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
	//mensagem explicativa, conforme exemplos.//
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2,soma;
		System.out.println("Informe o primeiro numero:");
		numero1 = sc.nextInt();
		System.out.println("Informe o segundo numero:");;
		numero2 = sc.nextInt();
		
		soma = numero1 + numero2;
		
		
		System.out.println("Soma :"+soma);
		sc.close();
	}
	
	

}


