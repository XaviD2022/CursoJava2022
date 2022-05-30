package modulo2;

import java.util.Scanner;

public class Mod2_Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("añada dos numeros");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int suma=a+b;
		int resta=a-b;
		//upcast
		float division =(float)a/b;
		int multiplicacion =a*b;
		int resto =a%b;
		//  5/3 resul = 1, resto 2
		
		System.out.println( a + "+" + b + "=" + suma);
		System.out.println( a + "-" + b + "=" + resta);
		System.out.println( a + "*" + b + "=" + multiplicacion);
		System.out.println( a + "/" + b + "=" + division);
		System.out.println( "resto de " + a + "/" + b + "=" + resto);
		
		sc=null;
	}

}
