package br.com.gsilvao.escola.academico.dominio.aluno;

import java.util.List;

import br.com.gsilvao.escola.shared.dominio.CPF;

public interface AlunosRepository {
	
	void matricular(Aluno aluno);
	
	Aluno buscarPorCPF(CPF cpf);
	
	List<Aluno> listarTodosAlunosMatriculados();
}
