package modulo3;

import java.util.Scanner;

public class Mod3_Ejercicio1 {

	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			// asumimos que la nota no sera superior a 10 .
		
			System.out.println("añada nota evaluación 1:");
			System.out.println("\n");
			short 	evaluacion1 = sc.nextShort();

			System.out.println("añada nota evaluación 2:");
			System.out.println("\n");
			short 	evaluacion2 = sc.nextShort();

			System.out.println("añada nota evaluación 3:");
			System.out.println("\n");
			short 	evaluacion3 = sc.nextShort();

			
			int media = (evaluacion1 + evaluacion2 + evaluacion3) / 3;
			
			System.out.println("media:" + media);
			System.out.println("\n");
						
			if (media >= 7) {
					System.out.println("aprobado");
			}else {
				System.out.println("suspendido");
			
			}
					

		}		
	
}
