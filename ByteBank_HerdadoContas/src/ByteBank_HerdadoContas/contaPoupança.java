package ByteBank_HerdadoContas;

public class contaPoupança extends Conta {
	
	public contaPoupança(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor, Conta destino) {
		super.saldo += super.saldo;
		
	}
		
	
}
