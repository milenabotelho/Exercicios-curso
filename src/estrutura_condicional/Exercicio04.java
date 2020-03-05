package estrutura_condicional;


import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
		//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		
		
		Scanner sc = new Scanner(System.in);
		
	float hora_inicio, hora_fim,duracao = 24;
	
	
	System.out.println("Informe a hora inicial do jogo:");
	hora_inicio = sc.nextFloat();
	System.out.println("Informe a hora final do jogo: ");
	hora_fim = sc.nextFloat();
	
	if( hora_inicio < hora_fim) {
		duracao = hora_fim - hora_inicio;
		
	}else {
		duracao = 24 - hora_inicio + hora_fim;
	}
	System.out.println("O jogo durou: "+ duracao);

	sc.close();
		
	}

	

}
