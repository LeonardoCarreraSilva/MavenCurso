package br.com.alura.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProdutoTest {
	@Test
	public void verificaImposto() {
		Produto bala = new Produto("Bala Juquinha", .10);
		assertEquals(0.11 , bala.getProdutoImposto(), 0.00001);
	}
}
