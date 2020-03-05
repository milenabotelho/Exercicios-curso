package estrutura_condicional;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		//seguir, calcule e mostre o valor da conta a pagar
     Scanner sc = new Scanner(System.in);
     
		  int codigo,quantidade =0 ;
		  double total = 0;
		  System.out.println("informe o codigo:");
		  codigo = sc.nextInt();
		  System.out.println("informe a quantidade:");
		  quantidade = sc.nextInt();
		  
		  
		  if(codigo == 1) {
			 total = quantidade * 4.00;
		  }
		  else if(codigo == 2) {
			total =  quantidade * 4.50;
			  
		  }
		  else if(codigo == 3) {
			  total = quantidade * 5.00;
			  
		  }
		  else if(codigo == 4) {
			  total = quantidade * 2.00;
			  
		  }
		  else if(codigo == 5) {
			  total = quantidade * 1.50;
			  
		  }
		  System.out.printf("Total a pagar: %.2f%n",total);
		  sc.close();
	}

	
}
