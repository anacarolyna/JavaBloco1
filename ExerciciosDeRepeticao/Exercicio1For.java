package ExerciciosDeRepeticao;

/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
 */
public class Exercicio1For {
	public static void main(String[] args) {
	System.out.println("Números de 1000 a 1999");
	for(int n=1000; n<=1999; n++) 
	if (n%11==5)
	{
		System.out.println("Divisão com resto igual a 5: "+n);
	
	}
	}

}
