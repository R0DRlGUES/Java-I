package teste.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import ByteBank_HerdadoContas.Conta;
import ByteBank_HerdadoContas.contaCorrente;



public class testeArrayList {
	public static void main(String[] args) {
		
		
//		Conta cc1 = new contaCorrente(22, 22);
//		Conta cc2 = new contaCorrente(22, 22);
//		
//		boolean igaul = cc1.eIgual(cc2);
//		System.out.println(igaul);

        //Generics
        List<Conta> lista = new ArrayList<Conta>();

        Conta cc = new contaCorrente(22, 11);
        lista.add(cc);

        Conta cc2 = new contaCorrente(22, 22);
        lista.add(cc2);
        
        Conta cc3 = new contaCorrente(22, 22);


        boolean existe = lista.contains(cc2);
        
        System.out.println("ja existe : "+existe);
       
        
        for(Conta conta : lista) {
                System.out.println(conta);
        }
    }
}
