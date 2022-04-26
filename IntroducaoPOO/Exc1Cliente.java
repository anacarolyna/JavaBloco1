package IntroducaoPOO;

/*1 Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informaçõees deste objeto no console.
 * 
 */
public class Exc1Cliente {
	// ATRIBUTOS -> CARACTERISTICAS
	private String primeiroNome;
	private String ultimoNome;
	private String nomesDoMeio;
	private int idade;

	public Exc1Cliente(String primeiro, String meio, String ultimo) {
		primeiroNome = primeiro;
		nomesDoMeio = meio;
		ultimoNome = ultimo;
		idade = 44;
	}

	// M�TODOS -> COMPORTAMENTOS
	public String getNomeCompleto() {
		String nomeCompleto = primeiroNome + "" + nomesDoMeio + "" + ultimoNome + ". Idade: " + idade;
		return nomeCompleto;
	}

}
