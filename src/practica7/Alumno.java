package practica7;

public class Alumno extends Persona {
	
	//atributos 
	private int legajo;
	
	//1-metodo constructor - 
	public Alumno() {
		// super(), para heredar de la clase superor 'Persona' .
		super();
	}
	
	// inicializa las propiedades
	// en super , añadimos  los atributos heredados de 'Persona' .
	public Alumno (String sApellido, String sNombre, int ilegajo) {
		super(sApellido, sNombre);
		legajo= ilegajo;
		

	}

	//2-accesors, getter y setter
	
	
	public int getLegajo() {
		return legajo;
	}
	
	//debemos añadir this , porque debe saber que nos referimos al de la clase.
	//Ya que tiene el mismo nombre  la propiedade privada que el parametro de entrada.
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + legajo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (legajo != other.legajo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + "]";
	}


}
