package com.fatec.sce;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fatec.sce.model.Livro;
import com.fatec.sce.model.Usuario;

public class UC02CadastrarUsuario {

	@Test
	public void CT01CadastrarUsuarioComDadosValidos() {
		try {
			// cenario
			Usuario usuario = new Usuario();
			// acao
			usuario.setRa("123456789");
			usuario.setNome("João");
			
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	@Test
	public void CT02CadastrarUsuarioComNome_em_branco() {
		// cenario
		Usuario usuario = new Usuario();
		usuario.setRa("123456789");
		try {
			// acao
			usuario.setNome("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	@Test
	public void CT02CadastrarUsuarioComRa_em_branco() {
		// cenario
		Usuario usuario = new Usuario();
		usuario.setNome("Joao");
		try {
			// acao
			usuario.setRa("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT02CadastrarUsuarioComNome_nulo() {
		// cenario
		Usuario usuario = new Usuario();
		usuario.setRa("123456789");
		try {
			// acao
			usuario.setNome(null);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	@Test
	public void CT02CadastrarUsuarioComRA_nulo() {
		// cenario
		Usuario usuario = new Usuario();
		usuario.setNome("Joao");
		try {
			// acao
			usuario.setRa(null);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT03cadastrarUsuario_com_Nome_sucesso() {
		// cenario
		Usuario usuario = new Usuario();
		usuario.setNome("Joao");
		usuario.setRa("123456789");
		
		assertEquals("Joao", usuario.getNome());
	}
	
	@Test
	public void CT03cadastrarUsuario_com_Ra_sucesso() {
		// cenario
		Usuario usuario = new Usuario();
		usuario.setNome("Joao");
		usuario.setRa("123456789");
		
		assertEquals("123456789", usuario.getRa());
	}

}
