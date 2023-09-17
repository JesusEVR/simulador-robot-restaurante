/**
* Clase que define el comportamiento del robot cuando es mesero o cocinero
*
* @author paolasanv
* @author Supr-Lilito
* @author JesusEVR
* @version Septiembre 2023
*/

public class Robot{
	/**
	* Robot en su estado actual
	*/
	private EstadoRobot estadoActual; 
	/**
	* Robot en modo suspendido
	*/
	private EstadoRobot modoSuspendido;
	/**
	* Robot en su modo aminar
	*/
	private EstadoRobot modoCaminar;
	/**
	* Robot en su modo atender
	*/
	private EstadoRobot modoAtender;
	/**
	* Robot en su modo cocinar
	*/
	private EstadoRobot modoCocinar;
	/**
	* Robot en su modo entregar
	*/
	private EstadoRobot modoEntregar;
	/**
	* Verifica si el robot puede cocinar despues de que el cliente ordenó
	*/
	private boolean puedeCocinar; 
	/**
	* Verifica si el robot ya cocinó la orden
	*/
	private boolean yaCocino; 
	/**
	* Menu especial del restaurante
	*/
	private Menu menuDeLujo;
	/**
	* Menu del dia del restaurante
	*/
	private Menu menuDelDia;
	/**
	* Menu general del restaurante
	*/
	private Menu menuGeneral;
	/**
	* Guarda el ID de la hamburguesa que el cliente ordenó
	*/
	private String orden = "";
	/**
	* Guarda la hamburguesa que el cliente ordenó
	*/
	private Hamburguesa burgerCliente;

	/**
	* Constructor que inicializar el robor en modo suspendido 
 	* y recibe como parametros los menu del restaurante
        *@param Menu general 
        *@param Menu delDia
        *@param Menu deLujo
	*/
	public Robot(Menu general, Menu delDia, Menu deLujo){
		modoSuspendido= new ModoSuspendido(this);
		modoCaminar = new ModoCaminar(this);
		modoAtender = new ModoAtender(this);
		modoCocinar = new ModoCocinar(this);
		modoEntregar = new ModoEntregar(this);
		puedeCocinar=false;
		yaCocino=false;
		estadoActual = modoSuspendido;
		menuGeneral = general;
		menuDelDia = delDia;
		menuDeLujo = deLujo;
	}
	
       /**
       * Metodo que asigna true si el robot ya cocinó la orden del cliente, asigna false en caso contrario
       *
       * @param c       
       */
	public void yaCocino(boolean c){ 
		yaCocino=c;
	}
	
       /**
       * Metodo que devuelve true si el robot ya coció la orden del cliente, false en caso contrario
       *       
       *@return yaCocino
       */
	public boolean yaCocino(){
		return yaCocino;
	}
	
       /**
       * Metodo que asigna true cuando el robot ya cocinó despues de que el cliente ordenó
       *     
       *@param p
       */
	public void puedeCocinar(boolean p){ 
		puedeCocinar = p; 
	}
       /**
       * Método que devulve true si el robot puede cocinar después de que el cliente ha ordenado, false en caso contrario
       *       
       *@return puedeCocinar
       */
	public boolean puedeCocinar(){ 
		return puedeCocinar;
	}
	
       /**
       * Método que llama a activar() según el modo actual del robot       
       */
	public void activar(){
		estadoActual.activar();
	}
	
       /**
       * Método que llama a atender() según el modo actual del robot  
       */
	public void atender(){
		estadoActual.atender();
	}
       /**
       *  Método que llama a cocinar() según el modo actual del robot     
       */
	public void cocinar(){
		estadoActual.cocinar();
	}
       /**
       * Método que llama a entregar() según el modo actual del robot 
       */
	public void entregar(){
		estadoActual.entregar();
	}
       /**
       *  Método que llama a suspender() según el modo actual del robot     
       */
	public void suspender(){
		estadoActual.suspender();
	}
       /**
       * Método que llama a caminar() según el modo actual del robot     
       */
	public void caminar(){
		estadoActual.caminar();
	}
       /**
       * Método que asigna un nuevo modo al robot
       *
       * @param nuevoEstado       
       */
	public void asignarNuevoEstado(EstadoRobot nuevoEstado){
		estadoActual = nuevoEstado;
	}
	
