package br.treino.heranca.versus.composicaoEInterface.Funcionarios;

import br.treino.heranca.versus.composicaoEInterface.Composicoes.Autenticacao;
import br.treino.heranca.versus.composicaoEInterface.Interfaces.Autenticavel;

public class Professor extends Funcionario implements Autenticavel {

	private Autenticacao autenticacao;
	private String materia;
	
	public Professor() {
		
	}
	
	public Professor(String usuario, String senha) {
		autenticacao = new Autenticacao();
		autenticar(usuario, senha);
	}
	
	@Override
	public String toString() {
		return "\nNome do professor: " + this.getNome() +
				"\nIdade do professor: " + this.getIdade() + " anos " +
				"\nCargo do professor: " + this.getCargo() + "\n"
				;
	}
	
	@Override
	public void autenticar(String usuario, String senha) {
		autenticacao.autenticar(usuario, senha);		
	}

	public Autenticacao getAutenticacao() {
		return autenticacao;
	}

	public void setAutenticacao(Autenticacao autenticacao) {
		this.autenticacao = autenticacao;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

}
