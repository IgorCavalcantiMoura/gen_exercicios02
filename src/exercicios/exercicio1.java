package exercicios;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		int a, b, c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor de A: ");
		a = leia.nextInt();
		
		System.out.println("Entre com o valor de B: ");
		b = leia.nextInt();
		
		System.out.println("Entre com o valor de C: ");
		c = leia.nextInt();
		
		if((a+b)>c) {
			System.out.println("A soma de A + B é maior que C");
		}
		
		if((a+b)==c) {
			System.out.println("A soma de A + B é igual a C");
		}
		
		if((a+b)<c) {
			System.out.println("A soma de A + B é menor que C");
		}
	}

}
