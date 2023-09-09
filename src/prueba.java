public class prueba{
	
	public static void main(String[] args){
		Hamburguesa h = new HamburguesaCarnivora("00","ham01", "hamburguesa de res", 12.4, false, "res");
		Hamburguesa h2 = new HamburguesaVegetariana("01","ham02", "hamburguesa de tofu", 12.4, true, "tofu");
		System.out.println(h);
		h.prepararHamburguesa();
		System.out.println(" ");
		System.out.println(h2);
		h2.prepararHamburguesa();
	}
}