package Seleccion;

/**
 * 
 * @author Richard
 * 
 */
public class Entrenador extends SeleccionFutbol {

	// Atributo específico para entrenador
	private String idFederacion;

	// Constructores
	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}
	
	// Comportamiento específico de entrenador
	public void dirigirPartido() {
		System.out.println("Dirige un partido");
	}

	public void dirigirEntrenamiento() {
		System.out.println("Dirige un entrenamiento");
	}
	
	// Getters & Setters
	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}

}
