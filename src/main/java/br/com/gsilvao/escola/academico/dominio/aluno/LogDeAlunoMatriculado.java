package br.com.gsilvao.escola.academico.dominio.aluno;

import java.time.format.DateTimeFormatter;

import br.com.gsilvao.escola.shared.dominio.evento.Evento;
import br.com.gsilvao.escola.shared.dominio.evento.Ouvinte;
import br.com.gsilvao.escola.shared.dominio.evento.TipoDeEvento;

public class LogDeAlunoMatriculado extends Ouvinte {

	@Override
	protected void reageAo(Evento evento) {
		String momentoFormatado = evento.momento()
				.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		System.out.println(
				String.format(
						"Aluno com CPF %s matriculado em: %s", 
						((AlunoMatriculado) evento).getCpfDoAluno(),
						momentoFormatado));
	}

	@Override
	protected boolean deveProcessar(Evento evento) {
		return evento.tipo() == TipoDeEvento.ALUNO_MATRICULADO;
	}
}
