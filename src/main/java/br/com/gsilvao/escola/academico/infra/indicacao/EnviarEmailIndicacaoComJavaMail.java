package br.com.gsilvao.escola.academico.infra.indicacao;

import java.util.List;

import br.com.gsilvao.escola.academico.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.gsilvao.escola.academico.dominio.aluno.Aluno;
import br.com.gsilvao.escola.academico.dominio.aluno.AlunosRepository;
import br.com.gsilvao.escola.shared.dominio.CPF;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		
	}
}
