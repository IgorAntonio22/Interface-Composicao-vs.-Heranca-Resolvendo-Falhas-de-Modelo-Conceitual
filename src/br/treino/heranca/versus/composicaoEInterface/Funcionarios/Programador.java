package br.treino.heranca.versus.composicaoEInterface.Funcionarios;

import br.treino.heranca.versus.composicaoEInterface.Composicoes.Autenticacao;
import br.treino.heranca.versus.composicaoEInterface.Interfaces.Autenticavel;

public class Programador extends Funcionario implements Autenticavel {
	
	private Autenticacao autenticacao;
	private String linguagemDeProgramacao;
	
	public Programador(String usuario, String senha) {
		autenticacao = new Autenticacao();
		autenticar(usuario, senha);
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

	public String getLinguagemDeProgramacao() {
		return linguagemDeProgramacao;
	}

	public void setLinguagemDeProgramacao(String linguagemDeProgramacao) {
		this.linguagemDeProgramacao = linguagemDeProgramacao;
	}
	
	

}
