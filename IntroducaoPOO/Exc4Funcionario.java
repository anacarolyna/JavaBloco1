package IntroducaoPOO;
/*4 Crie uma classe funcion�rio e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto funcion�rio, defina as
instancias deste objeto e apresente as informa��es deste objeto no
console.
 */
public class Exc4Funcionario {
	String nomeCompleto;
	String cargo;
	String departamento;
	int idade;
	
	public Exc4Funcionario (String nomecompleto, String funcao, String area, int idadee) 
	{
		nomeCompleto=nomecompleto;
		cargo=funcao;
		departamento=area;
		idade=27;
	}
	//M�TODOS -> COMPORTAMENTOS
	public String  getFuncionarioNome() 
	{
		String funcio="Nome completo: "+nomeCompleto+" Cargo: "+cargo+" Departamento: "+departamento+". Idade: "+ idade;
		return funcio;
	}
	
	

}
