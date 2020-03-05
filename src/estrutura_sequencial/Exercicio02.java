package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
	//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro//
	//casas decimais conforme exemplos.//
	//Fórmula da área: area = π . raio2//
	//Considere o valor de π = 3.14159//

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		float area, raio_circulo;
		
		
		
		System.out.println("Informe o valor do raio do circulo:");;
		raio_circulo = sc.nextFloat();
		
		area = (float) (3.14159 * (raio_circulo * raio_circulo));
		
		System.out.println("O valor da área do circulo é: "+ area);

		sc.close();
		
		
	}
		
		
	}


