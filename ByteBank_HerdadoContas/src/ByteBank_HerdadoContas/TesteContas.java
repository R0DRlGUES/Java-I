package ByteBank_HerdadoContas;

public class TesteContas {
	
	public static void main(String[] args) {
		
		
		contaCorrente CC = new contaCorrente(111, 111);
		CC.deposita(100, CC);
		
		contaPoupança CP = new contaPoupança(222, 222);
		CP.deposita(200, CP);
		
		CC.transfere(10.2, CP);
		
		
		System.out.println("CC: R$"+CC.getSaldo());
		System.out.println("CP: R$"+CP.getSaldo());
	}

}
