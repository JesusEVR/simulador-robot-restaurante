
/**
 * Interfaz de un iterador para los menus de hamburguesas.
 * 
 * @author Supr-Lilito
 * @author paolasanv
 * @author JesusEVR
 * @version septiembre 2023
 *
 */

public interface Iterador{
	
	/**
     * Comprueba si hay más elementos en el menu que aún no han sido iterados.
     * 
     * @return true si hay más elementos para iterar, false si no.
     */
	public boolean hasNext();

	 /**
     * Devuelve el siguiente elemento del menu y avanza el iterador al siguiente elemento.
     * 
     * @return El siguiente elemento del menu.
     */
	public Hamburguesa next();

	/**
     * Elimina el elemento actual del menu, es decir el elemento en el ultimo indice.
     * 
     */
	public void remove();
}