package br.com.gsilvao.escola.academico.aplicacao.indicacao;

import br.com.gsilvao.escola.academico.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);
}
