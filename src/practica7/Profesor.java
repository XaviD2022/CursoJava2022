package practica7;

public class Profesor extends Persona {
	
	//atributos 
	private String iosfa;
	
	//1-metodo constructor - 
	public Profesor() {
		// super(), para heredar de la clase superor 'Persona' .
		super();
	}
	
	// inicializa las propiedades
	// en super , añadimos  los atributos heredados de 'Persona' .
	public Profesor (String sApellido, String sNombre, String sIosfa) {
		super(sApellido, sNombre);
		iosfa= sIosfa;
		

	}

	//2-accesors, getter y setter
	
	
	public String getIosfa() {
		return iosfa;
	}
	
	//debemos añadir this , porque debe saber que nos referimos al de la clase.
	//Ya que tiene el mismo nombre  la propiedade privada que el parametro de entrada.
	public void setIosfa(String iosfa) {
		this.iosfa = iosfa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((iosfa == null) ? 0 : iosfa.hashCode());
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
		Profesor other = (Profesor) obj;
		if (iosfa == null) {
			if (other.iosfa != null)
				return false;
		} else if (!iosfa.equals(other.iosfa))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Profesor [iosfa=" + iosfa + "]";
	}
	
	
	
	
}
