public class Robot{
	
	private EstadoRobot estadoActual;  //estado actual del robot
	private EstadoRobot modoSuspendido;
	private EstadoRobot modoCaminar;
	private EstadoRobot modoAtender;
	private EstadoRobot modoCocinar;
	private EstadoRobot modoEntregar;
	private boolean puedeCocinar; //se vuelve true despues de llamar a atender()
	private boolean yaCocino; //se hace true despues de haber llamado a cocinar() y se hace false despues de llamar a entregar()
	private Menu menuDeLujo;
	private Menu menuDelDia;
	private Menu menuGeneral;
	private String orden = "";
	private Hamburguesa burgerCliente;
	
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
	
	public void yaCocino(boolean c){ //verifica si ya cocinó la orden del cliente
		yaCocino=c;
	}
	
	public boolean yaCocino(){
		return yaCocino;
	}
	
	public void puedeCocinar(boolean p){  //asigna true si el robot ya cocinó despues de que el cliente ordenó
		puedeCocinar = p; 
	}
	
	public boolean puedeCocinar(){ //verifica si el robot puede cocinar despues de que el cliente ha ordenado
		return puedeCocinar;
	}
	
	public void activar(){
		estadoActual.activar();
	}
	
	public void atender(){
		estadoActual.atender();
	}
	
	public void cocinar(){
		estadoActual.cocinar();
	}
	
	public void entregar(){
		estadoActual.entregar();
	}
	
	public void suspender(){
		estadoActual.suspender();
	}
	
	public void caminar(){
		estadoActual.caminar();
	}
	
	public void asignarNuevoEstado(EstadoRobot nuevoEstado){
		estadoActual = nuevoEstado;
	}
	
	//Estos metodos solo devuelven un modo del robot para fines practicos (se usan en las clases ModoAtender/ModoCaminar.. etc)
	public EstadoRobot modoSuspendido(){
		return modoSuspendido;
	}
	
	public EstadoRobot modoCaminar(){
		return modoCaminar;
	}
	
	public EstadoRobot modoAtender(){
		return modoAtender;
	}

	public EstadoRobot modoCocinar(){
		return modoCocinar;
	}

	public EstadoRobot modoEntregar(){
		return modoEntregar;
	}
	
	public void imprimeMenu(){
		System.out.println("-> Con gusto te mostraré nuestro menú");
		System.out.println("**** M E N U    G E N E R A L  ****");
		menuGeneral();
		System.out.println("**** M E N U    D E L   D I A ****");
		menuDelDia();
		System.out.println("**** M E N U    D E   L U J O ****");
		menuDeLujo();
	}
	
	public void menuGeneral(){
		Iterador iteradorGeneral =  menuGeneral.creaIterador();
		while(iteradorGeneral.hasNext()){
			System.out.println(iteradorGeneral.next());
		}
	}
	
	public void menuDelDia(){
		Iterador iteradorDelDia =  menuDelDia.creaIterador();
		while(iteradorDelDia.hasNext()){
			System.out.println(iteradorDelDia.next());
		}
	}
	
	public void menuDeLujo(){
		 Iterador iteradorDeLujo =  menuDeLujo.creaIterador();
		while(iteradorDeLujo.hasNext()){
			System.out.println(iteradorDeLujo.next());
		}
	}
	
	public void orden(String id){ //guarda el id de la orden
		orden = id.toUpperCase();
	}
	
	public void ordenDelCliente(){ //busca la hamburguesa que el cliente quiere
		if(orden.contains("MG")){	//la hamburguesa esta el menu general
			buscarMenuGeneral();
		}else if(orden.contains("MD")){	 //la hamburguesa esta en el menu del dia
			buscarMenuDelDia();
		}else if(orden.contains("ML")){ //la hamburguesa esta es del menu de lujo
			buscarMenuDeLujo(); 
		}
	}

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
	
	public Hamburguesa obtenerPedido(){ //devuelve la hamburguesa que quiere el cliente
		return burgerCliente;
	}
}
