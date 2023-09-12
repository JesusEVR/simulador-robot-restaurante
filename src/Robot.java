public class Robot{
	
	private EstadoRobot estadoActual;  //estado actual del robot
	
	private EstadoRobot modoSuspendido;
	private EstadoRobot modoCaminar;
	private EstadoRobot modoAtender;
	private EstadoRobot modoCocinar;
	private EstadoRobot modoEntregar;
	
	
	private boolean estaActivo = false; //verifica si ya se llamó a activar()
	private boolean puedeCocinar=false; //se vuelve true despues de llamar a atender()
	private String ordenDelCliente=""; //en esta se guarda el id de la hamburguesa que el cliente quiere ordenar
	private boolean yaCocino=false; //se hace true despues de haber llamado a cocinar() y se hace false despues de llamar a entregar()
	
	public Robot(){
		modoSuspendido= new ModoSuspendido(this);
		modoCaminar = new ModoCaminar(this);
		modoAtender = new ModoAtender(this);
		modoCocinar = new ModoCocinar(this);
		modoEntregar = new ModoEntregar(this);
		estadoActual = modoSuspendido;
	}
	
	public void yaCocino(boolean c){ //verifica si ya coció la orden del cliente
		yaCocino=c;
	}
	
	public boolean yaCocino(){
		return yaCocino;
	}
	
	public void puedeCocinar(boolean p){ //verifica si el robot puede cocinar despues de que el cliente ha ordenado
		puedeCocinar = p; 
	}
	
	public boolean puedeCocinar(){
		return puedeCocinar;
	}
	
	public void ordenDelCliente(String id){ //guarda la orden del cliente
		ordenDelCliente = id;
	}
	
	public String ordenDelCliente(){
		return ordenDelCliente;
	}
	
	public void desactivar(){ //desactica el robot
		estaActivo=false;
	}
	public boolean estaActivo(){ //verifica si el robot está activo o no
		return estaActivo;
	}
	
	public void activar(){
		estaActivo = true;
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
		estadoActual.cocinar();
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
	
	public void imprimeMenu(){ //en este se usan los iteradores 
		System.out.println("aqui va el menu");
	}
}