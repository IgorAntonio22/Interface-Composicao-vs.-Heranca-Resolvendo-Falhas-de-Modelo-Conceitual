package br.treino.heranca.versus.composicaoEInterface.Curso;

import br.treino.heranca.versus.composicaoEInterface.Funcionarios.Funcionario;

public class Curso {
	
	private String nomeDoCurso;
	private String areaDoCurso;
	private int cargaHorariaDoCurso;
	private double valorDoCurso;
	
	
	
	public Curso() {
		
	}
	
	
	public Curso(Curso curso, Turma turma, Funcionario professor, Aluno aluno) {
		System.out.println("Curso: " + curso);
		System.out.println("Turma: " + turma);
		System.out.println("Professor Responsável " + professor);
		System.out.println("Aluno: " + aluno);
	}
	
	@Override
	public String toString() {
		return "\nNome do curso:" + this.nomeDoCurso + 
				"\nArea do curso: " + this.areaDoCurso +
				"\nCarga horária do curso: " + this.cargaHorariaDoCurso + " horas" +
				"\nValor do curso: " + "R$" + this.valorDoCurso +"\n"
				;
	}
	
	public String getNomeDoCurso() {
		return nomeDoCurso;
	}
	public void setNomeDoCurso(String nomeDoCurso) {
		this.nomeDoCurso = nomeDoCurso;
	}
	public String getAreaDoCurso() {
		return areaDoCurso;
	}
	public void setAreaDoCurso(String areaDoCurso) {
		this.areaDoCurso = areaDoCurso;
	}
	public int getCargaHorariaDoCurso() {
		return cargaHorariaDoCurso;
	}
	public void setCargaHorariaDoCurso(int cargaHorariaDoCurso) {
		this.cargaHorariaDoCurso = cargaHorariaDoCurso;
	}
	public double getValorDoCurso() {
		return valorDoCurso;
	}
	public void setValorDoCurso(double valorDoCurso) {
		this.valorDoCurso = valorDoCurso;
	}
	
	
}
