/**
 * Interfaz con los diversos estados del Robot perteneciente al restaurante 'McBurguesas'.
 *
 * @author Supr-Lilito
 * @author paolasanv
 * @author JesusEVR
 * @version septiembre 2023
 *
 */
public interface EstadoRobot{
	
	/**
	 * Metodo que cambia el estado del Robot a "Suspendido".
	 * Lo unico que puede hacer en dicho estado es activarse.
	 *
	 */
        public void suspender();

	/**
	 * Metodo que activa al Robot.
	 * Pasa automáticamente al modo Caminar.
	 *
	 */
	public void activar();

	/**
	 * Metodo que hace que el Robot se acerque a la mesa del cliente, mientras esta en modo Caminar.
	 * Lo unico que puede hacer mientras se acerca, o camina, es suspenderse.
         * Al llegar a la mesa del cliente, cambia al modo Atender.
	 *
	 */
	public void caminar();

	/**
	 * Metodo que muestra al cliente los menus del restaurante para que ordene un platillo al robot.
         * Se necesita que el robot este en modo atender para hacerlo.
	 * Cuando el cliente ordena algo, el robot pasa al modo Cocinar.
	 *
	 */
	public void atender();

	/**
	 * Metodo que hace que el robot prepare la orden del cliente. Cuando termina cambia al modo Entregar.
         * Se muestran todos los pasos que el robot sigue para preparar la hamburguesa
	 * En el modo Cocinar no puede hacer nada mas que cocinar la hamburguesa.
	 *
	 */
	public void cocinar();

	/**
	 * Metodo que hace que el robot entregue la hamburguesa al comensal.
	 * Despues de entregar el pedido, regresa al modo "Suspendido"
	 *
	 */
        public void entregar();
}
