/**
 * Clase correspondiente al Modo Caminar del Robot.
 * Implementa los métodos de la interfaz EstadoRobot, los cuales son las acciones que el robot puede o no hacer.
 *
 * @author Supr-Lilito
 * @author paolasanv
 * @author JesusEVR
 * @version septiembre 2023
 *
 */
public class ModoCaminar implements EstadoRobot{
	/**
	 * Robot que realizará todos las acciones y tendrá diversos estados
	 */
	Robot robot;

	/**
	 * Constructor por parámetros del Modo Caminar
         * @param r El robot que será igual al atributo de la clase
	 *
	 */
	public ModoCaminar(Robot r){
		robot = r;
	}

	/**
	 * Metodo que cambia el estado del Robot a "Suspendido".
	 * Lo unico que puede hacer en dicho estado es activarse.
	 *
	 */
	public void suspender(){
		robot.asignarNuevoEstado(robot.modoSuspendido());
		robot.activarRobot(false);
		System.out.println("--- Cambiando a modo S U S P E N D I D O ---\nEs necesario volver a activar al robot.\n");
	}

	/**
	 * Metodo que activa al Robot.
	 * Pasa automáticamente al modo Caminar.
	 *
	 */
	public void activar(){
		System.out.println("** MODO CAMINAR **\n--- Ya estoy activo, papu. No puedo volver a activarme ---\n");
	}

	/**
	 * Metodo que hace que el Robot se acerque a la mesa del cliente, mientras esta en modo Caminar.
	 * Lo unico que puede hacer mientras se acerca, o camina, es suspenderse.}
         * Al llegar a la mesa del cliente, cambia al modo Atender.
	 *
	 */
	public void caminar(){
		System.out.println("--- He llegado a tu mesa, papu ---");
		robot.asignarNuevoEstado(robot.modoAtender());
		System.out.println("--- Cambiando a modo A T E N D E R ---\n");
	}

	/**
	 * Metodo que muestra al cliente los menus del restaurante para que ordene un platillo al robot.
         * Se necesita que el robot este en modo atender para hacerlo.
	 * Cuando el cliente ordena algo, el robot pasa al modo Cocinar.
	 *
	 */
	public void atender(){
		System.out.println("** MODO CAMINAR **\n--- En modo caminar no puedo atenderte, estoy lejos de ti ---\n");	
	}

	/**
	 * Metodo que hace que el robot prepare la orden del cliente. Cuando termina cambia al modo Entregar.
         * Se muestran todos los pasos que el robot sigue para preparar la hamburguesa
	 * En el modo Cocinar no puede hacer nada mas que cocinar la hamburguesa.
	 *
	 */
	public void cocinar(){
		System.out.println("** MODO CAMINAR **\n--- En modo caminar no puedo cocinarte, ni me has ordenado algo we ---\n");
	}

	/**
	 * Metodo que hace que el robot entregue la hamburguesa al comensal.
	 * Despues de entregar el pedido, regresa al modo "Suspendido"
	 *
	 */
	public void entregar(){
		System.out.println("** MODO CAMINAR **\n--- En modo caminar no puedo entregarte algo porque no he cocinado nada. A menos que quieras algo de aceite ---\n");
	}
}
