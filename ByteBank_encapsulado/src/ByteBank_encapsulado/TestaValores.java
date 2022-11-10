package ByteBank_encapsulado;

public class TestaValores {
	public static void main(String[] args) {
		int total =0;
		
		Conta conta = new Conta(1337, 24226);
		total++;
		
		System.out.println(conta.getAgencia());
		

		Conta conta2 = new Conta(1337, 244226);
		Conta conta3 = new Conta(234, 24254526);	
		
		System.out.println(Conta.getTotal());
			}
}
