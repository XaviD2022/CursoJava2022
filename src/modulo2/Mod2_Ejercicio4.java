package modulo2;

public class Mod2_Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b=10;
		short s=20;
		int i = 30;
		long l= 40;

			
		byte sumabb=(byte) (b+b);
		short sumabs=(short) (b+s);
		// con estos valores y adefinidos , nunca sobrepasara el tipo , no usamos el CAST.
		int sumabi=b+i;
		int sumaii=i+i;
		long sumasl=s+l;
		
		
		System.out.println( sumabb);
		System.out.println( sumabs);
		System.out.println( sumabi);
		System.out.println( sumaii);
		System.out.println( sumasl);
		

	}


}
