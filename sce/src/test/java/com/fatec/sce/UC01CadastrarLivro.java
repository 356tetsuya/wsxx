package com.fatec.sce;

import static org.junit.Assert.*;
import org.junit.Test;
import com.fatec.sce.model.Livro;



public class UC01CadastrarLivro {

	// @Test
	// public void CT01CadastrarLivroComDadosValidos() {
	// try {
	// // cenario
	// Livro umLivro = new Livro();
	// // acao
	// umLivro.setIsbn("121212");
	// umLivro.setTitulo("Engenharia de Softwar");
	// umLivro.setAutor("Pressman");
	// } catch (RuntimeException e) {
	// // verificacao
	// fail("nao deve falhar");
	// }
	// }
	
	/**
	* Objetivo - Verificar o comportamento da aplicação com ISBN em branco.
	**/

	@Test
	public void CT02CadastrarLivroComISBN_em_branco() {
		// cenario
		Livro livro = new Livro();
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		try {
			// acao
			livro.setIsbn("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	
	/**
	* Objetivo - Verificar o comportamento da aplicação com ISBN nulo.
	**/

	@Test
	public void CT03CadastrarLivroComISBN_nulo() {
		// cenario
		Livro livro = new Livro();
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		try {
			// acao
			livro.setIsbn(null);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	
	/**
	* Objetivo - Verificar o comportamento da aplicação com Autor nulo.
	**/

	@Test
	public void CT04cadastrarLivroComAutor_Nulo() {
		// cenario
		Livro livro = new Livro();
		livro.setTitulo("Engenharia de Software");
		livro.setIsbn("121213");
		try {
			// acao
			livro.setAutor(null);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Autor invalido", e.getMessage());
		}
	}

	/**
	* Objetivo - Verificar o comportamento da aplicação com Autor em branco.
	**/
	
	@Test
	public void CT05cadastrarLivroComAutor_em_branco() {
		// cenario
		Livro livro = new Livro();
		livro.setTitulo("Engenharia de Software");
		livro.setIsbn("121215");
		try {
			// acao
			livro.setAutor("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Autor invalido", e.getMessage());
		}
	}

	/**
	* Objetivo - Verificar o comportamento da aplicação com Titulo em branco.
	**/
	
	@Test
	public void CT02cadastrarLivroComTitulo_em_branco() {
		// cenario
		Livro livro = new Livro();
		livro.setIsbn("121216");
		livro.setAutor("Pressman");
		try {
			// acao
			livro.setTitulo("");
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Titulo invalido", e.getMessage());
		}
	}

	/**
	* Objetivo - Verificar o comportamento da aplicação com Titulo nulo.
	**/
	
	@Test
	public void CT03cadastrarLivroComTitulo_nulo() {
		// cenario
		Livro livro = new Livro();
		livro.setIsbn("121218");
		livro.setAutor("Pressman");
		try {
			// acao
			livro.setTitulo(null);
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Titulo invalido", e.getMessage());
		}
	}
	
	/**
	* Objetivo - Verificar o comportamento da aplicação com Titulo correto.
	**/

	@Test
	public void CT03cadastrarLivro_com_Titulo_sucesso() {
		// cenario
		Livro livro = new Livro();
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		livro.setIsbn("121212");

		assertEquals("Engenharia de Software", livro.getTitulo());
	}

	/**
	* Objetivo - Verificar o comportamento da aplicação com ISBN correto.
	**/
	
	@Test
	public void CT03cadastrarLivro_com_Isbn_sucesso() {
		// cenario
		Livro livro = new Livro();
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		livro.setIsbn("121212");

		assertEquals("121212", livro.getIsbn());
	}

	/**
	* Objetivo - Verificar o comportamento da aplicação com autor correto.
	**/
	
	@Test
	public void CT03cadastrarLivro_com_Autor_sucesso() {
		// cenario
		Livro livro = new Livro();
		livro.setTitulo("Engenharia de Software");
		livro.setAutor("Pressman");
		livro.setIsbn("121212");

		assertEquals("Pressman", livro.getAutor());
	}
	
//Refatorando com Data Builder (evitar redundancia)
	
	/**
	* Objetivo - Verificar o comportamento da aplicação com inserção válida
	**/
	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
			// cenario
			Livro umLivro;
			// acao
			umLivro = ObtemLivro.comDadosValidos();
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}

	/**
	* Objetivo - Verificar o comportamento da aplicação com ISBN em branco.
	**/
	
	@Test
	public void CT02cadastrarLivroComISBN_em_branco() {
		try {
			// cenario
			Livro livro;
			// acao
			livro = ObtemLivro.comISBNInvalido_branco();
			fail("deveria lançar uma exceção");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
}
