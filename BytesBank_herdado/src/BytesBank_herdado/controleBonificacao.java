package BytesBank_herdado;


public class controleBonificacao {
	
	private double soma;
	
	public void registra(Gerente g) {
		double boni = g.getBonificacao();		
		this.soma += boni;
	}
	public void registra(Funcionario f) {
		double boni = f.getBonificacao();		
		this.soma += boni;
	}
	public void registra(EditorDeVideo ed) {
		double boni = ed.getBonificacao();		
		this.soma += boni;
	}

	
	public double getSoma() {
		return soma;
	}
	
	

}
