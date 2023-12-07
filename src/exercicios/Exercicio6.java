package exercicios;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int opcao, n1, n2, resultado; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("# ## ### #### ##### MENU # ## ### #### #####");
		System.out.println("\n--Digite 1 para SOMAR");
		System.out.println("--Digite 2 para SUBTRAIR");
		System.out.println("--Digite 3 para DIVIDIR");
		System.out.println("--Digite 4 para MULTIPLICAR");
		opcao = leia.nextInt();
		
		System.out.println("Digite N1: ");
		n1 =leia.nextInt();
		
		System.out.println("Digite N2: ");
		n2 =leia.nextInt();

		switch(opcao) {
		case 1: 
			resultado = n1 + n2;
			System.out.println("A soma de n1 com n2 é: " + resultado);
		break;
		case 2: 
			resultado = n1 - n2;
			System.out.println("A subtração de n1 com n2 é: " + resultado);
		break;
		case 3: 
			resultado = n1 / n2;
			System.out.println("A divisão de n1 com n2 é: " + resultado);
		break;
		case 4: 
			resultado = n1 * n2;
			System.out.println("A multiplicação de n1 com n2 é: " + resultado);
		break;
		default:
			System.out.println("Operação inválida");
		}
	
	}

}
