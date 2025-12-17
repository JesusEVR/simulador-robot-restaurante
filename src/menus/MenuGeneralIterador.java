package menus;

import estados.*;
import hamburguesas.*;

/**
 * Clase que implementa un iterador para el Menu General.
 * 
 * @author Supr-Lilito
 * @author paolasanv
 * @author JesusEVR
 * @version septiembre 2023
 *
 */

public class MenuGeneralIterador implements Iterador{
	private Object[] hamburguesasGeneral;
	private int posicion = 0;

	/**
     * Constructor de la clase MenuGeneralIterador.
     * 
     * @param hamburguesasGeneral Arreglo de hamburguesas del menú general
     */
	public MenuGeneralIterador(Object[] hamburguesasGeneral){
		this.hamburguesasGeneral = hamburguesasGeneral;
	}

	public int obtenerPosicionFinal(){
		return 0;
	}

	@Override
	public boolean hasNext(){
		if(posicion >= hamburguesasGeneral.length || hamburguesasGeneral[posicion] == null){
			return false;
		}
		else{
			return true;
		}
	}

	@Override 
	public Object next(){
		Object hamGeneral = hamburguesasGeneral[posicion];
		posicion += 1;
		return hamGeneral;
	}

	@Override
	public void remove(){
		if (posicion > 0 && posicion <= hamburguesasGeneral.length){
        	hamburguesasGeneral[posicion - 1] = null; 
        	posicion--; 
    	} else {
        	throw new IllegalStateException("No se puede llamar a remove() antes de next() o después de haber llegado al final.");
    	}
	}
}
