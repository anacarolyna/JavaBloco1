package ExerciciosDeRepeticao;
import java.util.Scanner;
/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
 * 
 */
public class Exercicio5 {
   public static void main(String[] args) {
   int n1, soma=0;
   Scanner leia = new Scanner(System.in);
   
   System.out.println("Digite um n�mero: ");
   n1 = leia.nextInt();

   do {
	   System.out.println("Digite um n�mero: ");
	   n1 = leia.nextInt();
	   soma +=n1;
	   
   }while (n1!=0);
   System.out.println("A soma dos n�meros digitados �: "+ soma);
}
}
