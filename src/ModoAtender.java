/**
 * Clase correspondiente al Modo Atender del Robot.
 * Implementa los métodos de la interfaz EstadoRobot, los cuales son las acciones que el robot puede o no hacer.
 *
 * @author Supr-Lilito
 * @author paolasanv
 * @author JesusEVR
 * @version septiembre 2023
 *
 */

import java.util.Scanner;

public class ModoAtender implements EstadoRobot{
	/**
	 * Robot que realizará todos las acciones y tendrá diversos estados
	 */
	Robot robot;

	/**
	 * Constructor por parámetros del Modo Atender
         * @param r El robot que será igual al atributo de la clase
	 *
	 */
	public ModoAtender(Robot r){
		robot = r;
	}

	/**
	 * Metodo que cambia el estado del Robot a "Suspendido".
	 * Lo unico que puede hacer en dicho estado es activarse.
	 *
	 */
	public void suspender(){
		System.out.println("** MODO ATENDER **\n--- En modo atender no puedo suspenderme ---\n");
	}

	/**
	 * Metodo que activa al Robot.
	 * Pasa automáticamente al modo Caminar.
	 *
	 */
	public void activar(){
		System.out.println("** MODO ATENDER **\n--- Ya estoy activo hermanito, por algo estoy junto a ti ---\n");
	}

	/**
	 * Metodo que hace que el Robot se acerque a la mesa del cliente, mientras esta en modo Caminar.
	 * Lo unico que puede hacer mientras se acerca, o camina, es suspenderse.
         * Al llegar a la mesa del cliente, cambia al modo Atender.
	 *
	 */
	public void caminar(){
		System.out.println("** MODO ATENDER **\n--- Ya he caminado hasta tu mesa, papu. ¿O sera que no soy lo suficientemente notorio?\n");
	}

	/**
	 * Metodo que muestra al cliente los menus del restaurante para que ordene un platillo al robot.
         * Se necesita que el robot este en modo atender para hacerlo.
	 * Cuando el cliente ordena algo, el robot pasa al modo Cocinar.
	 *
	 */
	public void atender(){
		Scanner scan =  new Scanner(System.in);
		String opcion=  "";
		boolean idCorrecta = false;
		
		robot.imprimeMenu();
		
		while(!idCorrecta){
			System.out.print("\n¿Que deseas ordenar? Ingresa el ID del platillo: ");
			opcion = scan.nextLine();
			
			if(opcion.length()==4){
				if(opcion.toUpperCase().contains("MG") || opcion.toUpperCase().contains("MD") || opcion.toUpperCase().contains("ML")){ 
					if(opcion.contains("01") || opcion.contains("02") || opcion.contains("03")){ 
						idCorrecta = true;
					}else{ System.out.println("1 Esa opcion es inválida, seleccione una del menú");}	
				}else{System.out.println("2 Esa opcion es inválida, seleccione una del menú");}
			}else{ System.out.println("3 Esa opcion es inválida, seleccione una del menú");}
		} // Fin del ciclo while
		
		robot.orden(opcion); // Aqui se registra la orden 
		robot.puedeCocinar(true);
		robot.asignarNuevoEstado(robot.modoCocinar());
		System.out.println("--- Cambiando a modo C O C I N A R ---\n");
	}

	/**
	 * Metodo que hace que el robot prepare la orden del cliente. Cuando termina cambia al modo Entregar.
         * Se muestran todos los pasos que el robot sigue para preparar la hamburguesa
	 * En el modo Cocinar no puede hacer nada mas que cocinar la hamburguesa.
	 *
	 */
	public void cocinar(){
		System.out.println("** MODO ATENDER **\n--- No puedo cocinar si aún no ordenas ---\n");
	}

	/**
	 * Metodo que hace que el robot entregue la hamburguesa al comensal.
	 * Despues de entregar el pedido, regresa al modo "Suspendido"
	 *
	 */
	public void entregar(){
		System.out.println("** MODO ATENDER **\n--- No puedo entregarte tu platillo si aún no lo ordenas ---\n");
	}
}
