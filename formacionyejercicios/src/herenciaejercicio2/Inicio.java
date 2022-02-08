package herenciaejercicio2;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Autobus bus=new Autobus("45465545","Volvo",545,51);
		System.out.println(bus.toString());
		Taxi taxi=new Taxi("4545545","Volvo",23321,5133);
		System.out.println(taxi.toString());
	}

}
