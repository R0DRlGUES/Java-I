package Java_ByteBank;
public class Java_ByteBank_main {
	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println("Primeira conta tem "+primeiraConta.saldo);
		System.out.println("Segunda conta tem "+segundaConta.saldo);
		
		System.out.println("Agencia : "+primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
		
		segundaConta.agencia = 146;
		System.out.println("Segunda conta está na agencia "+
							segundaConta.agencia);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São iguaiisssssss!!");
		}else {
			System.out.println("  F  ");
		}
		//referencia contas
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
	}
	
		
	}

