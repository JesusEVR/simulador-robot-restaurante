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
         * @param ID Cadena que contiene la ID de cada hamburguesa
	 * @param nombre Cadena con el nombre de la hamburguesa
         * @param descripcion Cadena que contiene una breve descripcion de la hamburguesa
         * @param precio El costo de cada hamburguesa (en pesos mexicanos)
         * @param esVegetariano Un valor booleano que detalla si la hamburguesa es vgetariana (1) o no lo es (0)
	 * @param tipoCarne El tipo de carne que tendra la hamburguesa
	 */
	public HamburguesaVegetariana(String ID, String nombre, String descripcion,double precio, boolean esVegetariano, String tipoCarne){
		super(ID, nombre, descripcion, precio, esVegetariano);
		this.tipoCarne = tipoCarne;
	}

	/**
	 * Metodo implementado que pregunta al comensal si quiere queso (no de origen animal) en su hamburguesa o no
         *
	 */
	public void ponerQueso(){
		String opcion;
		String o;
		boolean seguir=true;
			while(seguir){
				System.out.println("¿Desea queso en su hamburguesa? Sí = s, No = n");
				opcion = scan.nextLine();
				o = opcion.toLowerCase();
			
				if(o.equals("s")){
				System.out.println("De acuerdo, con queso");
					seguir=false;
				}else if(o.equals("n")){
					System.out.println("De acuerdo, sin queso");
					seguir=false;
				}	
			}	
	}

	/**
	 * Metodo implementado que detalla que se esta preparando la carne (vegetariana o no) de la hamburguesa
         *
	 */
	public void prepararCarne(){
		System.out.println("Preparando " +tipoCarne);
	}

	/**
	 * Metodo implementado que detalla que se esta poniendo la carne (vegetariana o no) de la hamburguesa
         *
	 */
	public void ponerCarne(){
		System.out.println("Poniendo " +tipoCarne);
	}
	
}
