package ExerciciosDeRepeticao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		int idade, sexo, opcao;
		int contPC = 0, contMN = 0, contHA = 0, contOC = 0, contN40 = 0, contC18 = 0, contInt = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		System.out.println("Digite seu sexo dentre as op��es: ");
		System.out.println("1- Feminino/ 2- Masculino / 3- Outros ");
		sexo = leia.nextInt();

		System.out.println("Digite seu sexo dentre as op��es: ");
		System.out.println("1- Calma/ 2- Nervosa / 3- Agressiva ");
		opcao = leia.nextInt();

		contInt++;

		if (opcao == 1) {
			contPC++;
		}
		if (sexo == 1 && opcao == 2) {
			contMN++;
		}
		if (sexo == 2 && opcao == 3) {
			contHA++;
		}
		if (sexo == 3 && opcao == 1) {

		}
		if (idade > 40 && opcao == 2) {
			contN40++;
		}
		if (idade < 18 && opcao == 2) {
			contC18++;
		}
		contInt++;

		while (contInt < 150 && idade >= 1 && sexo >= 1 && sexo <= 3 && opcao >= 1 && opcao <= 3) {
			contInt++;

			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();

			System.out.println("Digite seu sexo dentre as op��es: ");
			System.out.println("1- Feminino/ 2- Masculino / 3- Outros ");
			sexo = leia.nextInt();

			System.out.println("Digite seu sexo dentre as op��es: ");
			System.out.println("1- Calma/ 2- Nervosa / 3- Agressiva ");
			opcao = leia.nextInt();

			if (opcao == 1) {
				contPC++;
			}
			if (sexo == 1 && opcao == 2) {
				contMN++;
			}
			if (sexo == 2 && opcao == 3) {
				contHA++;
			}
			if (sexo == 3 && opcao == 1) {

			}
			if (idade > 40 && opcao == 2) {
				contN40++;
			}
			if (idade < 18 && opcao == 2) {
				contC18++;
			}
			contInt++;
		}
		System.out.println("O n�mero de pessoas calmas: " + contPC);
		System.out.println("O n�mero de mulheres nervosas: " + contMN);
		System.out.println("O n�mero de homens agressivos: " + contHA);
		System.out.println("O n�mero de outros calmos: " + contOC);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos: " + contN40);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos: " + contC18);

	}

}
