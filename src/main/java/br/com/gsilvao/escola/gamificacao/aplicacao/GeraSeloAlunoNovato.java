package br.com.gsilvao.escola.gamificacao.aplicacao;

import br.com.gsilvao.escola.gamificacao.dominio.selo.Selo;
import br.com.gsilvao.escola.gamificacao.dominio.selo.SelosRepository;
import br.com.gsilvao.escola.shared.dominio.CPF;
import br.com.gsilvao.escola.shared.dominio.evento.Evento;
import br.com.gsilvao.escola.shared.dominio.evento.Ouvinte;
import br.com.gsilvao.escola.shared.dominio.evento.TipoDeEvento;

public class GeraSeloAlunoNovato extends Ouvinte {

	private final SelosRepository selosRepository;
	
	public GeraSeloAlunoNovato(SelosRepository selosRepository) {
		this.selosRepository = selosRepository;
	}
	
	@Override
	protected void reageAo(Evento evento) {
		CPF cpfDoAluno = (CPF) evento.informacoes().get("cpf");
		Selo novato = new Selo(cpfDoAluno, "Novato");
		selosRepository.adicionar(novato);
	}

	@Override
	protected boolean deveProcessar(Evento evento) {
		return evento.tipo() == TipoDeEvento.ALUNO_MATRICULADO;
	}

}
