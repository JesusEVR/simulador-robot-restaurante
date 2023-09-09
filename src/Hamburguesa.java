public abstract class Hamburguesa{
	
	private String ID;
	private String nombre;
	private String descripcion;
	private double precio;
	private boolean esVegetariano;
	
	
	public Hamburguesa(String ID, String nombre, String descripcion,double precio, boolean esVegetariano){
		this.ID = ID;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.esVegetariano = esVegetariano;
	}
	
	public void ponerPan(){
	}
	
	public void ponerMayonesa(){
	}
	
	public void ponerMostaza(){
	}
	
	public void ponerVegetales(){
	}
	
	public void ponerCatsup(){
	}
	
	public abstract void ponerQueso();
	public abstract void prepararCarne();
	public abstract void ponerCarne();
	
}