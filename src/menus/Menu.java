package menus;

import estados.*;
import hamburguesas.*;

/**
* Interfaz que define la característica común de los menú
*
*@author paolasanv
*@author Supr-Lilito
*@author JesusEVR
*
*/
public interface Menu{
	
	/**
	* Crea un iterador sobre el menú
	*
	*/
	public Iterador creaIterador();

}