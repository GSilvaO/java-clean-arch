package br.com.gsilvao.escola.infra.aluno;

import java.util.List;

import br.com.gsilvao.escola.dominio.aluno.Aluno;
import br.com.gsilvao.escola.dominio.aluno.AlunosRepository;
import br.com.gsilvao.escola.dominio.aluno.CPF;

public class AlunosRepositoryEmMemoria implements AlunosRepository {

	@Override
	public void matricular(Aluno aluno) {
		// TODO Auto-generated method stub

	}

	@Override
	public Aluno buscarPorCPF(CPF cpf) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Aluno> listarTodosAlunosMatriculados() {
		// TODO Auto-generated method stub
		return null;
	}

}
