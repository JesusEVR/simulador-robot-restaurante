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
	protected ArrayList<Object> menuDelDia;
	
	/**
	* Constructor por omisión que inicializa el menú el dia 
	*/
	public MenuDelDia(){
		menuDelDia = new ArrayList<Object>();
		Hamburguesa h1 = new HamburguesaVegetariana("MD01", "Hamburguesa Veggie", "Pan integral, mayonesa de betabel,  calabacitas, milanesa de soja, queso amarillo, zanahoria rallada, mostaza, catsup y chile morron", 45.0, true, true, "soja");
		agregarHamburguesa((Object) h1);
		Hamburguesa h2 = new HamburguesaCarnivora("MD02", "Hamburguesa Vacuna", "Pan tradicional, mayonesa de betabel, rodajas de jitomate abundantes, queso amarillo derretido, carne de res bien cocida, catsup y mostaza", 65.0, true, false, "res");
		agregarHamburguesa((Object) h2);
		Hamburguesa h3 = new HamburguesaCarnivora("MD03", "Hamburguesa Don Pollo", "Pan tradicional, mayonesa de chipotle, rodajas de jitomate, lechuga, carne de pollo asada, jalapeños y mostaza", 60.0, true, false, "pollo");
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
