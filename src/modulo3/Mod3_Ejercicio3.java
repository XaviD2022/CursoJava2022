package modulo3;

import java.util.Scanner;

public class Mod3_Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					Scanner sc = new Scanner(System.in);
					
					System.out.println("introduzca el numero de mes :");
					System.out.println("\n");
					short 	numMes = sc.nextShort();

	
					switch(numMes){
		            case 1:  // Enero
		            case 3:  // Marzo
		            case 5:  // Mayo
		            case 7:  // Julio
		            case 8:  // Agosto
		            case 10:  // Octubre
		            case 12: // Diciembre
		        		System.out.println("El mes " +numMes+ " tiene 31 dias");
		        		break;
		            case 4:  // Abril
		            case 6:  // Junio
		            case 9:  // Septiembre
		            case 11: // Noviembre
		        		System.out.println("El mes " +numMes+ " tiene 30 dias");
		        		break;
		            // consideramos Fegreso siempre de 28
		            case 2:  // Febrero
		        		System.out.println("El mes " +numMes+ " tiene 28 dias");
		        		break;
		            default:
		        		System.out.println("El mes debe estar entre 1 y 12");		
		        		break;
		        		}
		}					
					
				

}
