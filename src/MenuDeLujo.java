import java.util.Hashtable;

/**
* Clase que define la característica del menú de lujo
*
*@author paolasanv
*@author Supr-Lilito
*@author JesusEVR
*
*/
public class MenuDeLujo implements Menu{

	/**
	* Estructura de datos para el menu de lujo
	*/
	private Hashtable<String , Hamburguesa> menuDeLujo = new Hashtable<String , Hamburguesa>(); 
		
	/**
	* Constructor por omisión que inicializa el menú de lujo 
	*/
	public MenuDeLujo(){
		Hamburguesa h1 = new HamburguesaVegetariana("ML01", "prueba", "burgerV", 45.0, true, "tofu");
		agregarHamburguesa(h1.obtenerID(), h1);	
		Hamburguesa h2 = new HamburguesaVegetariana("ML02", "prueba", "vevfvef", 45.0, true, "tofu");
		agregarHamburguesa(h2.obtenerID(), h2);	
		Hamburguesa h3 = new HamburguesaVegetariana("ML03", "prueba", "ffveve", 45.0, true, "tofu");
		agregarHamburguesa(h3.obtenerID(), h3);	
	}
	
	/**
	* Metodo que añade hamburgesas al menú
	*/
	public void agregarHamburguesa(String ID, Hamburguesa h){
		menuDeLujo.put(ID, h);
	}
	
	/**
	* Metodo que crea un iterador para recorrer los elementos del menú
	*
	* @return iterador
	*/
	public Iterador creaIterador(){
		return new MenuLujoIterador(menuDeLujo);
	}
}