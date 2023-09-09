public class HamburguesaVegetariana extends Hamburguesa{

	private String tipoCarne; //Especifica el tipo de carne que va a llevar (ej. tofu)
	
	public HamburguesaVegetariana(String ID, String nombre, String descripcion,double precio, boolean esVegetariano, String tipoCarne){
		super(ID, nombre, descripcion, precio, esVegetariano);
		this.tipoCarne = tipoCarne;
		
	}
	
	public void ponerQueso(){
	}
	public void prepararCarne(){
	}
	public void ponerCarne(){
	}
	
}