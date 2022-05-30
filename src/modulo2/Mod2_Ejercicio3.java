package modulo2;

import java.util.Scanner;

public class Mod2_Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		byte bmin = -128;
		byte bmax = 127;
		// reemplazar el 0 por el valor que corresponda en todos los caso
		short cantidadDePaises = 193;
		int   canchaRiver = 70000;
		
		System.out.println("añada dos numeros");
		int goles = sc.nextInt();
		int promedioGoles = sc.nextInt();
		
		
		Tipo de división ‘a’,’b’ o ‘c’.
		b. Cantidad de goles por partido de futbol.
		c. La capacidad de la cancha por ejemplo river (70.000 personas).
		d. Promedio de goles.
		short smax = (short) 32767;
		int imin = -2147483648;
        int imax = (int) 2147483647;
		long lmin = (long) (-6.02E23 - 1);
		long lmax = (long) 2E63;
		System.out.println("tipo\tminimo\tmaximo");
		System.out.println("....\t......\t......");
		System.out.println("\nbyte\t" + bmin + "\t" + bmax);
		System.out.println("\nshort\t" + smin + "\t" + smax);
		System.out.println("\nint\t" + imin + "\t" + imax);
		System.out.println("\nlong\t" + lmin + "\t" + lmax);

	