package ByteBank_HerdadoContas;


public class testeSaca {

    
	public static void main(String[] args) {
	    Conta conta = new Conta(123, 321);
	
	    conta.deposita(200.0, conta);
	    try {
	        conta.saca(210.0);
	    } catch(SaldoInsuficienteException ex) {
	        System.out.println("Ex: " + ex.getMessage());
	    }
	    System.out.println(conta.getSaldo());
}
	}