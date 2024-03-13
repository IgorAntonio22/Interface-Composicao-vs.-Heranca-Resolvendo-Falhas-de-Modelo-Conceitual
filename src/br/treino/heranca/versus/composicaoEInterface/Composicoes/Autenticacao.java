package br.treino.heranca.versus.composicaoEInterface.Composicoes;

public class Autenticacao {
	
	private String usuarioLogin = "igorUsuario";
	private String senhaLogin = "igorSenha";
	
	public void autenticar(String usuario, String senha) {
		if(usuario == usuarioLogin && senha == senhaLogin) {
			System.out.println("\nUsuário autenticado com sucesso!\n");
		} else {
			System.out.println("\nFalha na autenticação do usuário :C\n");
		}
	}
}
