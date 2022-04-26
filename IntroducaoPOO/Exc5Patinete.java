package IntroducaoPOO;

/*5 Crie uma classe patinete e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 */
public class Exc5Patinete {
	String tipo = "meio de transporte. ";
	String guidao = "";
	int rodas = 2;

	public void funcao() {
		System.out.println("Andando com minha dona......");
	}

	public void estado() {
		System.out.println("Em uso......");
	}

	public String getmeuPatinete() {
		String patin = "Patinete: " + tipo + " Guidão: se eleva até a altura da cintura" + guidao
				+ " Quantidade de rodas: " + rodas;
		return patin;
	}
}
