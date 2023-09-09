public abstract class Hamburguesa{
	
	 String ID;
	 String nombre;
	 String descripcion;
	 double precio;
	 boolean esVegetariano;
	
	public Hamburguesa(String ID, String nombre, String descripcion,double precio, boolean esVegetariano){
		this.ID = ID;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.esVegetariano = esVegetariano;
	}
	
	public String obtenerID(){
		return ID;
	}
	
	public void modificarID(String id){
		ID = id;
	}
	
	public String obtenerNombre(){
		return nombre;
	}
	
	public void modificarNombre(String n){
		nombre = n;
	}
	
	public String obtenerDescripcion(){
		return descripcion;
	}
	
	public void modificarDescripcion(String d){
		descripcion = d;
	}
	
	public double obtenerPrecio(){
		return precio;
	}
	
	public void modificarPrecio(double p){
		precio = p;
	}
	
	public boolean esVegetariano(){
		return esVegetariano;
	}
	
	public void ponerPan(){
		System.out.println("Poniendo pan");
	}
	
	public void ponerMayonesa(){
		System.out.println("Poniendo mayonesa");
	}
	
	public void ponerMostaza(){
		System.out.println("Poniendo mostaza");
	}
	
	public void ponerVegetales(){
		System.out.println("Poniendo vegetales");
	}
	
	public void ponerCatsup(){
		System.out.println("Poniendo catsup");
	}
	
	public abstract void ponerQueso();
	public abstract void prepararCarne();
	public abstract void ponerCarne();
	
	public void prepararHamburguesa(){
		ponerPan();
		ponerMayonesa();
		ponerMostaza();
		prepararCarne();
		ponerCarne();
		ponerQueso();
		ponerVegetales();
		ponerCatsup();
		ponerPan();
	}
	
	public String toString(){
		if(esVegetariano()) return "---"+ID + " Hamburguesa vegetariana " +nombre +"---"+"\n"  + "Descripcion: "+descripcion +"\n" +"Precio: $" + precio;
		return "---"+ID + "  Hamburguesa carnivora " +nombre+"---"+"\n" + "Descripcion: " +descripcion +"\n" +"Precio: $" + precio;
	}
}