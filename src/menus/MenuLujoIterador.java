package menus;

import estados.*;
import hamburguesas.*;

import java.util.Hashtable;
import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.Map;

/**
 * Clase que implementa un iterador para el Menu de Lujo.
 * 
 * @author Supr-Lilito
 * @author paolasanv
 * @author JesusEVR
 * @version septiembre 2023
 *
 */
public class MenuLujoIterador implements Iterador{
	private Hashtable<String, Object> hamburguesasDeLujo;
	private Iterator<Map.Entry<String, Object>> it;
	private Map.Entry<String, Object> entradaActual;


	/**
     * Constructor de la clase MenuLujoIterador
     * 
     * @param hamburguesasDeLujo Enumeracion de hamburguesas del menu de Lujo
     */
	public MenuLujoIterador(Hashtable<String, Object> hamburguesasDeLujo){
		this.hamburguesasDeLujo = hamburguesasDeLujo;
		this.it = hamburguesasDeLujo.entrySet().iterator();
	}

	@Override
	public boolean hasNext(){
		return it.hasNext();
	}

	@Override 
	public Object next(){
		if (hasNext()){
			entradaActual = it.next();
			return entradaActual.getValue();
		}
		else{
			throw new NoSuchElementException("No hay mas elementos en el menu.");
		}
	}

	@Override
	public void remove(){
		if (entradaActual != null) {
			it.remove();
			entradaActual = null;
		}
		else {
			throw new UnsupportedOperationException("next() no ha sido llamado o remove() ya ha sido llamado después de la última llamada a next().");
		}
	}
}