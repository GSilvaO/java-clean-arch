package br.com.gsilvao.escola.gamificacao.infra.selo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.gsilvao.escola.academico.dominio.aluno.CPF;
import br.com.gsilvao.escola.gamificacao.dominio.selo.Selo;
import br.com.gsilvao.escola.gamificacao.dominio.selo.SelosRepository;

public class SeloRepositoryEmMemoria implements SelosRepository{

	private List<Selo> selos = new ArrayList<>();
	
	@Override
	public void adicionar(Selo selo) {
		selos.add(selo);
	}

	@Override
	public List<Selo> selodDoAlunoDeCPF(CPF cpf) {
		return selos.stream()
				.filter(s -> s.getCpfDoAluno().equals(cpf.getNumero()))
				.collect(Collectors.toList());
	}

	
}
