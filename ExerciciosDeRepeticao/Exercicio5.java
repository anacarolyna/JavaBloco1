package ExerciciosDeRepeticao;
import java.util.Scanner;
/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
 * 
 */
public class Exercicio5 {
   public static void main(String[] args) {
   int n1, soma=0;
   Scanner leia = new Scanner(System.in);
   
   System.out.println("Digite um número: ");
   n1 = leia.nextInt();

   do {
	   System.out.println("Digite um número: ");
	   n1 = leia.nextInt();
	   soma +=n1;
	   
   }while (n1!=0);
   System.out.println("A soma dos números digitados é: "+ soma);
}
}
