/**
 * Clase que implementa un iterador para el Menu del dia.
 * 
 * @author Supr-Lilito
 * @author paolasanv
 * @author JesusEVR
 * @version septiembre 2023
 *
 */
import java.util.ArrayList;
public class MenuDelDiaIterador implements Iterador{
	ArrayList<Hamburguesa> hamburguesasDelDia;
	int posicion = 0;

	/**
     * Constructor de la clase MenuGeneralIterador.
     * 
     * @param hamburguesasDelDia Lista de hamburguesas del menú general
     */
	public MenuDelDiaIterador(ArrayList<Hamburguesa> hamburguesasDelDia){
		this.hamburguesasDelDia = hamburguesasDelDia;
	}

	@Override
	public boolean hasNext(){
		if(posicion >= hamburguesasDelDia.size()){
			return false;
		}
		else{
			return true;
		}
	}

	@Override 
	public Hamburguesa next(){
		Hamburguesa hamDelDia = hamburguesasDelDia.get(posicion);
		posicion += 1;
		return hamDelDia;
	}

	@Override
	public void remove(){
		if (posicion > 0 && posicion <= hamburguesasDelDia.size()){
        	hamburguesasDelDia.remove(posicion - 1); // Elimina el elemento en la posición actual
        	posicion--; // Ajusta la posición del iterador después de eliminar
    	} else {
        	throw new IllegalStateException("No se puede llamar a remove() antes de next() o después de haber llegado al final.");
    	}
	}
}