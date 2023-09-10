import java.util.ArrayList;

/**
* Clase que define la característica del menú del día
*
*@author paolasanv
*@author Supr-Lilito
*@author JesusEVR
*
*/
public class MenuDelDia implements Menu{

	/**
	* Estructura de datos para el menu del dia
	*/
	private ArrayList<Hamburguesa> menuDelDia;
	
	/**
	* Constructor por omisión que inicializa el menú el dia 
	*/
	public MenuDelDia(){
		menuDelDia = new ArrayList<Hamburguesa>();
		Hamburguesa h1 = new HamburguesaVegetariana("ID002", "prueba", "burger", 45.0, true, "algas");
		agregarHamburguesa(h1);
	}
	
	/**
	* Metodo que añade hamburgesas al menú
	*/
	public void agregarHamburguesa(Hamburguesa h){
		menuDelDia.add(h);
	}
	
	/**
	* Metodo que crea un iterador para recorrer los elementos del menú
	*
	* @return iterador
	*/
	public Iterador creaIterador(){
		return new MenuDelDiaIterador(menuDelDia);
	}
}