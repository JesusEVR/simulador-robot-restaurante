/**
 * Clase correspondiente al Modo Suspendido del Robot.
 * Implementa los métodos de la interfaz EstadoRobot, los cuales son las acciones que el robot puede o no hacer.
 *
 * @author Supr-Lilito
 * @author paolasanv
 * @author JesusEVR
 * @version septiembre 2023
 *
 */
public class ModoSuspendido implements EstadoRobot{
	/**
	 * Robot que realizará todos las acciones y tendrá diversos estados
	 */
	Robot robot;

	/**
	 * Constructor por parámetros del Modo Suspendido
         * @param r El robot que será igual al atributo de la clase
	 *
	 */
	public ModoSuspendido(Robot r){
		robot = r;
	}

	/**
	 * Metodo que cambia el estado del Robot a "Suspendido".
	 * Lo unico que puede hacer en este estado es activarse.
	 *
	 */
	public void suspender(){
		System.out.println("** MODO SUSPENDIDO **\nEn modo suspendido el robot no puede suspenderse de nuevo. ¿En qué pensabas?");
	}

	/**
	 * Metodo que activa al Robot.
	 * Pasa automáticamente al modo Caminar.
	 *
	 */
	public void activar(){
		robot.activarRobot(true);
		System.out.println("--- He sido activado ---");	
		robot.asignarNuevoEstado(robot.modoCaminar());
		System.out.println("--- Cambiando a modo C A M I N A R ---");
	}
	
	/**
	 * Metodo que hace que el Robot se acerque a la mesa del cliente, mientras esta en modo Caminar.
	 * Lo unico que puede hacer mientras se acerca, o camina, es suspenderse.
         * Al llegar a la mesa del cliente, cambia al modo Atender.
	 *
	 */
	public void caminar(){
		System.out.println("** MODO SUSPENDIDO **\nEn modo suspendido el robot no puede caminar");
	}

	/**
	 * Metodo que muestra al cliente los menus del restaurante para que ordene un platillo al robot.
         * Se necesita que el robot este en modo atender para hacerlo.
	 * Cuando el cliente ordena algo, el robot pasa al modo Cocinar.
	 *
	 */
	public void atender(){
		System.out.println("** MODO SUSPENDIDO **\nEn modo suspendido el robot no te puede atender");
	}

	/**
	 * Metodo que cambia el estado del Robot a "Cocinar".
	 * En este estado no puede hacer nada mas que cocinar la orden del cliente.
	 *
	 */
	public void cocinar(){
		System.out.println("** MODO SUSPENDIDO **\nEn modo suspendido el robot no te puede cocinar");
	}

	/**
	 * Metodo que cambia el estado del Robot a "Entregar".
	 * Despues de enregar el pedido del cliente, regresa a su estado "Suspendido"
	 *
	 */
	public void entregar(){
		System.out.println("** MODO SUSPENDIDO **\nEn modo suspendido el robot no te puede entregar ordenes");
	}
}
