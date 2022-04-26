package Sobrecarga;

/*SOBRECARGA: MÉTODOS COM O MESMO NOME MAS COM ASSINATURAS DIFERENTES
 * ASSINATURA: COMPOSTA PELO NOME E SEUS PARÂMETROS*/


public class ExcClienteTreino {
     String nome;
     String sobrenome;
     int idade;
     
     public ExcClienteTreino() {
    	 
     }
     
     public  ExcClienteTreino (String nome) {
    	 this.nome=nome;
    	 
     }
     public  ExcClienteTreino (int idade) {
    	 this.idade=idade;
    	 
     }
     
     public  ExcClienteTreino (String nome, String sobrenome, int idade) {
    	 this.nome=nome;
    	 this.sobrenome=sobrenome;
    	 this.idade=idade;
    	 
     }
     
     public String toString  () {
    	return nome+""+sobrenome+""+idade;
     }
     

}
