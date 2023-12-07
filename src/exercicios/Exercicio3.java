package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean primeiraD;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();

		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		System.out.println("Informe se é sua primeira vez doando: false/true ");
		primeiraD = leia.nextBoolean();

		if (idade >= 18 && idade <= 59) {
			System.out.println(nome + " está apto para doar sangue!");
		}

		else if ((idade >= 60 && idade <= 69) && primeiraD == false) {
			System.out.println(nome + " está apto para doar sangue!");
		} else {
			System.out.println(nome + " não está apto para doar sangue!");
		}
	}

}
