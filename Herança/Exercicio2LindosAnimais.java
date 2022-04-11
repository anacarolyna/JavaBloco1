package Herança;
/*2)Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.
 */
public class Exercicio2LindosAnimais {
	public static void main(String[] args) {
		Exercicio1Cachorro dog = new Exercicio1Cachorro();
		Exercicio1Cavalo horse = new Exercicio1Cavalo();
		Exercicio1Preguica sloth = new Exercicio1Preguica();

		dog.correr();
		dog.somanimal();
		horse.galopar();
		horse.somanimal();
		sloth.subir();
		sloth.somanimal();

	}
}
