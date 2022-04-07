package IntroducaoPOO;
/*4 Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
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
	//MÉTODOS -> COMPORTAMENTOS
	public String  getFuncionarioNome() 
	{
		String funcio="Nome completo: "+nomeCompleto+" Cargo: "+cargo+" Departamento: "+departamento+". Idade: "+ idade;
		return funcio;
	}
	
	

}
