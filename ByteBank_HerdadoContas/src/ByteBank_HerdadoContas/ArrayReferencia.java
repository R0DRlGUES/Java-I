package ByteBank_HerdadoContas;

public class ArrayReferencia {
	public static void main(String[] args) {
		
		
		Conta[] referencias = new Conta[5];
		
		contaCorrente cc1 = new contaCorrente(22,11);
		referencias[0]=cc1;
		contaPoupança cc2 = new contaPoupança(22,22);
		referencias[1]=cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		//System.out.println(cc2.getNumero());
//		Object referenciaGenerica = contas[1];
//		System.out.println(contas[1].getNumero());
		
		contaPoupança ref =(contaPoupança) referencias[1];// type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
		
		
		
	}

}
