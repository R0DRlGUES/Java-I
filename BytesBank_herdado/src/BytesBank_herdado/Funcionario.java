package BytesBank_herdado;

public class Funcionario {
	
	private String nome;
	private String cpf;
	//publico para filhos protected
	 private double salario;
	
	
	
	public double getBonificacao() {//BonificaçãoFuncionario 10%
		
		return this.salario * 0.01;
		
	}
	
	//nome
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//cpf
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//salario
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
