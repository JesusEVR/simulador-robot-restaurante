public class ModoAtender implements EstadoRobot{
	
	Robot robot;
	
	public ModoAtender(Robot r){
		robot = r;
	}
	
	public void suspender(){
		if(robot.estaActivo()){
			System.out.println("No puedo suspenderme, estoy atendiendo un cliente");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
	
	public void activar(){
		if(robot.estaActivo()){
			System.out.println("Ya estoy activo");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
	
	public void caminar(){
		if(robot.estaActivo()){
			System.out.println("No puedo suspenderme, te estoy atendiendo");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
	public void atender(){
		if(robot.estaActivo()){
			
			robot.imprimeMenu();
			System.out.println("¿Que deseas ordenar?");
			//aqui se registra la orden 
			robot.asignarNuevoEstado(robot.modoCocinar());
			//robot.ordenDelCliente(String IDdelCliente);
			robot.puedeCocinar(true);
			System.out.println("--- Cambiando a modo COCINAR... ---");
			
		}else{
			System.out.println("Estoy suspendido");
		}
	}
	public void cocinar(){
		if(robot.estaActivo()){
			System.out.println("No puedo cocinar si aún no ordenas");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
	public void entregar(){
		if(robot.estaActivo()){
			System.out.println("No puedo entregar tu orden si aún no ordenas");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
}