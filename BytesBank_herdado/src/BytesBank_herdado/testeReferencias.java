package BytesBank_herdado;

public class testeReferencias {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marco");
		g1.setSalario(5000);
		
		
		Funcionario f = new Funcionario();
		f.setNome("flavio");
		f.setSalario(2000);
		
		
		EditorDeVideo ed = new EditorDeVideo();
		ed.setNome("Jose");
		ed.setSalario(2500);
		
		controleBonificacao controle = new controleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ed);
		
		System.out.println(controle.getSoma());
	}

}
