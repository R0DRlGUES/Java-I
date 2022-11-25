package ByteBank_HerdadoContas;

public class contaCorrente extends Conta {
	
	public contaCorrente(int agencia, int numero) {
		super(agencia, numero);
		
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double cobrancaDeSque = valor + 0.2;
		super.saca(cobrancaDeSque);
	}

	@Override
	public void deposita(double valor, Conta destino) {
		        super.saldo += valor;
		   
	}

}
