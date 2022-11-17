package ByteBank_HerdadoContas;

public class contaCorrente extends Conta {
	
	public contaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override
	public boolean saca(double valor) {
		double cobrancaDeSque = valor + 0.2;
		return super.saca(cobrancaDeSque);
	}

	@Override
	public void deposita(double valor, Conta destino) {
		        super.saldo += valor;
		   
	}

}
