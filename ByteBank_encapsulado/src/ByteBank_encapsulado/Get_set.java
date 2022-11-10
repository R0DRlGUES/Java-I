package ByteBank_encapsulado;

public class Get_set {
		public static void main(String[] args) {
			Conta conta = new Conta();
			//conta.numero = 1331;
			conta.setNumero(1331);
			System.out.println(conta.getNumero());
			
			Cliente paulo = new Cliente();
			paulo.setNome("paulo Silveira");
			
			conta.setTitular(paulo);
			System.out.println(conta.getTitular().getNome());

			conta.getTitular().setProfissao("Programador");
			System.out.println();
			System.out.println(paulo);
			System.out.println(conta.getTitular());
		}
}
