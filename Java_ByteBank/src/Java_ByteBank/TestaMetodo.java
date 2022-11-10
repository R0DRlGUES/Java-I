package Java_ByteBank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo);
		
		boolean ConseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(ConseguiuRetirar);

		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		// boolean sucessoT=
		//			contaDaMarcela.tranfere(300, contaDoPaulo);
		//if(sucessoT){
		
		if (contaDaMarcela.transfere(300, contaDoPaulo)) {
			System.out.println("Tranferencia Concluida.");
			System.out.println("Saldo atual: "+contaDaMarcela.saldo);
		}else {
			System.out.println("Tranferencia negada.");
		}
		//System.out.println("Conta Paulo: "+contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
		
		
	}

}