       /**
       *  Devuelve un robot en modo suspendido 
       *
       *@retrun modoSuspendido
       */
	public EstadoRobot modoSuspendido(){
		return modoSuspendido;
	}
       /**
       * Devuelve un robot en modo caminar
       *
       *@retrun modoCaminar
       */
	public EstadoRobot modoCaminar(){
		return modoCaminar;
	}
	
       /**
       * Devuelve un robot en modo atender   
       *
       *@retrun modoAtender
       */
	public EstadoRobot modoAtender(){
		return modoAtender;
	}

       /**
       * Devuelve un robot en modo cocinar   
       *
       *@retrun modoCocinar
       */
	public EstadoRobot modoCocinar(){
		return modoCocinar;
	}

       /**
       * Devuelve un robot en modo entregar
       *
       *@retrun modoEntregar
       */
	public EstadoRobot modoEntregar(){
		return modoEntregar;
	}
	
       /**
       * Imprime los menú del restaurante
       */
	public void imprimeMenu(){
		System.out.println("-> Con gusto te mostraré nuestro menú");
		System.out.println("\n**** M E N U    G E N E R A L  ****");
		menuGeneral();
		System.out.println("\n**** M E N U    D E L   D I A ****");
		menuDelDia();
		System.out.println("\n**** M E N U    D E   L U J O ****");
		menuDeLujo();
	}
	
       /**
       * Imprime el menu general       
       */
	public void menuGeneral(){
		Iterador iteradorGeneral =  menuGeneral.creaIterador();
		while(iteradorGeneral.hasNext()){
			System.out.println(iteradorGeneral.next());
		}
	}
	
       /**
       *Imprime el menu del dia      
       */
	public void menuDelDia(){
		Iterador iteradorDelDia =  menuDelDia.creaIterador();
		while(iteradorDelDia.hasNext()){
			System.out.println(iteradorDelDia.next());
		}
	}
	
       /**
       * Imprime el menu de lujo      
       */
	public void menuDeLujo(){
		 Iterador iteradorDeLujo =  menuDeLujo.creaIterador();
		while(iteradorDeLujo.hasNext()){
			System.out.println(iteradorDeLujo.next());
		}
	}
	
       /**
       * Guarda el ID de la orden del cliente
       *@param id
       *       
       */
	public void orden(String id){ 
		orden = id.toUpperCase();
	}

	/**
        * Método que busca la orden del cliente entre los menu
	*
        */
	public void ordenDelCliente(){ 
		if(orden.contains("MG")){	
			buscarMenuGeneral();
		}else if(orden.contains("MD")){	
			buscarMenuDelDia();
		}else if(orden.contains("ML")){ 
			buscarMenuDeLujo(); 
		}
	}

       /**
       * Busca la orden del cliente en el menu general    
       */
	public void buscarMenuGeneral(){
		Hamburguesa h;
		String id="";
		Iterador iteradorGeneral =  menuGeneral.creaIterador();
		while(iteradorGeneral.hasNext()){
				h = (Hamburguesa) iteradorGeneral.next();
				id = h.obtenerID();
				if(id.equals(orden)){
						burgerCliente= h;
				}
			}	
	}
	
       /**
       *Busca la orden del cliente en el menu del dia   
       */
	public void buscarMenuDelDia(){
		Hamburguesa h;
		String id="";
		Iterador iteradorDelDia =  menuDelDia.creaIterador();
		while(iteradorDelDia.hasNext()){
				h = (Hamburguesa) iteradorDelDia.next();
				id = h.obtenerID();
				if(id.equals(orden)){
						burgerCliente= h;
				}
			}	
		
	}
	
       /**
       *Busca la orden del cliente en el menu de lujo      
       */
	public void buscarMenuDeLujo(){
		Hamburguesa h;
		String id="";
		 Iterador iteradorDeLujo =  menuDeLujo.creaIterador();
		while(iteradorDeLujo.hasNext()){
				h = (Hamburguesa) iteradorDeLujo.next();
				id = h.obtenerID();
				if(id.equals(orden)){
						burgerCliente= h;
				}
			}	
	}
	
       /**
       * Metodo que devulve la hamburguesa que le cliente ordenó
       * @return burguerCliente      
       */

	public Hamburguesa obtenerPedido(){
		return burgerCliente;
	}
}
