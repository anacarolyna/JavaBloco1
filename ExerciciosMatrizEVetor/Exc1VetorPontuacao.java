package ExerciciosMatrizEVetor;

import java.util.Scanner;

/*2.Faça um programa que crie um vetor por leitura com 5 
 * valores de pontuação de uma atividade e o 
 * escreva em seguida. Encontre após a maior pontuação e a apresente. 
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
		  
			System.out.println("\nMaior valor da pontuação: "+ valmaior);

		}


	}


