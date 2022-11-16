package br.com.gsilvao.escola.aplicacao.aluno;

import br.com.gsilvao.escola.dominio.aluno.Aluno;
import br.com.gsilvao.escola.dominio.aluno.AlunosRepository;

public class MatricularAluno {
	
	private final AlunosRepository repositorio;
	
	public MatricularAluno(AlunosRepository repositorio) {
		this.repositorio = repositorio;
	}
	
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);
	}
}
