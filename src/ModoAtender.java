import java.util.Scanner;

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
		Scanner scan =  new Scanner(System.in);
		String opcion="";
		boolean idCorrecta=false;
		
		if(robot.estaActivo()){
			
			robot.imprimeMenu();
			
			while(!idCorrecta){
			System.out.print("¿Que deseas ordenar? Ingresa el ID del platillo: ");
			opcion = scan.nextLine();
				
				if(opcion.length()==4){
					if(opcion.toUpperCase().contains("MG") || opcion.toUpperCase().contains("MD") || opcion.toUpperCase().contains("ML")){ 
						if(opcion.contains("01") || opcion.contains("02") || opcion.contains("03")){ 
							idCorrecta = true;
							}else{ System.out.println("1 Esa opcion es inválida, seleccione una del menú");}	
					}else{System.out.println("2 Esa opcion es inválida, seleccione una del menú");}
				}else{ System.out.println("3 Esa opcion es inválida, seleccione una del menú");}
			}//end while
			
			robot.orden(opcion); //aqui se registra la orden 
			robot.puedeCocinar(true);
			robot.asignarNuevoEstado(robot.modoCocinar());
			
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