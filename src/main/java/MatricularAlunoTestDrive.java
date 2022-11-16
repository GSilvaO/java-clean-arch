import br.com.gsilvao.escola.aplicacao.aluno.MatricularAluno;
import br.com.gsilvao.escola.aplicacao.aluno.MatricularAlunoDto;
import br.com.gsilvao.escola.infra.aluno.AlunosRepositoryEmMemoria;

public class MatricularAlunoTestDrive {

	public static void main(String[] args) {
		String nome = "João Doe";
		String cpf = "123.456.789-00";
		String email = "joao@dominio.com";
		
		MatricularAluno matricular = new MatricularAluno(new AlunosRepositoryEmMemoria());
		matricular.executa(new MatricularAlunoDto(nome, cpf, email));
	}
}
