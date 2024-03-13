package br.treino.heranca.versus.composicaoEInterface.Funcionarios;

public abstract class Funcionario {

	private String nome;
	private String cargo;
	private int idade;
	private double salario;
	private int totalDeHorasTrabalhadas;
	
	public Funcionario() {
		
	}
	
	public void calcularSalarioPorHora(int quantidadeDeHoras, double valorDoSalario) {
		this.salario = quantidadeDeHoras * valorDoSalario;
		this.totalDeHorasTrabalhadas = quantidadeDeHoras;
	}
	
	public void getBonificacaoDeSalario() {
		if(this.totalDeHorasTrabalhadas > 170) {
			System.out.println("Funcionário recebeu bonificação!");
			System.out.println("Salário antes da bonificação: " + "R$" + this.salario);
			double salarioAnterior = this.salario;
			double bonus = 500;
			
			this.salario = this.salario + bonus;
			System.out.println("Salário depois da bonificação: " + "R$" + salarioAnterior + " + " +  "R$" + bonus + " = " + "R$" + this.salario 
					);	
		} else {
			System.out.println("Esse funcionário não atingiu as horas minimas para obter bonificação!");
		}
	}

	public void imprimeInformacoesDoFuncionario() {
		System.out.println(
				"\nNome do funcionário: " + this.nome  + 
				"\nCargo do funcionário: " + this.cargo +
				"\nIdade do funcionário: " + this.idade + " anos" + 
				"\nSalario do funcionário: " +  "R$" + this.salario +
				"\nTotal de horas trabalhadas: " + totalDeHorasTrabalhadas + " horas" + "\n"
				);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
