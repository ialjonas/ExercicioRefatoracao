package tests;

import business.*;
import persistence.Cliente;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClienteTest {

	private Cliente cl;

	@Before
	public void setUp() throws Exception {
		cl = new Cliente("Ial Jonas", "01531075029", 27, "M");
	}

	@Test
	public void testagetNome() {
		String nome = cl.getNome();
		assertEquals(nome, cl.getNome());
	}

	@Test
	public void testaSetNome() {
		cl.setNome("Jonas");
		String nome = cl.getNome();
		assertEquals(nome, cl.getNome());
	}

	@Test
	public void testaGetCPF() {
		String cpf = cl.getCpf();
		assertEquals(cpf, cl.getCpf());
	}

	@Test
	public void testaSetCPF() {
		cl.setCpf("12345");
		String cpf = cl.getCpf();
		assertEquals(cpf, cl.getCpf());
	}

	@Test
	public void testaGetIdade() {
		int idade = cl.getIdade();
		assertEquals(idade, cl.getIdade());
	}

	@Test
	public void testaSetIdade() {
		cl.setIdade(35);
		int idade = cl.getIdade();
		assertEquals(idade, cl.getIdade());
	}

}