package Sobrecarga;

public class ControleTreino {
	public static void main(String[] args) {
	
		
		ExcClienteTreino c = new  ExcClienteTreino ();
		ExcClienteTreino c1 = new  ExcClienteTreino ("Jorge");
		ExcClienteTreino c2 = new  ExcClienteTreino ("Jorge ", "Campos ", 39);
		
		System.out.println(c2);
		
		
	}

}
