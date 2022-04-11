package IntroducaoPOO;

import java.util.Scanner;

public class Exc6DadosConta {
	public static void main(String[] args) {
		Exc6ContaBancaria cont = new Exc6ContaBancaria();

		Scanner leia = new Scanner(System.in);

		cont.agencia = "Bradesco";
		cont.dono = "Gabriel";
		cont.tipoConta = true;

		System.out.print("Primeiramente, informe-nos seu saldo atual: ");
		cont.saldo = leia.nextDouble();

		cont.depositar();

		cont.sacar();

		cont.limite = cont.saldo * 0.20;

		cont.checagemDeConta();
	}

}
