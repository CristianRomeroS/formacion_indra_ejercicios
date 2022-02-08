package herencia.ejerc1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Empleado empl1 = new Comercial("Juan", 33, 2300, 3000);
		Empleado empl2 = new Comercial("Raquel", 22, 1600, 279.7);
		Empleado empl3 = new Repartidor ("Maria", 23, 1540, "zona 3");
		Empleado empl4 = new Repartidor ("Pedro", 43, 1589, "zona 2");
		
		System.out.println("----- COMERCIALES -----");
		
		empl1.plus();
		empl2.plus();
		System.out.println("\n----- Comercial uno -----");

		System.out.println(empl1.toString());
		System.out.println("\n----- Comercial dos -----");

		System.out.println(empl2.toString());
		
		System.out.println("\n----- REPARTIDORES -----");
		empl3.plus();
		empl4.plus();
		System.out.println("\n----- Repartidor uno -----");
		System.out.println(empl3.toString());
		System.out.println("\n----- Repartidor dos -----");
		System.out.println(empl4.toString());
	}

}
