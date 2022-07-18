package dio;

import dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato Gato = new Gato("Pitico","Azul",12);
		Livros Livros = new Livros();	
		
		System.out.println(Gato);
		System.out.println(Livros);
		System.out.println(Livros);
		/*int a = 20;
		int b = 10;
	
		System.out.println("Hello world gareula! " + (a+b));*/
	}

}

class Livros {
	private String nome;
	private String npag;
	private String Pito;
}