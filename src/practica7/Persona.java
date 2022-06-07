package practica7;

public class Persona {

		//atributos
		private String apellido;
		private String nombre;
		
		//1-metodo constructor - mismo metodo que la clase . es el primer metodo que se contruye  cuando se crea una clase.
		public Persona() {
		
		}
		public Persona (String sApellido, String sNombre) {
			apellido=sApellido;
			nombre=sNombre;
			System.out.println();
		}
	
		//2-accesors, getter y setter
		//aceso - tipo de dato que devuelve, nombre, parametro
		public void muestraPersona(String sApellido, String sNombre) {
			System.out.println("Datos Persona: " + sApellido + "   " + sNombre + "  " );

		}

		//3- metodos de negocio

}
