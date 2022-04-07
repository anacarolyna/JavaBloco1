package IntroducaoPOO;

import java.util.Scanner;

/*6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.
 */
public class Exc6ContaBancaria {
	// O que uma conta bancária tem?
	
		String agencia, dono;
		boolean tipoConta;
		double saldo, limite;
		double d, s;
		
		Scanner leia = new Scanner(System.in);
		
		public void checaTipoConta() {
			if (tipoConta == true) {
				System.out.println("Esta é uma conta corrente.");
			}
			else {
				System.out.println("Esta é uma conta poupança.");
			}
		}
		
		public void sacar() {
			if (saldo <= 0) {
				System.out.println("Você não tem grana, junte na próxima.");
			}
			else {
				System.out.println("Quando você quer sacar: ");
				s = leia.nextDouble();
				saldo -= s;
				// saldo = saldo - n
			}
		}
		
		public void depositar() {
			System.out.println("Quando você quer depositar: ");
			d = leia.nextDouble();
			saldo += d;
		}
		
		public void checagemDeConta() {
			System.out.println("A agência é: " + this.agencia);
			System.out.println("O dono da conta é: " + this.dono);
			System.out.println("O tipo da conta é corrente? " + this.tipoConta);
			System.out.println("Saldo da conta: " + String.format("%.3f", this.saldo));
			System.out.println("Limite diário: " + String.format("%.3f", this.limite));
		}
	}
	


