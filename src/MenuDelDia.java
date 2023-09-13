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
		Hamburguesa h1 = new HamburguesaVegetariana("MD01", "vegetariana", "burger", 45.0, true, "algas");
		agregarHamburguesa(h1);
		Hamburguesa h2 = new HamburguesaCarnivora("MD02", "carnivora", "burger", 45.0, false, "res");
		agregarHamburguesa(h2);
		Hamburguesa h3 = new HamburguesaCarnivora("MD03", "carnivora", "burger", 45.0, false, "pollo");
		agregarHamburguesa(h3);
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