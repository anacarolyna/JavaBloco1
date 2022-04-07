package IntroducaoPOO;
/*3 Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.
 */
public class Exc3Eletronico {
	 String fonedeOuvido="Fone de Ouvido", modelo="Auricular", marca="Samsung";
	 
	 public void som()
		{
			System.out.println("Ouvir música/escutar....");
		}
	 public void estado()
		{
			System.out.println("Fone de Ouvido em uso....");
		}
	 public String  getfone1() 
		{
			String fone=""+fonedeOuvido+" Modelo:"+modelo+" Marca: "+marca;
			return fone;
		}
		

}
