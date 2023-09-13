/**
* Clase que define la característica del menú general
*
*@author paolasanv
*@author Supr-Lilito
*@author JesusEVR
*
*/
public class MenuGeneral implements Menu{

	/**
	* Estructura de datos para el menu general
	*/
	private Hamburguesa[] menuGeneral = new Hamburguesa[3];
	/**
	* Posicion actual del arreglo
	*/
	private int posicion=0;
	
	
	/**
	* Constructor por omisión que inicializa el menú general 
	*/
	public MenuGeneral(){
	 	Hamburguesa h1 = new HamburguesaCarnivora("MG01", "PRUEBA", "Hamburguesa de prueba",17.8, false, "res");
		agregarHamburguesa(h1);
		Hamburguesa h2 = new HamburguesaCarnivora("MG02", "prueba", "Hamburguesa de prueba",17.8, false, "res");
		agregarHamburguesa(h2);
		Hamburguesa h3 = new HamburguesaCarnivora("MG03", "prueba", "Hamburguesa de prueba",17.8, false, "res");
		agregarHamburguesa(h3);
		
	}
	
	/**
	* Metodo que añade hamburgesas al menú
	*/
	public void agregarHamburguesa(Hamburguesa h){
		if(posicion>=menuGeneral.length){
			System.out.println("No es posible añadir más hamburguesas. El menú general está lleno");
		}else {
			menuGeneral[posicion] = h;
			posicion++;
		}
	}
	
	/**
	* Metodo que crea un iterador para recorrer los elementos del menú
	*
	* @return iterador
	*/
	public Iterador creaIterador(){
		return new MenuGeneralIterador(menuGeneral);
	}
}