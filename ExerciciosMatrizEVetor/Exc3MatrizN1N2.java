package ExerciciosMatrizEVetor;

import java.util.Random;

/*/3-Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
posição das matrizes N1 e N2.
  *
   */
public class Exc3MatrizN1N2 {
	public static void main(String[] args) {
		int N1[][] = new int[4][6];
		int N2[][] = new int[4][6];
		int M1[][] = new int[4][6];
		int M2[][] = new int[4][6];
		int linha, coluna;
		Random s = new Random();

		for (linha = 0; linha < 4; linha++) {
			for (coluna = 0; coluna < 6; coluna++) {
				N1[linha][coluna] = s.nextInt(10) + 1;
				N2[linha][coluna] = s.nextInt(10) + 1;

				System.out.print(N1[linha][coluna] + "\t");
				System.out.print(N2[linha][coluna] + "\t");
				System.out.println();
			}
			for (linha = 0; linha < 4; linha++) {
				for (coluna = 0; coluna < 6; coluna++) {
					M1[linha][coluna] += N1[linha][coluna] + N2[linha][coluna];
					M2[linha][coluna] += N1[linha][coluna] - N2[linha][coluna];
					
					if ((N1[linha][coluna]-N2[linha][coluna])<0) {
						M2[linha][coluna]*=-1;
					}
			          	
					System.out.print(""+M1[linha][coluna] + "\t");
					System.out.print(""+M2[linha][coluna] + "\t");
					System.out.println();
				}
			}

		}
	}
}
