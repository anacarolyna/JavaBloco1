package ExerciciosMatrizEVetor;

import java.util.Random;

/*2-Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação. 
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
    	System.out.println("\nMédia aritmética: "+ soma/10); 
    	System.out.println("\nMaior pontuação: "+ maiorponto); 
    	System.out.println("\nQuantodade de ocorrências do maior número: "+ ocorrencias); 
	}
}
