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
	 * Lo unico que puede hacer en este estado es activarse.
	 *
	 */
        public void suspender();

	/**
	 * Metodo que activa al Robot
	 * Pasa automáticamente al modo Caminar
	 *
	 */
	public void activar();

	/**
	 * Metodo que cambia el estado del Robot a "Caminar".
	 * Lo unico que puede hacer en este estado es caminar o suspenderse.
	 *
	 */
	public void caminar();

	/**
	 * Metodo que cambia el estado del Robot a "Atender".
	 * En este estado no puede hacer nada mas que atender al cliente.
	 *
	 */
	public void atender();

	/**
	 * Metodo que cambia el estado del Robot a "Cocinar".
	 * En este estado no puede hacer nada mas que cocinar la orden del cliente.
	 *
	 */
	public void cocinar();

	/**
	 * Metodo que cambia el estado del Robot a "Entregar".
	 * Despues de enregar el pedido del cliente, regresa a su estado "Suspendido"
	 *
	 */
        public void entregar();
}
