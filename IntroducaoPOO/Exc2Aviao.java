package IntroducaoPOO;

/*2 Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 * 
 */
public class Exc2Aviao {
	String cor = "Branco";
	double tamanho = 70;
	int capacidade = 400;

	public void entrada() {
		System.out.println("Viagem....");
	}

	public void estado() {
		System.out.println("Se preparando para a decolagem....");
	}

	public String getaviaoViajar() {
		String aviaoViajar = "Cor do avião: " + cor + " Tamanho:" + tamanho + " Capacidade: " + capacidade + " pessoas";
		return aviaoViajar;
	}

}
