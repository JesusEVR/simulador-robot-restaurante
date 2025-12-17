import menus.*;
import estados.*;
import hamburguesas.*;

import java.util.Scanner;

public class Principal{
	
	public static void main(String[] args){
		
		Robot r = new Robot();
		Scanner sc = new Scanner(System.in);
		int opcion;

		System.out.println("Muy buenos dias, tardes o noches. señor usuario. ¡Bienvenido a McBurguesas!\n");
		System.out.println("Nuestro robot mesero (y cocinero) se encuentra en Modo Suspendido.\nA continuacion las acciones que puede hacer.\n");

		do{
			System.out.println("Por favor, inserta el numero de la opcion "
							+ "que deseas ejecutar:\n" + 
							"1.- Suspender\n" +
							"2.- Activar\n" + 
							"3.- Caminar\n" + 
							"4.- Atender\n" +
							"5.- Cocinar\n" +
							"6.- Entregar \n"+			   
							"0.- Salir del restaurante\n");
					
				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Por favor elige la opcion VALIDA "
							+ "que deseas ejecutar:\n" + 
							"1.- Suspender\n" +
							"2.- Activar\n" + 
							"3.- Caminar\n" + 
							"4.- Atender\n" +
							"5.- Cocinar\n" +
							"6.- Entregar \n"+			   
							"0.- Salir del restaurante\n");
					}
				}

				switch(opcion){
					case 1:
						r.suspender();
						break;

					case 2:
						r.activar();
						break;

					case 3:
						r.caminar();
						break;

					case 4:
						r.atender();
						break;

					case 5:
						r.cocinar();
						break;

					case 6:
						r.entregar();
						break;
					case 0:
						System.out.println("\n¡Hasta pronto! ¡Esperamos verlo nuevamente en McBurguesas!");
						break;

					default:
						System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
						break;

				}

		}while(opcion != 0);

		
		
	}
}
