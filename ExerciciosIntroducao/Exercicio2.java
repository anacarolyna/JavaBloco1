import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		int a, b, c, troca;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite 3 números: ");

		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();

		if(a>b)
		  {
			troca=b;
			b=a;
			a=troca;
		  }
	    if (b>c)
		  {
			troca=c;
			c=b;
			b=troca;
		  }
		if(a>b)
		  {
			troca=b;
			b=a;
			a=troca;
		  }
		System.out.println(a+"\t"+b+"\t"+c);
	}
}
