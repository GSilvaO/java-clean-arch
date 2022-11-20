package br.com.gsilvao.escola.academico.aplicacao.aluno;

import br.com.gsilvao.escola.academico.dominio.PublicadorDeEventos;
import br.com.gsilvao.escola.academico.dominio.aluno.Aluno;
import br.com.gsilvao.escola.academico.dominio.aluno.AlunoMatriculado;
import br.com.gsilvao.escola.academico.dominio.aluno.AlunosRepository;

public class MatricularAluno {
	
	private final AlunosRepository repositorio;
	private final PublicadorDeEventos publicador;
	
	public MatricularAluno(AlunosRepository repositorio, PublicadorDeEventos publicador) {
		this.repositorio = repositorio;
		this.publicador = publicador;
	}
	
	public void executa(MatricularAlunoDto dados) {
		Aluno novo = dados.criarAluno();
		repositorio.matricular(novo);
		
		AlunoMatriculado evento = new AlunoMatriculado(novo.getCpf());
		publicador.publicar(evento);
	}
}
