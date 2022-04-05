package ExerciciosDeRepeticao;

import java.util.Scanner;
/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 . o número de pessoas calmas;
 . o número de mulheres nervosas;
 . o número de homens agressivos;
 . o número de outros calmos;
 . o número de pessoas nervosas com mais de 40 anos;
 . o número de pessoas calmas com menos de 18 anos.
 */
public class Exercicio4While {
	public static void main(String[] args) {
		int idade, sexo, opcao;
		int contPC = 0, contMN = 0, contHA = 0, contOC = 0, contN40 = 0, contC18 = 0, contInt = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		System.out.println("Digite seu sexo dentre as opções: ");
		System.out.println("1- Feminino/ 2- Masculino / 3- Outros ");
		sexo = leia.nextInt();

		System.out.println("Digite seu sexo dentre as opções: ");
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

			System.out.println("Digite seu sexo dentre as opções: ");
			System.out.println("1- Feminino/ 2- Masculino / 3- Outros ");
			sexo = leia.nextInt();

			System.out.println("Digite seu sexo dentre as opções: ");
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
		System.out.println("O número de pessoas calmas: " + contPC);
		System.out.println("O número de mulheres nervosas: " + contMN);
		System.out.println("O número de homens agressivos: " + contHA);
		System.out.println("O número de outros calmos: " + contOC);
		System.out.println("O número de pessoas nervosas com mais de 40 anos: " + contN40);
		System.out.println("O número de pessoas calmas com menos de 18 anos: " + contC18);

	}

}
