package BytesBank_herdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario Pedro = new Funcionario();
		Pedro.setNome("Pedro H.P Rodrigues");
		Pedro.setCpf("123.234.567-90");
		Pedro.setSalario(1500.35);
		
		System.out.println(Pedro.getNome());
		System.out.println(Pedro.getBonificacao());
		
	}
}
