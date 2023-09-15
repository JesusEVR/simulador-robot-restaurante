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
public class ModoCocinar implements EstadoRobot{
	/**
	 * Robot que realizará todos las acciones y tendrá diversos estados
	 */
	Robot robot;

	/**
	 * Constructor por parámetros del Modo Cocinar
         * @param r El robot que será igual al atributo de la clase
	 *
	 */
	public ModoCocinar(Robot r){
		robot = r;
	}

	/**
	 * Metodo que cambia el estado del Robot a "Suspendido".
	 * Lo unico que puede hacer en dicho estado es activarse.
	 *
	 */
	public void suspender(){
		System.out.println("** MODO COCINAR **\n--- En modo cocinar no puedo suspenderme ---\n");
	}

	/**
	 * Metodo que activa al Robot.
	 * Pasa automáticamente al modo Caminar.
	 *
	 */
	public void activar(){
		System.out.println("** MODO COCINAR **\n--- Ya estoy activo mi chavo ---\n");
	}

	/**
	 * Metodo que hace que el Robot se acerque a la mesa del cliente, mientras esta en modo Caminar.
	 * Lo unico que puede hacer mientras se acerca, o camina, es suspenderse.
         * Al llegar a la mesa del cliente, cambia al modo Atender.
	 *
	 */
	public void caminar(){
		System.out.println("** MODO COCINAR **\n--- Estoy a tu lado, esperando que me pidas cocinar tu orden ---\n");
	}

	/**
	 * Metodo que muestra al cliente los menus del restaurante para que ordene un platillo al robot.
         * Se necesita que el robot este en modo atender para hacerlo.
	 * Cuando el cliente ordena algo, el robot pasa al modo Cocinar.
	 *
	 */
	public void atender(){
		System.out.println("** MODO COCINAR **\n--- No puedo tomar otra orden hasta que te entregue la que pediste ---\n");
	}
	
	/**
	 * Metodo que hace que el robot prepare la orden del cliente. Cuando termina cambia al modo Entregar.
         * Se muestran todos los pasos que el robot sigue para preparar la hamburguesa
	 * En el modo Cocinar no puede hacer nada mas que cocinar la hamburguesa.
	 *
	 */
	public void cocinar(){
		
		if(robot.puedeCocinar()){ //aqui se busca la hamburguesa y se llama al metodo prepararHamburguesa()
			System.out.println("--- Preparando ando tu burger ---\n");
			robot.ordenDelCliente();
			Hamburguesa orden = robot.obtenerPedido();
			orden.prepararHamburguesa();
			robot.asignarNuevoEstado(robot.modoEntregar());
			robot.puedeCocinar(false);
			robot.yaCocino(true);
			System.out.println("--- Cambiando a modo E N T R E G A R ---");
		}else{
		}
	}
	
	/**
	 * Metodo que hace que el robot entregue la hamburguesa al comensal.
	 * Despues de entregar el pedido, regresa al modo "Suspendido"
	 *
	 */
	public void entregar(){
		System.out.println("** MODO COCINAR **\n--- Permiteme cocinar primero antes de realizar tu entrega ---\n");
	}
}
