package ExerciciosDeRepeticao;

import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
	int idade, cont21=0, cont50=0;	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite sua idade: ");
	idade = ler.nextInt();
	
	while (idade != -99) 
	{
		if (idade < 21) 
		{
			cont21++;
		}
		if (idade > 50) 
		{
			cont50++;
		}
		System.out.println("Digite sua idade: ");
		idade = ler.nextInt();
	}
	  System.out.println("Pessoas com menos de 21: "+cont21);
	  System.out.println("Pessoas com mais de 50: "+cont50);
	}

}
