package ExerciciosDeRepeticao;

import java.util.Scanner;

/*
 * Escrever um programa que receba v?rios n?meros inteiros no teclado. E no
final imprimir a m?dia dos n?meros m?ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
 */
public class Exercicio6DoWhile {
	public static void main(String[] args) {
		int num, soma = 0, cont = 0, media, resto;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um n?mero: ");
			num = leia.nextInt();
			resto = num % 3;

			if (resto == 0 && num > 0) {
				soma += num;
				cont++;
			}
		} while (num != 0);
		media = soma / cont;

		System.out.println("A m?dia dos n?meros digitados ?" + media);

	}

}
