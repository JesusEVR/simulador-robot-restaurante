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
	public ArrayList<Object> menuDelDia;
	
	/**
	* Constructor por omisión que inicializa el menú el dia 
	*/
	public MenuDelDia(){
		menuDelDia = new ArrayList<Object>();
		Hamburguesa h1 = new HamburguesaVegetariana("MD01", "Hamburguesa Veggie", "Pan integral, mayonesa de betabel,  calabacitas, milanesa de soja, zanahoria rallada y chile morron", 45.0, true, "soja");
		agregarHamburguesa((Object) h1);
		Hamburguesa h2 = new HamburguesaCarnivora("MD02", "carnivora", "burger", 45.0, false, "res");
		agregarHamburguesa((Object) h2);
		Hamburguesa h3 = new HamburguesaCarnivora("MD03", "carnivora", "burger", 45.0, false, "pollo");
		agregarHamburguesa((Object) h3);
	}
	
	/**
	* Metodo que añade hamburgesas al menú
	*/
	public void agregarHamburguesa(Object h){
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
