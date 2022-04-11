package ExerciciosMatrizEVetor;

import java.util.Scanner;

/*4-crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
*/
public class Exc4Matriz3x3 {
	public static void main(String[] args) {
		int mat[][] = new int[3][3];
		int soma = 0, somadiag = 0, val, linha, coluna, x = 0;
		Scanner leia = new Scanner(System.in);

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {
				System.out.println("Digite os valores: ");
				val = leia.nextInt();

				mat[linha][coluna] = val;
				soma = soma + mat[linha][coluna];
			}
			for (linha = 0; x < 3; x++) {
				for (coluna = 0; x < 3; x++) {
					somadiag = somadiag + mat[x][x];
				}
				System.out.println("\nSoma Diagonal: " + somadiag);
				System.out.println("\nSoma Matriz: " + soma);

			}
		}
	}

}
