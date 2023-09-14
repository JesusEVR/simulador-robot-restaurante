public class ModoSuspendido implements EstadoRobot{
	
	Robot robot;
	
	public ModoSuspendido(Robot r){
		robot = r;
	}
	
	public void suspender(){
		System.out.println("Estoy en modo suspendido");
	}
	public void activar(){
		if(!robot.estaActivo()){
			robot.activarRobot(true);
			System.out.println("---He sido activado---");	
			robot.asignarNuevoEstado(robot.modoCaminar());
			System.out.println("--- Cambiando a modo CAMINAR.... ---");
		}else{
			System.out.println("	¡Ya estoy activo!");	
		}
		
	}
	public void caminar(){
		if(robot.estaActivo()){
			System.out.println("Estoy trabajando, no me puedes desactivar");
		}else{
			System.out.println("No puedo hacer nada si no me has activado");
		}
	}
	public void atender(){
		if(robot.estaActivo()){
			System.out.println("Estoy trabajando, no me puedes desactivar");
		}else{
		System.out.println("No puedo hacer nada si no me has activado");
		}
	}
	public void cocinar(){
		if(robot.estaActivo()){
			System.out.println("Estoy trabajando, no me puedes desactivar");
		}else{
		System.out.println("No puedo hacer nada si no me has activado");
		}
	}
	public void entregar(){
		if(robot.estaActivo()){
			System.out.println("Estoy trabajando, no me puedes desactivar");
		}else{
		System.out.println("No puedo hacer nada si no me has activado");
		}
	}
}