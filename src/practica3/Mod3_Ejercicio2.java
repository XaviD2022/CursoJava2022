package practica3;

import java.util.Scanner;

public class Mod3_Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	      Scanner sc = new Scanner(System.in);
		
      //      Scanner numero = new Scanner( System.in );

	        System.out.printf( "Introduzca un número entero: " );
	        int numero = sc.nextInt();

	        if ( numero % 2 == 0 )
	        {
	            System.out.printf( "ES PAR" );
	        }
	        else
	        {
	            System.out.printf( "ES IMPAR" );
	        }
		
		
	}

}
