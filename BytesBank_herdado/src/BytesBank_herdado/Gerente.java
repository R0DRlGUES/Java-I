package BytesBank_herdado;

public class Gerente extends Funcionario {
	
	private int senha;	
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}
	public double getBonificacao() {//BonificaçãoFuncionario 10%
		  return super.getBonificacao()+super.getSalario();	
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}


	
}
