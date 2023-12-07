package exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int opcao, quantidade;
		float valorTotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("# ## ### #### ##### MENU # ## ### #### #####");
		System.out.println("\n--Digite 1 para Cachorro Quente");
		System.out.println("--Digite 2 para X-Salada");
		System.out.println("--Digite 3 para X-Bacon");
		System.out.println("--Digite 4 para Bauru");
		System.out.println("--Digite 5 para Refrigerante");
		System.out.println("--Digite 6 para Suco de Laranja");
		opcao = leia.nextInt();
		
		System.out.println("Digite a quantidade desejada: ");
		quantidade =leia.nextInt();
		
		switch(opcao) {
		case 1: 
			valorTotal = 10* quantidade;
			System.out.println("Produto: Cachorro Quente \nValor total: " + valorTotal);
		break;
		case 2: 
			valorTotal = 15* quantidade;
			System.out.println("Produto: X-Salada \nValor total: " + valorTotal);
		break;
		case 3: 
			valorTotal = 18* quantidade;
			System.out.println("Produto: X-Bacon  \nValor total: " + valorTotal);
		break;
		case 4: 
			valorTotal = 12* quantidade;
			System.out.println("Produto: Bauru \nValor total: " + valorTotal);
		break;
		case 5: 
			valorTotal = 8* quantidade;
			System.out.println("Produto: Refrigerante \nValor total: " + valorTotal);
		break;
		case 6: 
			valorTotal = 13* quantidade;
			System.out.println("Produto: Suco de Laranja \nValor total: " + valorTotal);
		break;
		
		}
	}

}
