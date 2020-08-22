package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		Produto produto = new Produto("Bala Juquinha", .15);
		System.out.println("Eu gosto muito de " + produto.getNome() + "que custa : R$ "+ produto.getPreco());
		System.out.println("Hello World!");
	}
}
