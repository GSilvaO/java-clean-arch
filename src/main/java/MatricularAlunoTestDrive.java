import br.com.gsilvao.escola.aplicacao.aluno.MatricularAluno;
import br.com.gsilvao.escola.aplicacao.aluno.MatricularAlunoDto;
import br.com.gsilvao.escola.dominio.PublicadorDeEventos;
import br.com.gsilvao.escola.dominio.aluno.LogDeAlunoMatriculado;
import br.com.gsilvao.escola.infra.aluno.AlunosRepositoryEmMemoria;

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
