import java.util.Scanner;

public class HamburguesaCarnivora extends Hamburguesa{

	private Scanner scan =  new Scanner(System.in);
	private String tipoCarne; //Especifica el tipo de carne que va a llevar (ej. res)
	
	public HamburguesaCarnivora(String ID, String nombre, String descripcion,double precio, boolean esVegetariano, String tipoCarne){
		super(ID, nombre, descripcion, precio, esVegetariano);
		this.tipoCarne = tipoCarne;
	}
	
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
	public void prepararCarne(){
		System.out.println("Preparando la carne de " +tipoCarne);
	}
	public void ponerCarne(){
		System.out.println("Poniendo la carne de " +tipoCarne);
	}
	
}