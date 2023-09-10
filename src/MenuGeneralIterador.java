/**
 * Clase que implementa un iterador para el Menu General.
 * 
 * @author Supr-Lilito
 * @author paolasanv
 * @author JesusEVR
 * @version septiembre 2023
 *
 */
import java.util.ArrayList;
public class MenuGeneralIterador implements Iterador{
	ArrayList<Hamburguesa> hamburguesasGeneral;
	int posicion = 0;

	/**
     * Constructor de la clase MenuGeneralIterador.
     * 
     * @param hamburguesasGeneral Lista de hamburguesas del menú general
     */
	public MenuGeneralIterador(ArrayList<Hamburguesa> hamburguesasGeneral){
		this.hamburguesasGeneral = hamburguesasGeneral;
	}

	@Override
	public boolean hasNext(){
		if(posicion >= hamburguesasGeneral.size()){
			return false;
		}
		else{
			return true;
		}
	}

	@Override 
	public Hamburguesa next(){
		Hamburguesa hamGeneral = hamburguesasGeneral.get(posicion);
		posicion += 1;
		return hamGeneral;
	}

	@Override
	public void remove(){
		if (posicion > 0 && posicion <= hamburguesasGeneral.size()){
        	hamburguesasGeneral.remove(posicion - 1); // Elimina el elemento en la posición actual
        	posicion--; // Ajusta la posición del iterador después de eliminar
    	} else {
        	throw new IllegalStateException("No se puede llamar a remove() antes de next() o después de haber llegado al final.");
    	}
	}
}