package ByteBank_HerdadoContas;

public class teste {

	public static void main(String[] args) {

		
		GuardadorDeContas guardador = new GuardadorDeContas();
		Conta cc = new contaCorrente(22, 11);
		guardador.adicionar(cc);
		
		Conta cc2 = new contaCorrente(22, 22);
		guardador.adicionar(cc2);
		
		int tamanho = guardador.getQuantidadeElementos();
		System.out.println(tamanho);
		
		Conta ref = guardador.getRegfetencia(1);
		System.out.println(ref.getNumero());
	}
	

}
