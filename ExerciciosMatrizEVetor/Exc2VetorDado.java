package ExerciciosMatrizEVetor;

import java.util.Random;

/*2-Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
quantas foram as ocorr�ncias da maior pontua��o. 
	*/
public class Exc2VetorDado {
     public static void main(String[] args) {
	 int vet[] = new int [10];
	 int soma=0, num, maiorponto=0, ocorrencias=0;
	 Random s = new Random();
  
    	
      for (num=0; num<10; num++) {
    	  vet[num] = s.nextInt(6) + 1;
    	  System.out.print(" Soteio: "+ vet[num]);
    
    	  soma+=vet[num];
    	  
    	  if(vet[num]>maiorponto) {
    		maiorponto=vet[num];  
    	  }
      }
      for (num=0; num<10; num++) {
    	  if (vet[num]==maiorponto);
    	  ocorrencias++;
      }
    	System.out.println("\nM�dia aritm�tica: "+ soma/10); 
    	System.out.println("\nMaior pontua��o: "+ maiorponto); 
    	System.out.println("\nQuantodade de ocorr�ncias do maior n�mero: "+ ocorrencias); 
	}
}
