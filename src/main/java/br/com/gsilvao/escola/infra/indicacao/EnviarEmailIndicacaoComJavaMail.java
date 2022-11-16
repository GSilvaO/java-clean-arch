package br.com.gsilvao.escola.infra.indicacao;

import java.util.List;

import br.com.gsilvao.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.gsilvao.escola.dominio.aluno.Aluno;
import br.com.gsilvao.escola.dominio.aluno.AlunosRepository;
import br.com.gsilvao.escola.dominio.aluno.CPF;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

	@Override
	public void enviarPara(Aluno indicado) {
		
	}
}
