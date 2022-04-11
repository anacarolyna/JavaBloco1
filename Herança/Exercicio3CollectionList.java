package Herança;

import java.util.ArrayList;

/*3- Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 */
public class Exercicio3CollectionList {
        public static void main(String[] args) {
			String estoque1="Estoque1: 70";
			String estoque2="Estoque2: 100";
			
			
			ArrayList<String> estoques = new ArrayList<>();
			
			estoques.add(estoque1);
			estoques.add(estoque2);
		
			System.out.println(estoques);
			
			estoques.remove(1);
			
			System.out.println(estoques);
			
			estoques.add(estoque2);
			
			System.out.println(estoques);
			
			
		}   
}
