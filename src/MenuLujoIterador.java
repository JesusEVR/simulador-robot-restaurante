import java.util.Enumeration;
import java.util.Hashtable;
import java.util.NoSuchElementException;

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
	private Enumeration<Hamburguesa> numeracion;

	/**
     * Constructor de la clase MenuLujoIterador
     * 
     * @param hamburguesasDeLujo Enumeracion de hamburguesas del menu de Lujo
     */
	public MenuLujoIterador(Hashtable<String, Hamburguesa> hamburguesasDeLujo){
		numeracion = hamburguesasDeLujo.elements();
	}

	@Override
	public boolean hasNext(){
		return numeracion.hasMoreElements();
	}

	@Override 
	public Hamburguesa next(){
		if (hasNext()){
			return numeracion.nextElement();
		}
		else{
			throw new NoSuchElementException("No hay mas elementos en el menu.");
		}
	}

	@Override
	public void remove(){
		throw new UnsupportedOperationException("Remove no está soportado para Hashtable.");
	}
}