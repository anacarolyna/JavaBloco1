package ExerciciosMatrizEVetor;

import java.util.Scanner;

/*2.Fa�a um programa que crie um vetor por leitura com 5 
 * valores de pontua��o de uma atividade e o 
 * escreva em seguida. Encontre ap�s a maior pontua��o e a apresente. 
 */

public class Exc1VetorPontuacao {
	public static void main(String[] args) {
		int[] vet = new int[5]; // vetor vazio
		int valmaior = 0, val, linha;
		Scanner leia = new Scanner(System.in);

		for (linha = 0; linha < 5; linha++) {
			System.out.println("Escreva 5 valores: ");
			val = leia.nextInt();
			vet[linha] = val;

			if (vet[linha] > valmaior) {
				valmaior = vet[linha];

			}
			  

			}
		  
			System.out.println("\nMaior valor da pontua��o: "+ valmaior);

		}


	}


