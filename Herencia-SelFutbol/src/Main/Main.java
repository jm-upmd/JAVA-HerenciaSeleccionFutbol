package Main;

import java.util.ArrayList;

import Seleccion.Entrenador;
import Seleccion.Futbolista;
import Seleccion.Masajista;
import Seleccion.SeleccionFutbol;


public class Main {

	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

	public static void main(String[] args) {

		Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
		Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		Masajista raulMartinez = new Masajista(3, "Raúl", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una concentracion. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
			integrante.Concentrarse();
		}
		
		// VIAJE
		System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo método)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.print(integrante.getNombre()+" "+integrante.getApellidos()+" -> ");
			integrante.Viajar();
		}
		
		// ENTRENAMIENTO
		System.out.println("\nEntrenamiento: Solamente el entrenador y el futbolista tiene metodos para entrenar:");
		System.out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");
		delBosque.dirigirEntrenamiento();
		System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");
		iniesta.entrenar();
		
		// MASAJE
		System.out.println("\nMasaje: Solo el masajista tiene el método para dar un masaje:");
		System.out.print(raulMartinez.getNombre()+" "+raulMartinez.getApellidos()+" -> ");
		raulMartinez.darMasaje();
		
		// PARTIDO DE FUTBOL
		System.out.println("\nPartido de Fútbol: Solamente el entrenador y el futbolista tiene metodos para el partido de fútbol:");
		System.out.print(delBosque.getNombre()+" "+delBosque.getApellidos()+" -> ");
		delBosque.dirigirPartido();
		System.out.print(iniesta.getNombre()+" "+iniesta.getApellidos()+" -> ");
		iniesta.jugarPartido();
		
		 
		// Uso de sentencia instanceof y downcasting
		
		
		
		for(SeleccionFutbol o:integrantes ) {
			System.out.println("-------------------------------------");
			System.out.println(o.getNombre());
			
			if(o instanceof Entrenador) {
				((Entrenador) o).dirigirEntrenamiento();
				((Entrenador) o).dirigirPartido();
			} else if (o instanceof Masajista) {
				((Masajista) o).darMasaje();
			} else if (o instanceof Futbolista) {
				((Futbolista) o).entrenar();
				((Futbolista) o).jugarPartido();
								
			} 
		}
		
		Futbolista integrante = new Futbolista();
		
		// instanceof da error de compilación si el tipo del objeto comparado no está
		// en la misma rama del árbol de jerarquía de herencia  que la clase con la que se compara.
		
		/* Árbol de jerarquía de herencia:
		 * 
		 *                             (1) Objet | <-- (2) SeleccionFutbol |
		 *										                           | <-- (3) Entrenador
		 *                                                                 | <-- (4) Futbolista
		 *                                                                 | <-- (5) Masajista	
		 *                                                          
		 *  Ramas de jerarquía de herencia:
		 *   (1) -> (2) -> (3)
		 *   (1) -> (2) -> (4)     
		 *   (1) -> (2) -> (5)                                                    
		 *                              
		 */
		
		// Error de compilación, Futbolista y Masajista están en ramas distintas en el árbol de herencia.
		//if (integrante instanceof Masajista) { }
			
		
		
		
	}
}