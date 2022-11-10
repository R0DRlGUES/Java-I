package BytesBank_herdado;

public class EditorDeVideo extends Funcionario {
	
	
	public double getBonificacao() {//BonificaçãoFuncionario 10%
		  return super.getBonificacao()+100;	
	}
}
