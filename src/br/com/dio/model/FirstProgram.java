package br.com.dio.model;

//import br.com.dio.model.Gato;

public class FirstProgram {
	
	public static void main (String args[]) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		System.out.println(gato);
		System.out.println(livros);
	}

}


class Livros {
	public String nome;
	public String pagina;
}