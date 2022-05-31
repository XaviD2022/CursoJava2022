package modulo2;

import java.util.Scanner;

public class Mod2_Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("añada un byte:");
		byte 	b = sc.nextByte();
		System.out.println("añada un short:");
		short 	s = sc.nextShort();
		System.out.println("añada un int:");
		int 	i = sc.nextInt();
		System.out.println("añada un long:");
		long 	l = sc.nextLong();
		
		
		byte sumabb=(byte) (b+b);
		short sumabs=(short) (b+s);
		// con estos valores y adefinidos , nunca sobrepasara el tipo , no usamos el CAST.
		int sumabi=b+i;
		int sumaii=i+i;
		long sumasl=s+l;
		
		
		
		System.out.println( "No necesita CAST");	
		System.out.println( l=i);
		

		System.out.println( "Si necesita CAST");
		System.out.println( b=(byte) s );
		System.out.println( b=(byte) i);
		System.out.println( s=(short) i);
		
		

		
	}

}
