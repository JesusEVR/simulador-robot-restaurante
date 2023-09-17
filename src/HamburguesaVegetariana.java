/**
 * Clase que define las hamburguesas vegetarianas. Hereda de la clase absracta 'Hamburguesa'
 *
 * @author Supr-Lilito
 * @author paolasanv
 * @author JesusEVR
 * @version septiembre 2023
 *
 */

import java.util.Scanner;

public class HamburguesaVegetariana extends Hamburguesa{
	/**
	 * Objeto de tipo Scanner para poder preguntar al usuario si desea queso en su hamburguesa
	 */
	private Scanner scan =  new Scanner(System.in);
	/**
	 * Especifica el tipo de carne que va a llevar la hamburguesa (ej. tofu)
	 */
	private String tipoCarne;

	/**
	 * Constructor por parametros de la hamburguesa vegetariana
         *
         * @param id Cadena que contiene la ID de cada hamburguesa
	 * @param nombre Cadena con el nombre de la hamburguesa
         * @param descripcion Cadena que contiene una breve descripcion de la hamburguesa
         * @param precio El costo de cada hamburguesa (en pesos mexicanos)
         * @param tieneQueso Un valor booleano que detalla si la hamburguesa tiene queso (1) o no (0)
         * @param esVegetariano Un valor booleano que detalla si la hamburguesa es vgetariana (1) o no lo es (0)
	 * @param tipoCarne El tipo de carne que tendra la hamburguesa
	 */
	public HamburguesaVegetariana(String id, String nombre, String descripcion, double precio, boolean tieneQueso, boolean esVegetariano, String tipoCarne){
		super(id, nombre, descripcion, precio, tieneQueso, esVegetariano);
		this.tipoCarne = tipoCarne;
	}

	/**
	 * Metodo implementado que detalla que se esta preparando la carne (vegetariana o no) de la hamburguesa
         *
	 */
	public void prepararCarne(){
		System.out.println("--- Preparando la carne vegetariana de " +tipoCarne+ " ---");
	}

	/**
	 * Metodo implementado que detalla que se esta poniendo la carne (vegetariana o no) de la hamburguesa
         *
	 */
	public void ponerCarne(){
		System.out.println("--- Poniendo la carne vegetariana de " +tipoCarne+ " ---");
	}
}
