package IntroducaoPOO;

/*7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
public class Exc7Paciente {
	String nome, causa;
	boolean sexo;
	int idade = 18;
	double peso = 68.00;

	public void checarSexo() {
		if (sexo == true) {
			System.out.println("O paciente é do sexo feminino.");
		} else {
			System.out.println("O paciente é do sexo masculino.");

		}
	}

	public void informacaoPaciente(String nome, String doenca, boolean sexo, int idade, double peso) {
		System.out.println("Nome do paciente: " + this.nome);
		System.out.println("Motivo da consulta: " + this.causa);
		System.out.println("Gênero do Paciente: " + this.sexo);
		System.out.println("A idade do paciente: " + this.idade);
		System.out.println("Peso do paciente: " + String.format("%.2f", this.peso));
	}

}
