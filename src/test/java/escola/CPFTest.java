package escola;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CPFTest {

	@Test
	void naoDeveriaCriarCpfComNumerosInvalidos() {
		assertThrows(IllegalArgumentException.class, 
				() -> new CPF(null));

		assertThrows(IllegalArgumentException.class, 
				() -> new CPF(""));

		assertThrows(IllegalArgumentException.class, 
				() -> new CPF("12345678900"));
	}

}
