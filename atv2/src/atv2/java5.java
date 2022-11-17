package atv2;
import java.util.Scanner;
import java.math.*;
public class java5 {
	public static void main(String[] args) {
		Scanner L = new Scanner(System.in);
		
		double peso=0;
		double alut=0;
		
		System.out.println("Informe seu peso");
		peso=L.nextDouble();
		
		System.out.println("Informe seu Altura");
		alut=L.nextDouble();
		double imc = peso/(alut*alut);
		System.out.println(imc);


	}

}
