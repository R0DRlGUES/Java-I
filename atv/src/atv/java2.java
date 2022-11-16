package atv;

import java.util.Scanner;
public class java2 {
	public static void main(String[] args) {
		
		Scanner L = new Scanner(System.in);
		System.out.println("Selecione 1, 2 ou 3");
		int a = L.nextInt();
		
		switch(a) {
			case 1: 
				System.out.println("País escolhido Estados unidos.");
				System.out.println("Lingua Mãe: Ingles");
			break;
			case 2:
				System.out.println("País escolhido Brasil.");
				System.out.println("Lingua Mãe: Portugues brasileiro");
				break;
			case 3:
				System.out.println("País escolhido POrtugal.");
				System.out.println("Lingua Mãe: Portugues Portugal");
				break;
		}
	}

}
