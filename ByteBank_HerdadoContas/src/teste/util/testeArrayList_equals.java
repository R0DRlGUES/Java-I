package teste.util;

import java.util.ArrayList;
import ByteBank_HerdadoContas.Conta;
import ByteBank_HerdadoContas.contaCorrente;



public class testeArrayList_equals {
	public static void main(String[] args) {
		//   especificando o tipo 
		//   Generics
		ArrayList <Conta> lista = new ArrayList<Conta>();
		ArrayList <String> nome = new ArrayList<String>();

		Conta cc = new contaCorrente(22, 11);

        lista.add(cc);
        Conta cc2 = new contaCorrente(22, 22);
        lista.add(cc2);
        
        
        System.out.println(lista.size());
        Conta ref =(Conta) lista.get(0);
        
        System.out.println(ref.getNumero());
        
        lista.remove(0);
        System.out.println(lista.size());
        
        Conta cc3 = new contaCorrente(33, 311);
        lista.add(cc3);
        Conta cc4 = new contaCorrente(33, 322);
        lista.add(cc4);
        
        for(int i=0;i<lista.size();i++) {
        	Object oRef = lista.get(i);
        	System.out.println(lista.get(i));
        }
        System.out.println("-------------------------------");
        for(Conta conta : lista) {
            System.out.println(conta);
        }
	}

}
