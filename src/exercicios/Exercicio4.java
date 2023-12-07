 package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		String n1, n2, n3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira palavra: ");
		n1 = leia.nextLine();
		
		System.out.println("Digite a segunda palavra: ");
		n2 = leia.nextLine();
		
		System.out.println("Digite a terceira palavra: ");
		n3 = leia.nextLine();
		
		if(n1.equalsIgnoreCase("vertebrado")) {
			if(n2.equalsIgnoreCase("ave")) {
				if(n3.equalsIgnoreCase("carnivoro")) {
					System.out.println("aguia");
				} else {
					System.out.println("pomba");
				}
				
			}
		}
		
		if(n1.equalsIgnoreCase("vertebrado")) {
			if(n2.equalsIgnoreCase("mamifero")) {
				if(n3.equalsIgnoreCase("onivoro")) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
				
			}
		}
		
		if(n1.equalsIgnoreCase("invertebrado")) {
			if(n2.equalsIgnoreCase("inseto")) {
				if(n3.equalsIgnoreCase("hematofogo")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
				
			}
		}
		
		if(n1.equalsIgnoreCase("invertebrado")) {
			if(n2.equalsIgnoreCase("anelideo")) {
				if(n3.equalsIgnoreCase("hematofogo")) {
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}
			}
		}

	}

}
