package br.treino.heranca.versus.composicaoEInterface.Loaders;

import java.io.Console;
import java.sql.Date;
import java.time.LocalDate;

import br.treino.heranca.versus.composicaoEInterface.Curso.Aluno;
import br.treino.heranca.versus.composicaoEInterface.Curso.Curso;
import br.treino.heranca.versus.composicaoEInterface.Curso.Turma;
import br.treino.heranca.versus.composicaoEInterface.Funcionarios.Funcionario;
import br.treino.heranca.versus.composicaoEInterface.Funcionarios.Professor;
import br.treino.heranca.versus.composicaoEInterface.Funcionarios.Programador;
import br.treino.heranca.versus.composicaoEInterface.Interfaces.Autenticavel;

public class Main {

	public static void main(String[] args) {
	
		try {
			Funcionario programador01 = new Programador("igorLogin", "senha");
			Autenticavel programador02 = new Programador("igorUsuario", "igorSenha");
			
			programador01.setNome("Iguinho");
			programador01.setIdade(23);
			programador01.setCargo("Programador");
			programador01.calcularSalarioPorHora(176, 46);
			programador01.getBonificacaoDeSalario();
			programador01.imprimeInformacoesDoFuncionario();
			
			//---------------------------------------------------
			
			System.out.println("\n ----------------------------------------------------------- \n");
			
			
			Curso cursoDeIngles = new Curso();
			
			cursoDeIngles.setNomeDoCurso("Curso de inglês");
			cursoDeIngles.setAreaDoCurso("Inglês");
			cursoDeIngles.setCargaHorariaDoCurso(480);
			cursoDeIngles.setValorDoCurso(2000);
			
			Turma turmaDeIngles = new Turma();
			
			turmaDeIngles.setDataInicio(LocalDate.now());
			turmaDeIngles.setDataTermino(LocalDate.of(2025, 03, 13) );
			turmaDeIngles.setVagasDisponiveis(50);
			
			Funcionario professorTacio = new Professor();
			professorTacio.setNome("Tácio");
			professorTacio.setCargo("Professor de inglês");
			professorTacio.setIdade(45);
			professorTacio.setSalario(5000);
			
			Aluno alunoIgor = new Aluno();
			
			alunoIgor.setNomeDoAluno("Igor Antonio");
			alunoIgor.setMatricula("123456");
			alunoIgor.setEmail("igor@gmail.com");
			

			Curso Curso = new Curso(cursoDeIngles, turmaDeIngles,professorTacio,alunoIgor);
			
		} catch(Error e) {
			System.out.println(e);
		}
	}
}