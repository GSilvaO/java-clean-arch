package br.com.gsilvao.escola.aplicacao.indicacao;

import br.com.gsilvao.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {
	
	void enviarPara(Aluno indicado);
}
