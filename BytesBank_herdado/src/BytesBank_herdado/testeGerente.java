package BytesBank_herdado;

public class testeGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setCpf("123.345.567-12");
		g1.setSalario(5000);
		
		
		
		g1.setSenha(222);
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
	
		boolean autenticou = g1.autentica(222);
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
	}
}
