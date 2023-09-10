/**
 * Clase abstracta que define de forma general las hambuguesas de 'McBurguesas'.
 *
 * @author Supr-Lilito
 * @author paolasanv
 * @author JesusEVR
 * @version septiembre 2023
 *
 */
public abstract class Hamburguesa{
        /**
	 * ID unica de cada hambuguesa
	 */
	String ID;
	/**
	 * Nombre de la hamburguesa
	 */
	String nombre;
	/**
	 * Descripcion de la hamburguesa 
	 */
	String descripcion;
	/**
	 * Precio de la hamburguesa 
	 */
	double precio;
	/**
	 * Si es una hambuguesa vegetariana o no 
	 */
	boolean esVegetariano;

	/**
	 * Constructor por parametros de la hamburguesa
         *
         * @param ID Cadena que contiene la ID de cada hamburguesa
	 * @param nombre Cadena con el nombre de la hamburguesa
         * @param descripcion Cadena que contiene una breve descripcion de la hamburguesa
         * @param precio El costo de cada hamburguesa (en pesos mexicanos)
         * @param esVegetariano Un valor booleano que detalla si la hamburguesa es vgetariana (1) o no lo es (0)
	 */
	public Hamburguesa(String ID, String nombre, String descripcion, double precio, boolean esVegetariano){
		this.ID = ID;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.esVegetariano = esVegetariano;
	}

	/**
	 * Metodo que devuelve la ID de una hamburguesa
	 * 
	 * @return la ID de dicha hamburguesa
	 */
	public String obtenerID(){
		return ID;
	}

	/**
	 * Metodo que cambia el ID de una hamburguesa
	 * 
	 * @param id La ID nueva de la hamburguesa
	 */
	public void modificarID(String id){
		ID = id;
	}

	/**
	 * Metodo que devuelve el nombre de una hamburguesa
	 * 
	 * @return el nombre de dicha hamburguesa
	 */
	public String obtenerNombre(){
		return nombre;
	}

	/**
	 * Metodo que cambia el nombre de una hamburguesa
	 * 
	 * @param n El nombre nuevo de la hamburguesa
	 */
	public void modificarNombre(String n){
		nombre = n;
	}

	/**
	 * Metodo que devuelve la descripcion de una hamburguesa
	 * 
	 * @return la descripcion de dicha hamburguesa
	 */
	public String obtenerDescripcion(){
		return descripcion;
	}

	/**
	 * Metodo que cambia la descripcion de una hamburguesa
	 * 
	 * @param d La descripcion nueva de la hamburguesa
	 */
	public void modificarDescripcion(String d){
		descripcion = d;
	}

	/**
	 * Metodo que devuelve el precio / costo de una hamburguesa
	 * 
	 * @return el precio de dicha hamburguesa
	 */
	public double obtenerPrecio(){
		return precio;
	}

	/**
	 * Metodo que cambia el precio de una hamburguesa
	 * 
	 * @param p El precio nuevo de la hamburguesa
	 */
	public void modificarPrecio(double p){
		precio = p;
	}

	/**
	 * Metodo que devuelve si una hamburguesa es vegetariana o no
	 * 
	 * @return '1' si la hamburguesa es vegetariana, '0' en el caso contrario
	 */
	public boolean esVegetariano(){
		return esVegetariano;
	}

	/**
	 * Metodo que detalla que se coloca un pan de la hamburguesa
         *
	 */
	public void ponerPan(){
		System.out.println("Poniendo pan");
	}

	/**
	 * Metodo que detalla que se esta poniendo mayonesa en el pan
         *
	 */
	public void ponerMayonesa(){
		System.out.println("Poniendo mayonesa");
	}

	/**
	 * Metodo que detalla que se esta poniendo mostaza en el otro pan
         *
	 */
	public void ponerMostaza(){
		System.out.println("Poniendo mostaza");
	}

	/**
	 * Metodo que detalla que se estan poniendo vegetales en la hamburguesa
         *
	 */
	public void ponerVegetales(){
		System.out.println("Poniendo vegetales");
	}

	/**
	 * Metodo que detalla que se esta poniendo catsup en la hamburguesa
         *
	 */
	public void ponerCatsup(){
		System.out.println("Poniendo catsup");
	}

	/**
	 * Metodo abstracto que detalla que se esta poniendo el queso (vegetariano o no) de la hamburguesa
         *
	 */
	public abstract void ponerQueso();

	/**
	 * Metodo abstracto que detalla que se esta preparando la carne (vegetariano o no) de la hamburguesa
         *
	 */
	public abstract void prepararCarne();

	/**
	 * Metodo abstracto que detalla que se esta poniendo la carne (vegetariano o no) de la hamburguesa
         *
	 */
	public abstract void ponerCarne();

	/**
	 * Metodo que engloba todos los anteriores en un solo proceso de preparacion de Hamburguesa
         *
	 */
	public void prepararHamburguesa(){
		ponerPan();
		ponerMayonesa();
		ponerMostaza();
		prepararCarne();
		ponerCarne();
		ponerQueso();
		ponerVegetales();
		ponerCatsup();
		ponerPan();
	}

	/**
	 * Metodo toStrng que convierte en cadena todos los atributos de la hamburguesa
         *
	 * @return La cadena con la informacion de la hamburguesa
	 */
	public String toString(){
		if(esVegetariano()) return "---"+ID + " Hamburguesa vegetariana " +nombre +"---"+"\n"  + "Descripcion: "+descripcion +"\n" +"Precio: $" + precio;
		return "---"+ID + "  Hamburguesa carnivora " +nombre+"---"+"\n" + "Descripcion: " +descripcion +"\n" +"Precio: $" + precio;
	}
}
