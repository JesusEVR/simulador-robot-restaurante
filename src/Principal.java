import java.util.Scanner;

public class Principal{
	
	public static void main(String[] args){

		Hamburguesa h = new HamburguesaCarnivora("00","ham01", "hamburguesa de res", 12.4, false, "res");
		Hamburguesa h2 = new HamburguesaVegetariana("01","ham02", "hamburguesa de tofu", 12.4, true, "tofu");
		
		/*System.out.println(h);
		h.prepararHamburguesa();
		System.out.println(" ");
		System.out.println(h2);
		h2.prepararHamburguesa();*/
		
		/*MenuGeneral m = new MenuGeneral();
		MenuDeLujo m2 = new MenuDeLujo();
		MenuDelDia m3 = new MenuDelDia();
		m3.agregarHamburguesa(h);
		m3.agregarHamburguesa(h2);
		m2.agregarHamburguesa(h.obtenerID(),h);
		
		Iterador ite = m.creaIterador();
		
		System.out.println("--> Menu general");
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		
		Iterador i = m2.creaIterador();
		
		System.out.println("\n"+"--> Menu de lujo");
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
		Iterador it = m3.creaIterador();
		System.out.println("\n"+"----> Menu del dia");
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		Menu m1 = new MenuGeneral();
		Menu m2 = new MenuDelDia();
		Menu m3 = new MenuDeLujo();
	
		Robot r = new Robot(m1, m2, m3);
			Scanner sc = new Scanner(System.in);
		int opcion;

		System.out.println("Muy buenos dias, tardes o noche señor usuario. ¡Bineveniodo a Mcburguesas!");
		System.out.println("Nuestro robot mesero y cocinero se encuentra en Modo Suspendido.\n¡A continuacion las acciones que puede hacer!");

		do{
			System.out.println("Por favor elige la opcion "
							+ "que deseas ejecutar.\n" + 
							"1.- Suspender.\n" +
							"2.- Activar.\n" + 
							"3.- Caminar.\n" + 
							"4.- Atender.\n" +
							"5.- Cocinar.\n" +
							"6.- Entregar \n"+			   
							"0.- Terminar simulacion.\n");
					
				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Por favor elige la opcion VALIDA "
							+ "que deseas ejecutar.\n" + 
							"1.- Suspender.\n" +
							"2.- Activar.\n" + 
							"3.- Caminar.\n" + 
							"4.- Atender.\n" +
							"5.- Cocinar.\n" +
							"6.- Entregar \n"+			   
							"0.- Terminar simulacion.\n");
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
						break;

					default:
						System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
						break;

				}

		}while(opcion != 0);

		
		
	}
}
