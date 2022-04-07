package IntroducaoPOO;

import java.util.Scanner;

/*6) Crie uma classe conta bancaria e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informa��es deste objeto no
console.
 */
public class Exc6ContaBancaria {
	// O que uma conta banc�ria tem?
	
		String agencia, dono;
		boolean tipoConta;
		double saldo, limite;
		double d, s;
		
		Scanner leia = new Scanner(System.in);
		
		public void checaTipoConta() {
			if (tipoConta == true) {
				System.out.println("Esta � uma conta corrente.");
			}
			else {
				System.out.println("Esta � uma conta poupan�a.");
			}
		}
		
		public void sacar() {
			if (saldo <= 0) {
				System.out.println("Voc� n�o tem grana, junte na pr�xima.");
			}
			else {
				System.out.println("Quando voc� quer sacar: ");
				s = leia.nextDouble();
				saldo -= s;
				// saldo = saldo - n
			}
		}
		
		public void depositar() {
			System.out.println("Quando voc� quer depositar: ");
			d = leia.nextDouble();
			saldo += d;
		}
		
		public void checagemDeConta() {
			System.out.println("A ag�ncia �: " + this.agencia);
			System.out.println("O dono da conta �: " + this.dono);
			System.out.println("O tipo da conta � corrente? " + this.tipoConta);
			System.out.println("Saldo da conta: " + String.format("%.3f", this.saldo));
			System.out.println("Limite di�rio: " + String.format("%.3f", this.limite));
		}
	}
	


