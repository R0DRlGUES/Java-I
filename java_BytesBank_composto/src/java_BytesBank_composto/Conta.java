package java_BytesBank_composto;

	public class Conta {
		private double saldo;
		int agencia;
		int numero;
		Cliente titular;
		
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
	}
	


