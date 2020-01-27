package Seleccion;

public class Masajista extends SeleccionFutbol {

	// Nuevos atributos de clase específicos de masajista.
	private String titulacion;
	private int aniosExperiencia;

	// Constructores
	public Masajista() {
	}

	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellidos, edad); // uso de constructor de SeleccionFutbol
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}
	
	// Comportamiento específico para masajista 
	
	public void darMasaje() {
		System.out.println("Da un masaje");
	}

	
	// Getters & Setters
	
	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}



}
