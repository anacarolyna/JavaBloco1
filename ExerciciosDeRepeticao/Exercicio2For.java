package ExerciciosDeRepeticao;

import java.util.Scanner;
/*Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */
public class Exercicio2For {
	public static void main(String[] args) {
	int impar=0, par=0;
	Scanner ler = new Scanner(System.in);
	for(int n=1; n<=11; n++) 
	{
		System.out.println("Digite 10 n�meros: ");
		n = ler.nextInt();
		
		if (n%2==0) {
			par++;
		}
		
		else if (n%2!=0) {
			impar++;
		}
		
	}
	     System.out.println("Quantidade de Pares: "+ par);
	     System.out.println("Quantidade de �mpares: "+ impar);
	}

}
