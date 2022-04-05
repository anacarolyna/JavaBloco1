package ExerciciosDeRepeticao;

import java.util.Scanner;
/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */
public class Exercicio2For {
	public static void main(String[] args) {
	int impar=0, par=0;
	Scanner ler = new Scanner(System.in);
	for(int n=1; n<=11; n++) 
	{
		System.out.println("Digite 10 números: ");
		n = ler.nextInt();
		
		if (n%2==0) {
			par++;
		}
		
		else if (n%2!=0) {
			impar++;
		}
		
	}
	     System.out.println("Quantidade de Pares: "+ par);
	     System.out.println("Quantidade de Ìmpares: "+ impar);
	}

}
