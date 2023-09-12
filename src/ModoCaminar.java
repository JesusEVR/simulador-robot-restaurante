public class ModoCaminar implements EstadoRobot{
	
	Robot robot;
	
	public ModoCaminar(Robot r){
		robot = r;
	}
	
	public void suspender(){
		if(robot.estaActivo()){
			robot.asignarNuevoEstado(robot.modoSuspendido());
			robot.desactivar();
			System.out.println("---Cambiando a modo suspendido---");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
	public void activar(){
		if(robot.estaActivo()){
			System.out.println("Estoy activo");
		}else{
			System.out.println("No puedo hacer nada si no me has activado");
		}
	}
	public void caminar(){
		if(robot.estaActivo()){
			System.out.println("Estoy caminando");
		}else{
			System.out.println("No puedo hacer nada si no me has activado");
		}
	}
	public void atender(){
		if(robot.estaActivo()){
			robot.asignarNuevoEstado(robot.modoAtender());
			System.out.println("---Cambiando a modo atendiendo---");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
	public void cocinar(){
		if(robot.estaActivo()){
			System.out.println("No puedo cocinar si no has ordenado");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
	public void entregar(){
		if(robot.estaActivo()){
			System.out.println("No puedo entregar tu orden si no has ordenado");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
}