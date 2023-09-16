import java.util.ArrayList;
import java.util.Iterator;
/**
 * Clase que implementa un iterador para el Menu del dia.
 * 
 * @author Supr-Lilito
 * @author paolasanv
 * @author JesusEVR
 * @version septiembre 2023
 *
 */

public class MenuDelDiaIterador implements Iterador{
	public ArrayList<Object> hamburguesasDelDia;
	private int posicion = 0;

	Iterator it;

	/**
     * Constructor de la clase MenuDelDiaIterador.
     * 
     * @param hamburguesasDelDia Lista de hamburguesas del menu del dia
     */
	public MenuDelDiaIterador(ArrayList<Object> hamburguesasDelDia){
		this.hamburguesasDelDia = hamburguesasDelDia;
		it = hamburguesasDelDia.iterator();
	}

	@Override
	public boolean hasNext(){
		return it.hasNext();
		/*
		if(posicion >= hamburguesasDelDia.size()){
			return false;
		}
		else{
			return true;
		}*/
	}

	@Override 
	public Object next(){
		return it.next();
		/*
		Object hamDelDia = hamburguesasDelDia.get(posicion);
		posicion += 1;
		return hamDelDia;
		*/
	}

	@Override
	public void remove(){
		it.remove();
		/*
		if (posicion > 0 && posicion <= hamburguesasDelDia.size()){
        	hamburguesasDelDia.remove(posicion - 1); // Elimina el elemento en la posición actual
        	posicion--; // Ajusta la posición del iterador después de eliminar
    	} else {
        	throw new IllegalStateException("No se puede llamar a remove() antes de next() o después de haber llegado al final.");
    	}
    	*/
	}
}