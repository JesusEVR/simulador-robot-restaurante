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
		System.out.println("No puedo hacer nada si no me has activado");
	}
	public void atender(){
		System.out.println("No puedo hacer nada si no me has activado");
	}
	public void cocinar(){
		System.out.println("No puedo hacer nada si no me has activado");
	}
	public void entregar(){
		System.out.println("No puedo hacer nada si no me has activado");
	}
}