package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio17 {

	public static void main(String[] args) {

		/*
		 * Soma de Números Pares: Solicite ao usuário que insira números inteiros até
		 * que ele insira um número ímpar. Em seguida, calcule a soma dos números pares
		 * inseridos.
		 */

		int soma = 0;

		int[] numerosPares = new int[5];

		int entradaUsuario = 0;

		do {

			for (int i = 0; i < numerosPares.length; i++) {

				try {
					numerosPares[i] = entradaUsuario = Integer

							.parseInt(JOptionPane.showInputDialog(null, "Digite um número par"));

					if (numerosPares[i] < 0) {
						JOptionPane.showMessageDialog(null,

								"Você pode digitar apenas números INTEIROS POSITIVOS \n ERRO");

					}
				} catch (NumberFormatException e) {

					JOptionPane.showMessageDialog(null, "Você pode digitar apenas números nesse campo \n ERRO");
				}

				soma += numerosPares[i];

				if (numerosPares[i] % 2 == 1) {

					JOptionPane.showMessageDialog(null, "Você digitou um número impar, fim da aplicação");
					break;

				} else if (numerosPares[i] % 2 == 0) {

					System.out.print("Soma de todos os valores pares " + soma + " ");
					break;

				}

			}

		}

		while (entradaUsuario % 2 == 0); // Enquanto a entrada do Usuario for igual a um numero par.
	}

}
