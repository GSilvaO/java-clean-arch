package br.com.gsilvao.escola.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.gsilvao.escola.dominio.aluno.Email;

class EmailTest {

	@Test
	void naoDeveriaCriarEmailsComEnderecosInvalidos() {
		assertThrows(IllegalArgumentException.class, 
				() -> new Email(null));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Email(""));
		
		assertThrows(IllegalArgumentException.class, 
				() -> new Email("emailinvalido"));
	}
	
	@Test
	void emailDeveriaSerCriadoComSucesso() {
		assertEquals("teste@domain.com", 
				new Email("teste@domain.com").getEndereco());
	}

}
