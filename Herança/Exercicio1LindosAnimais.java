package Herança;

public class Exercicio1LindosAnimais {
	public static void main(String[] args) {
		Exercicio1Cachorro dog = new Exercicio1Cachorro ();
		Exercicio1Cavalo horse = new  Exercicio1Cavalo();
		Exercicio1Preguica sloth = new Exercicio1Preguica();
		
		dog.correr();
		dog.somanimal();
		horse.galopar();
		horse.somanimal();
		sloth.subir();
		sloth.somanimal();
		
	}
}
