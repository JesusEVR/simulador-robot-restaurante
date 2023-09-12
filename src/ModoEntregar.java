public class ModoEntregar implements EstadoRobot{
	Robot robot;
	public ModoEntregar(Robot r){
		robot = r;
	}
	
	public void suspender(){
		if(robot.estaActivo()){
			System.out.println("Antes de hacer tu entrega primero debes ordenar");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
	public void activar(){
		if(robot.estaActivo()){
			System.out.println("Antes de hacer tu entrega primero debes ordenar");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
	public void caminar(){
		if(robot.estaActivo()){
			System.out.println("Antes de hacer tu entrega primero debes ordenar");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
	public void atender(){
		if(robot.estaActivo()){
			System.out.println("Antes de hacer tu entrega primero debes ordenar");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
	public void cocinar(){
		if(robot.estaActivo()){
			System.out.println("Antes de hacer tu entrega primero debes ordenar");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
	public void entregar(){
		if(robot.estaActivo() && robot.yaCocino()){
			System.out.println("Aquí tiene su pedido, gracias por compra");
			robot.asignarNuevoEstado(robot.modoSuspendido());
			robot.yaCocino(false);
			System.out.println("Cambiando a modo suspendido");
		}else if(robot.estaActivo() && !robot.yaCocino()){
			System.out.println("Antes de hacer tu entrega primero debes ordenar");
		}else{
			System.out.println("Estoy suspendido");
		}
	}
}