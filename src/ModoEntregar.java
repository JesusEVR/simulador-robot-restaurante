/**
 * Clase correspondiente al Modo Entregar del Robot.
 * Implementa los métodos de la interfaz EstadoRobot, los cuales son las acciones que el robot puede o no hacer.
 *
 * @author Supr-Lilito
 * @author paolasanv
 * @author JesusEVR
 * @version septiembre 2023
 *
 */
public class ModoEntregar implements EstadoRobot{
	/**
	 * Robot que realizará todos las acciones y tendrá diversos estados
	 */
	Robot robot;

	/**
	 * Constructor por parámetros del Modo Entregar
         * @param r El robot que será igual al atributo de la clase
	 *
	 */
	public ModoEntregar(Robot r){
		robot = r;
	}

	/**
	 * Metodo que cambia el estado del Robot a "Suspendido".
	 * Lo unico que puede hacer en dicho estado es activarse.
	 *
	 */
	public void suspender(){
		System.out.println("** MODO ENTREGAR **\n--- Solo puedo suspenderme hasta haberte entregado tu hamburguesa, carnalirijillo ---\n");

	}
	
	/**
	 * Metodo que activa al Robot.
	 * Pasa automáticamente al modo Caminar.
	 *
	 */
	public void activar(){
		System.out.println("** MODO ENTREGAR **\n--- Ya estoy activo bro, no hace falta volver a activarme ---\n");
	}

	/**
	 * Metodo que hace que el Robot se acerque a la mesa del cliente, mientras esta en modo Caminar.
	 * Lo unico que puede hacer mientras se acerca, o camina, es suspenderse.
         * Al llegar a la mesa del cliente, cambia al modo Atender.
	 *
	 */
	public void caminar(){
		System.out.println("** MODO ENTREGAR **\n--- No hace falta que camine mas, solo debo entregarte la orden ---\n");
	}

	/**
	 * Metodo que muestra al cliente los menus del restaurante para que ordene un platillo al robot.
         * Se necesita que el robot este en modo atender para hacerlo.
	 * Cuando el cliente ordena algo, el robot pasa al modo Cocinar.
	 *
	 */
	public void atender(){
		System.out.println("** MODO ENTREGAR **\n--- No puedo tomar otra orden hasta haberte entregado esta, no seas goloso ---\n");
	}

	/**
	 * Metodo que hace que el robot prepare la orden del cliente. Cuando termina cambia al modo Entregar.
         * Se muestran todos los pasos que el robot sigue para preparar la hamburguesa
	 * En el modo Cocinar no puede hacer nada mas que cocinar la hamburguesa.
	 *
	 */
	public void cocinar(){
		System.out.println("** MODO ENTREGAR **\n--- Ya cocine tu hamburguesa, solo deboe entregartela---\n");
	}

	/**
	 * Metodo que hace que el robot entregue la hamburguesa al comensal.
	 * Despues de entregar el pedido, regresa al modo "Suspendido"
	 *
	 */
	public void entregar(){
		System.out.println("--- ¡Aquí tiene su pedido, gracias por la compra! ---");
		robot.asignarNuevoEstado(robot.modoSuspendido());
		robot.yaCocino(false);
		System.out.println("--- Cambiando a modo S U S P E N D I D O ---\n");
	}
}
