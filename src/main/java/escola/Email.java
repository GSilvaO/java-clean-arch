package escola;

public class Email {
	private String endereco;

	public Email(String endereco) {
		boolean isEmailValid = endereco.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
		if(endereco == null || !isEmailValid) {
			throw new IllegalArgumentException("E-mail inválido");
		}
		this.endereco = endereco;
	}
	
	
}
