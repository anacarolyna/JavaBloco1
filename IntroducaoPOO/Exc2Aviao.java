package IntroducaoPOO;

/*2 Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
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
		String aviaoViajar = "Cor do avi�o: " + cor + " Tamanho:" + tamanho + " Capacidade: " + capacidade + " pessoas";
		return aviaoViajar;
	}

}
