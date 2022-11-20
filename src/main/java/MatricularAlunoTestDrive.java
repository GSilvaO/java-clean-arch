import br.com.gsilvao.escola.academico.aplicacao.aluno.MatricularAluno;
import br.com.gsilvao.escola.academico.aplicacao.aluno.MatricularAlunoDto;
import br.com.gsilvao.escola.academico.dominio.PublicadorDeEventos;
import br.com.gsilvao.escola.academico.dominio.aluno.LogDeAlunoMatriculado;
import br.com.gsilvao.escola.academico.infra.aluno.AlunosRepositoryEmMemoria;

public class MatricularAlunoTestDrive {

	public static void main(String[] args) {
		String nome = "João Doe";
		String cpf = "123.456.789-00";
		String email = "joao@dominio.com";
		
		MatricularAlunoDto dto = new MatricularAlunoDto(nome, cpf, email);
		
		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogDeAlunoMatriculado());
		
		MatricularAluno matricular = new MatricularAluno(
				new AlunosRepositoryEmMemoria(),
				new PublicadorDeEventos());
		
		matricular.executa(dto);
	}
}
