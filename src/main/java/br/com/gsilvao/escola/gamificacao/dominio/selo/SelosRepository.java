package br.com.gsilvao.escola.gamificacao.dominio.selo;

import java.util.List;

import br.com.gsilvao.escola.academico.dominio.aluno.CPF;

public interface SelosRepository {

	void adicionar(Selo selo);
	List<Selo> selodDoAlunoDeCPF(CPF cpf);
}
