package br.treino.heranca.versus.composicaoEInterface.Curso;

public class Aluno {

	private String nomeDoAluno;
	private String matricula;
	private String email;
	
	public Aluno() {
		
	}
	
	@Override
	public String toString() {
		return "\nNome do aluno: " + this.nomeDoAluno +
				"\nMatrícula: " + this.matricula +
				"\nE-mail: " + this.email + "\n"
				;
		
	}
	
	
	public String getNomeDoAluno() {
		return nomeDoAluno;
	}
	public void setNomeDoAluno(String nomeDoAluno) {
		this.nomeDoAluno = nomeDoAluno;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
