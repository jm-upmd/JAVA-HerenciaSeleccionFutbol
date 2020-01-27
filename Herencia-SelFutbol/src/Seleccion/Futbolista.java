package Seleccion;


public class Futbolista extends SeleccionFutbol {

	// Atributos específicos para futbolista
	private int dorsal;
	private String demarcacion;
	
	
	// Constructores
	public Futbolista() {
		super();
	}

	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		super(id, nombre, apellidos, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}
	

	
	// Comportamiento específico para un futbolista
	public void jugarPartido() {
		System.out.println("Juega un partido");
	}

	public void entrenar() {
		System.out.println("Entrena");
	}
	
	// Getters & Setters

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}

}
