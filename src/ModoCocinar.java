public class ModoCocinar implements EstadoRobot{
	Robot robot;
	
	public ModoCocinar(Robot r){
		robot = r;
	}
	
	public void suspender(){
		if(robot.estaActivo()){
			System.out.println("No puedo desactivarme en este momento");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
	public void activar(){
		if(robot.estaActivo()){
			System.out.println("Estoy activo");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
	public void caminar(){
		if(robot.estaActivo() && robot.puedeCocinar()){
			System.out.println("No puedo caminar porque estoy cocinando");
		}else if(robot.estaActivo() && !robot.puedeCocinar()) {
			System.out.println("No sé que cocinar si aún no ordenas");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
	public void atender(){
		if(robot.estaActivo() && robot.puedeCocinar()){
			System.out.println("EStoy ocupado con otro cliente");
		}else if(robot.estaActivo() && !robot.puedeCocinar()) {
			System.out.println("No sé que cocinar si aún no ordenas");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
	public void cocinar(){
		
		if(robot.estaActivo() && robot.puedeCocinar()){ //aqui se busca la hamburguesa y se llama al metodo prepararHamburguesa()
			System.out.println("---Preparando ando tu burger ---");
			robot.ordenDelCliente();
			Hamburguesa orden = robot.obtenerPedido();
			orden.prepararHamburguesa();
			robot.asignarNuevoEstado(robot.modoEntregar());
			robot.puedeCocinar(false);
			robot.yaCocino(true);
			System.out.println("---Cambiando a modo ENTREGAR... ---");
		}else if(robot.estaActivo() && !robot.puedeCocinar()) {
			System.out.println("No sé que cocinar si aún no ordenas");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
	public void entregar(){
		if(robot.estaActivo() && robot.puedeCocinar()){
			System.out.println("Permiteme cocinar primero antes de realizar tu entrega");
		}else if(robot.estaActivo() && !robot.puedeCocinar()) {
			System.out.println("No sé que cocinar si aún no ordenas");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
}