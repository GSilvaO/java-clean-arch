package br.com.gsilvao.escola.gamificacao.dominio.selo;

public class Selo {

	private String cpfDoAluno;
	private String nome;
	
	public Selo(String cpfDoAluno, String nome) {
		this.cpfDoAluno = cpfDoAluno;
		this.nome = nome;
	}
	
	public String getCpfDoAluno() {
		return cpfDoAluno;
	}
	
	public String getNome() {
		return nome;
	}
}
