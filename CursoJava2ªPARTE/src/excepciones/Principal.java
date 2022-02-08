package excepciones;

public class Principal {

	public static void main(String[] args) {
		int [] array = new int [20];

		try {
			
			//array [-3]=24;
			array [4]=22;
			//array [-5]=12;
			array [3]=55;
			
		} catch(Error e) {
			
			System.out.println(e);
		} finally {
			System.out.println("Ingresa en finally");
			
			System.out.println(array[3]);
			System.out.println(array[4]);
		}
		

	}

}
