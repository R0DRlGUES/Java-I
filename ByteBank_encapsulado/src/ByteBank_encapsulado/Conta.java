package ByteBank_encapsulado;

	public class Conta {
		private double saldo;
		private int agencia;
		private int numero;
		private Cliente titular;
		
		public void deposita(double valor) {
			this.saldo += valor;
		}
		public boolean saca(double valor) {
			if(this.saldo >= valor) {
				this.saldo -= valor;
				System.out.println("Saque Aprovado");
				return true;
				
			} else {
				System.out.println("Saque Negado");
				return false;
			}
		}
		
		public boolean transfere(double valor, Conta destino) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				destino.deposita(valor);
				return true;
			} else {
				return false;
			}
		}
		public double getSaldo() {
			return this.saldo;
			}
		public double getNumero() {
			return this.numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		
		public int getAgencia() {
			return this.agencia;
		}
		public void setAgencia(int agencia) {
			this.agencia = agencia;
		}
		public void setTitular(Cliente titular) {
			this.titular = titular;

		}
		public Cliente getTitular() {
			return titular;
		}
		
	}