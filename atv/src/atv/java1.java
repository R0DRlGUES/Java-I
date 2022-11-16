package atv;

import java.util.Scanner;
public class java1 {
	public static void main(String[] args) {
		
		Scanner L = new Scanner(System.in);
		
		int cont = 0;
		
		for (int i=1;i<=10;i++) {
		
			cont += L.nextInt();
			
			System.out.println("-"+cont+"-");
		}
		
	}

}
