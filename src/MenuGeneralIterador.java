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
	Hamburguesa hamburguesasGeneral[];
	int posicion = 0;

	/**
     * Constructor de la clase MenuGeneralIterador.
     * 
     * @param hamburguesasGeneral Arreglo de hamburguesas del menú general
     */
	public MenuGeneralIterador(Hamburguesa[] hamburguesasGeneral){
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
	public Hamburguesa next(){
		Hamburguesa hamGeneral = hamburguesasGeneral[posicion];
		posicion += 1;
		return hamGeneral;
	}

	@Override
	public void remove(){
		if (posicion > 0 && posicion <= hamburguesasGeneral.length){
        	hamburguesasGeneral[posicion - 1] = null; // Elimina el elemento en la posición actual
        	posicion--; // Ajusta la posición del iterador después de eliminar
    	} else {
        	throw new IllegalStateException("No se puede llamar a remove() antes de next() o después de haber llegado al final.");
    	}
	}
}