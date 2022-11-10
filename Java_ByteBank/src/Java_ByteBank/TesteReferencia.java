package Java_ByteBank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("saldo Pirmeira conta " + primeiraConta.saldo);
		
		// Copia a referencia para o primeiro objeto 
		Conta segundaConta = primeiraConta;
		
		System.out.println("Saldo da segunda conta "+ segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da segunda conta "+ segundaConta.saldo);
		System.out.println("Saldo da primeira conta "+ primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São iguaiisssssss!!");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		

	}
}
