/**
 * Clase que implementa un iterador para el Menu de Lujo.
 * 
 * @author Supr-Lilito
 * @author paolasanv
 * @author JesusEVR
 * @version septiembre 2023
 *
 */
import java.util.ArrayList;
public class MenuLujoIterador implements Iterador{
	ArrayList<Hamburguesa> hamburguesasDeLujo;
	int posicion = 0;

	/**
     * Constructor de la clase MenuGeneralIterador.
     * 
     * @param hamburguesasDeLujo Lista de hamburguesas del menú general
     */
	public MenuLujoIterador(ArrayList<Hamburguesa> hamburguesasDeLujo){
		this.hamburguesasDeLujo = hamburguesasDeLujo;
	}

	@Override
	public boolean hasNext(){
		if(posicion >= hamburguesasDeLujo.size()){
			return false;
		}
		else{
			return true;
		}
	}

	@Override 
	public Hamburguesa next(){
		Hamburguesa hamDeLujo = hamburguesasDeLujo.get(posicion);
		posicion += 1;
		return hamDeLujo;
	}

	@Override
	public void remove(){
		if (posicion > 0 && posicion <= hamburguesasDeLujo.size()){
        	hamburguesasDeLujo.remove(posicion - 1); // Elimina el elemento en la posición actual
        	posicion--; // Ajusta la posición del iterador después de eliminar
    	} else {
        	throw new IllegalStateException("No se puede llamar a remove() antes de next() o después de haber llegado al final.");
    	}
	}
}