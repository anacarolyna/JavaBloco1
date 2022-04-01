import java.util.Scanner;

public class Exercicio1 {

	
	
	public static void main(String[] args) {
	
    	int n1, n2, n3;
    	
    	Scanner leia = new Scanner(System.in);
    	
    	System.out.print("Digite o primeiro número: ");
    	n1 = leia.nextInt();
    	
    	System.out.print("Digite o segundo número: ");
    	n2 = leia.nextInt();
    	
    	System.out.print("Digite o terceiro número: ");
    	n3 = leia.nextInt();
    	
    	if (n1>n2 && n1>n3) {
    		System.out.println("O maior número é: "+ n1);
    		
    	}
    	else if (n2>n1 && n2>n3) {
    		System.out.println("O maior número é: "+ n2);
    	}
    	else if (n3>n1 && n3>n2) {
    		System.out.println("O maior número é: "+ n3);
    	}
    	
	}
}
