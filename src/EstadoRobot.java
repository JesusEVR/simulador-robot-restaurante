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
	 * Metodo que cambia el estado del Robot a "Activado".
	 * En este estado puede caminar hacia el cliente que lo pida, o en su defecto suspenderse.
	 *
	 */
	public void activar();

	/**
	 * Metodo que cambia el estado del Robot a "Caminando".
	 * Lo unico que puede hacer en este estado es caminar o suspenderse.
	 *
	 */
	public void caminar();

	/**
	 * Metodo que cambia el estado del Robot a "Atendiendo".
	 * En este estado no puede hacer nada mas que atender al cliente.
	 *
	 */
	public void atender();

	/**
	 * Metodo que cambia el estado del Robot a "Cocinando".
	 * En este estado no puede hacer nada mas que cocinar la orden del cliente.
	 *
	 */
	public void cocinar();

	/**
	 * Metodo que cambia el estado del Robot a "Entregando".
	 * Despues de enregar el pedido del cliente, regresa a su estado "Suspendido"
	 *
	 */
        public void entregar();
}
