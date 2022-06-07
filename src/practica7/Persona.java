package practica7;

public class Persona {

		//atributos
		private String apellido;
		private String nombre;
		
		//1-metodo constructor - mismo metodo que la clase . es el primer metodo que se contruye  cuando se crea una clase.
		// crear objeto sin propiedades
		public Persona() {
		
		}
		// inicializa las propiedades
		public Persona (String sApellido, String sNombre) {
			apellido=sApellido;
			nombre=sNombre;
			System.out.println();
		}
	
		//2-accesors, getter y setter
		
		
		//metodo para poder acceder desde fuera a esta propiedad privada.
		public String getApellido() {
			return apellido;
		}
		
		//debemos añadir this , porque debe saber que nos referimos al de la clase.
		//Ya que tiene el mismo nombre  la propiedade privada 'apellido, que el parametro de entrada 'apellido'.
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		
		public String getNombre() {
			return nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		//3- metodos de negocio
		//aceso - tipo de dato que devuelve, nombre, parametro
				public void muestraPersona(String sApellido, String sNombre) {
					System.out.println("Datos Persona: " + sApellido + "   " + sNombre + "  " );

				}
				@Override
				public int hashCode() {
					final int prime = 31;
					int result = 1;
					result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
					result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
					return result;
				}
				@Override
				public boolean equals(Object obj) {
					if (this == obj)
						return true;
					if (obj == null)
						return false;
					if (getClass() != obj.getClass())
						return false;
					Persona other = (Persona) obj;
					if (apellido == null) {
						if (other.apellido != null)
							return false;
					} else if (!apellido.equals(other.apellido))
						return false;
					if (nombre == null) {
						if (other.nombre != null)
							return false;
					} else if (!nombre.equals(other.nombre))
						return false;
					return true;
				}
				@Override
				public String toString() {
					return "Persona [apellido=" + apellido + ", nombre=" + nombre + "]";
				}


}
